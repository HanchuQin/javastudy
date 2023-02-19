package demo.oop;

import demo.oop.classdemo.friend;
import demo.oop.classdemo.person;
import demo.oop.classdemo.student;

public class application {
    public static void main(String[] args) {
        //将main方法移动到外面的包来了，所以以下注释的内容会因为属性私有了且没有设置public方法而无法调用
//        person wangwu = new person();
//        wangwu.age=3;
//        wangwu.name= "steve";
//        wangwu.sex="man";
//        System.out.println(wangwu.a());
//        但是student类设置了public方法，可以进行调用
        student zhaodehan = new student();
        zhaodehan.setAge(2);

        friend xueshengxiaoming = new friend();
        xueshengxiaoming.say();
    }
}
