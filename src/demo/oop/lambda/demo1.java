package demo.oop.lambda;

import java.util.function.Predicate;

import static jdk.internal.vm.PostVMInitHook.run;

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

    public void test03(){

    Predicate<> predicate = 

    }

}
