package QuadraticEquation;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class QuadraticEquation implements Function<List<Double>, List<Double>> {

    @Override
    public  List<Double> apply(List<Double> coefficients) {
        List<Double> roots = new ArrayList<>();


        double a = coefficients.get(0);
        double b = coefficients.get(1);
        double c = coefficients.get(2);

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            roots.add(root1);
            roots.add(root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            roots.add(root);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);

            roots.add(realPart + imaginaryPart);
            roots.add(realPart - imaginaryPart);
        }

        return roots;
    }

}
