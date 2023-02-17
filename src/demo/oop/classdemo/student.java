package demo.oop.classdemo;

public class student {
    private int xuehao;
    private String name;
    int age;


    public int getXuehao() {
        return xuehao;
    }

    public void setXuehao(int xuehao) {
        this.xuehao = xuehao;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<120 || age>0){
            this.age = age;
        }else this.age=0;
    //方法重载
//
//    public void setAge(int age ,String name){
//
//        };

    }
}
