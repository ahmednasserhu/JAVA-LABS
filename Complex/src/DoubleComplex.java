public class DoubleComplex implements Complex<Double>{
    private Double real;
    private  Double imaginary;

    public DoubleComplex(Double real, Double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    @Override
    public Complex<Double> add(Complex<Double> num) {
        return new DoubleComplex(this.real + num.getReal(), this.imaginary + num.getImaginary());
    }

    @Override
    public Complex<Double> subtract(Complex<Double> num) {
        return new DoubleComplex(this.real - num.getReal(), this.imaginary - num.getImaginary());
    }

    @Override
    public Complex<Double> multiply(Complex<Double> num) {
        double newReal = (this.real * num.getReal()) - (this.imaginary * num.getImaginary());
        double newImaginary = (this.real * num.getImaginary()) + (this.imaginary * num.getReal());
        return new DoubleComplex(newReal, newImaginary);
    }

    @Override
    public Double getReal() {
        return real;
    }

    @Override
    public Double getImaginary() {
        return imaginary;
    }
    public String toString() {
        return real + " + " + imaginary + "j";
    }
}
