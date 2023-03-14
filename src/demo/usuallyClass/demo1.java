package demo.usuallyClass;

import demo.oop.classdemo.friend;

public class demo1 {

    class Employee implements Cloneable {
        public Object clone() throws CloneNotSupportedException {
            Employee cloned = (Employee) super.clone();
            friend f1 = new friend();

            return cloned;
        }


    }


}
