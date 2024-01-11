import javax.print.DocFlavor;

public class IntegerComplex implements Complex<Integer>{

    private Integer real;
    private Integer imaginary;

    public IntegerComplex(Integer real, Integer imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    @Override
    public Complex<Integer> add(Complex<Integer> num) {
        return new IntegerComplex(this.real + num.getReal(), this.imaginary + num.getImaginary());
    }

    @Override
    public Complex<Integer> subtract(Complex<Integer> num) {
        return new IntegerComplex(this.real - num.getReal(), this.imaginary - num.getImaginary());
    }

    @Override
    public Complex<Integer> multiply(Complex<Integer> num) {
        int newReal = (this.real * num.getReal()) - (this.imaginary * num.getImaginary());
        int newImaginary = (this.real * num.getImaginary()) + (this.imaginary * num.getReal());
        return new IntegerComplex(newReal, newImaginary);
    }

    @Override
    public Integer getReal() {
        return real;
    }

    @Override
    public Integer getImaginary() {
        return imaginary;
    }
    @Override
    public String toString(){
        return real + " + " + imaginary + "j";
    }
}
