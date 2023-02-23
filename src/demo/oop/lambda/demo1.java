package demo.oop.lambda;

public class demo1 {


    static void test(){
        System.out.println("run....");
        return ;
    };

    static void test02() {
        final Runnable runnable = () -> System.out.println("run...");//lambda
    }

    public static void main(String[] args) {
    //test();

    test02();

    }



}
