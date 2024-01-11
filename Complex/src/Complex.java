public interface Complex<T extends Number> {
    Complex<T> add(Complex<T> num);
    Complex<T> subtract(Complex<T> num);
    Complex<T> multiply(Complex<T> num);

    T getReal();
    T getImaginary();
    String toString();
}
