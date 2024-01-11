
interface printable{
    void print(String msg);
}

class methodReference{
    void display(String msg){
        System.out.println(msg.toUpperCase());
    }
}

public class Main  {
    public static void main(String[] args) {

//        NumericTest lessThan;
//
//        lessThan = (n, d) -> n < d;
//        if(lessThan.test(15,20)) {
//            System.out.println("the fisrt number is smaller than the second number");
//        }
//        else{
//            System.out.println("the second number is smaller than the first number");
//        }

//        NumericTest absValue;
//        absValue = (n, m) -> (n < 0 ? -n : n) == (m < 0 ? -m : m);
//        if (absValue.test(12, -12)) {
//            System.out.println("the first number is the absolute number of the second number");
//        }
//        else{
//            System.out.println("wrong input for this case");
//        }

        methodReference inst = new methodReference();
        printable print = inst::display;

        print.print("hello world");


    }

    }