public class Main {
    public static void main(String[] args) {

        String str = "ahmed nasser";
        if(OnlyAlphabet.isAlphabet(str, Character::isLetter)){
            System.out.println("this string contains only alphabetic letters");
        }
        else{
            System.out.println("this string contains numbers and characters");
        }
    }
}