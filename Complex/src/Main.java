public class Main {
    public static void main(String[] args) {
        Complex<Double> doubleComplex1 = new DoubleComplex(2.0, 3.0);
        Complex<Double> doubleComplex2 = new DoubleComplex(1.0, 2.0);

        Complex<Integer> intComplex1 = new IntegerComplex(17, 3);
        Complex<Integer> intComplex2 = new IntegerComplex(12, 2);

        System.out.println("Double Complex Addition: " + doubleComplex1.add(doubleComplex2));
        System.out.println("Double Complex Subtraction: " + doubleComplex1.subtract(doubleComplex2));
        System.out.println("Double Complex Multiplication: " + doubleComplex1.multiply(doubleComplex2));

        System.out.println("Integer Complex Addition: " + intComplex1.add(intComplex2));
        System.out.println("Integer Complex Subtraction: " + intComplex1.subtract(intComplex2));
        System.out.println("Integer Complex Multiplication: " + intComplex1.multiply(intComplex2));
    }
}