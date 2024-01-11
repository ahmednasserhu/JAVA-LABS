import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        InMemoryWorldDao dao = InMemoryWorldDao.getInstance();

        List<Country> countries = dao.getCountries().values().stream()
                .collect(Collectors.toList());


// First Question
List<City> highestPopulatedCities = countries.stream().map(country -> country.getCities().stream()
        .max(Comparator.comparingInt(City::getPopulation)).orElse(null)).collect(Collectors.toList());

System.out.println(highestPopulatedCities);

// Second Question
List<City> mostPopulatedCityForEachContinent = countries.stream().collect(Collectors.groupingBy(Country::getContinent,
        Collectors.flatMapping(country -> country.getCities().stream(),
                Collectors.maxBy(Comparator.comparingInt(City::getPopulation)))))
        .values()
        .stream()
        .filter(Optional::isPresent)
        .map(Optional::get)
        .collect(Collectors.toList());

        System.out.println(mostPopulatedCityForEachContinent);

// Third Question
        Optional<City> highestPopulatedCapital = countries.stream()
                .filter(country -> country.getCapital() != 0)
                .map(country -> country.getCities().stream()
                        .filter(city -> city.getId() == country.getCapital())
                        .max(Comparator.comparingInt(City::getPopulation)))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .max(Comparator.comparingInt(City::getPopulation));

        System.out.println(highestPopulatedCapital);
        
    }

}