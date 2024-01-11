public class ThrowExceptions {
    public static double division(double num1, double num2) throws CustomException{
        if(num2==0) {
            throw new CustomException("division by zero is not allowed");
        }
        return num1/num2;
    }

    public static double squareRoot(double num) throws CustomException{
        if(num < 0){
            throw new CustomException("You can not calculate the sqrt for a negative number");
        }
        return Math.sqrt(num);
    }

    public static double difference(double num1, double num2) throws CustomException{
        if(num1<num2){
            throw new CustomException("Difference can not be negative");
        }
        return num1-num2;
    }

}
