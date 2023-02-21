package demo.oop;

import demo.oop.classdemo.friend;
import demo.oop.classdemo.Person;
import demo.oop.classdemo.Student;

public class application {
    public static void main(String[] args) {
        //将main方法移动到外面的包来了，所以以下注释的内容会因为属性私有了且没有设置public方法而无法调用
        Person wangwu = new Person("s",28,"man");
//        wangwu.age=3;
//        System.out.println(wangwu.a());
//        但是student类设置了public方法，可以进行调用


        friend xueshengxiaoming = new friend();
        xueshengxiaoming.say();

        Person s1 = new Student();//引用类型转换
        System.out.println(s1 instanceof Person);//用instanceof 判断两者是否具有父子关系，返回boolean
        //对象名 instanceof 类名 判断对象是否与类存在父子关系
        //多态时：父类与子类转换
        //1.从小到大 自动转换 右边赋值给左边
                Person wang= new Student();
        //        大                   小
        //2.从大到小 强制转换 右边赋值给左边
                Student zhang = (Student) new Person();
        //            小                   大

    }
}
