import java.util.function.BiPredicate;

public class StringUtils {

    public static String betterString(String str1, String str2, BiPredicate<String, String> predicate){
        if(predicate.test(str1, str2)){
            return str1;
        }
        return str2;
    }
    public static boolean contains(String str1, String str2){
        return str1.contains(str2);
    }

}
