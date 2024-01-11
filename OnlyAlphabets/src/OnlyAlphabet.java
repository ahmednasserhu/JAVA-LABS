import java.util.function.Predicate;

public class OnlyAlphabet {

    public static boolean isAlphabet(String sentence, Predicate<Character> p){
        boolean flag = false;
        for (int i = 0 ; i < sentence.length();i++){
            char ch = sentence.charAt(i);
            if(!p.test(ch)) {
                flag = true;
            }
        }
        return flag;
    }
}
