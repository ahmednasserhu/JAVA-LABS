import java.util.*;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Dictionary {


    private TreeMap<Character, TreeSet<String>> dict;

    public Dictionary(TreeMap<Character, TreeSet<String>> dict) {
        this.dict = dict;
    }

    public void removeWord(String word) {
        Iterator<Map.Entry<Character, TreeSet<String>>> iterator = dict.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Character, TreeSet<String>> entry = iterator.next();
            if (entry.getValue().contains(word)){
                entry.getValue().remove(word);
                break;
            }
        }
    }

    public void removeall(Character key) {
        if (dict.containsKey(key)) {
            dict.remove(key);
        }
    }

    public void insertIntoTree(String... words) {
        for (String word : words) {
            word = word.toLowerCase();
            Character key = Character.toUpperCase(word.charAt(0));
            dict.computeIfAbsent(key, k -> new TreeSet<>()).add(word);
        }
    }

    public void getKey(Character key) {
        TreeSet<String> values = dict.get(key);

        if (values != null) {
            System.out.println("Key: " + key);
            System.out.println("Values: " + values);
        } else {
            System.out.println("Key '" + key + "' not found in the dictionary.");
        }
    }
    public void search(String regexPattern) {
        Pattern pattern = Pattern.compile(regexPattern);
        boolean matchFound = false;

        for (Map.Entry<Character, TreeSet<String>> entry : dict.entrySet()) {
            for (String word : entry.getValue()) {
                Matcher matcher = pattern.matcher(word);
                if (matcher.find()) {
                    System.out.println("Match found for pattern '" + regexPattern + "' in key " + entry.getKey() + ": " + word);
                    matchFound = true;
                }
            }
        }

        if (!matchFound) {
            System.out.println("No match found for pattern '" + regexPattern + "'.");
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for (Map.Entry<Character, TreeSet<String>> entry : dict.entrySet()) {
            result.append(entry.getKey()).append(": ").append(entry.getValue()).append(", \n");
        }

        result.append("]");
        return result.toString();
    }


//    @Override
//    public String toString() {
//        return "Dictionary{" +
//                "dict=" + dict +
//                '}';
//    }
}
