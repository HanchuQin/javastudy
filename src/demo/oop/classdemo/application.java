package demo.oop.classdemo;

public class application {
    public static void main(String[] args) {
        person wangwu = new person();
        wangwu.age=3;
        wangwu.name= "steve";
        wangwu.sex="man";
        System.out.println(wangwu.a());

        person zhaoshan = new person();
        zhaoshan.name="zhaosan";
        zhaoshan.age=55;
        System.out.println(zhaoshan.name);



    }
}
