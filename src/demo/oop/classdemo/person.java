package demo.oop.classdemo;

public class person {
   String name;
   int age;
   String sex;

//无参构造
   public person() {
   }

//有参构造
   public person(String name, int age, String sex) {
      this.name = name;
      this.age = age;
      this.sex = sex;
   }


   public  void say(){
      System.out.println("Person类在叫");
   }



}
