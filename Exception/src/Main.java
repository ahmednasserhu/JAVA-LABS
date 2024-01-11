public class Main {
    public static void main(String[] args) {

        double num1 = 20.0;
        double num2 = 10.0;

        try {
            double result = ThrowExceptions.division(20.0,0.0);
            System.out.println(result);
        }
        catch (Exception ex){
            System.out.println("Caught an exception: " + ex.getMessage());
        }
        finally {
            System.out.println("i have passed the division exception");
        }

        try {
            double result = ThrowExceptions.difference(5.0,15.0);
            System.out.println(result);
        } catch (CustomException ex) {
            System.out.println("Caught an exception: " + ex.getMessage());
        }
        finally {
            System.out.println("i have passed the difference exception");
        }


        try {
            double result = ThrowExceptions.squareRoot(25.0);
            System.out.println(result);
        } catch (CustomException ex) {
            System.out.println("Caught an exception: " + ex.getMessage());
        }
        finally {
            System.out.println("i have passed the square root exception");
        }

    }
}