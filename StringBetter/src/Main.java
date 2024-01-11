public class Main {
    public static void main(String[] args) {

        String str1 = "Generic Functional Interface";
        String str2 = "ahmed";

        String result = StringUtils.betterString(str1, str2, StringUtils::contains);
        System.out.println("this will print the first string if it contains the second string, and the second string if not");
        System.out.println(result);

        System.out.println("================================");

        String result2 = StringUtils.betterString(str1, str2, (s1,s2) -> s1.length() > s2.length());
        System.out.println("this will print the first string if it's length bigger than the second one");
        System.out.println(result2);
    }
}