package demo.oop.classdemo;
public class Person {//类 'Person' 为 public，应在文件 'Person.java' 中声明,其实就是类名与java文件名大小写没有保持一致
   String name;
   int age;
   String sex;

//无参构造
   public Person() {
   }

//有参构造
   public Person(String name, int age, String sex) {
      this.name = name;
      this.age = age;
      this.sex = sex;
   }


   public  void say(){
      System.out.println("Person类在叫");
   }



}
