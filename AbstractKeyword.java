/*abstract class Animal //abstarct class doesn't have any object
{
    abstract void sound();//abstarct method just have declaration no body
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog is barking");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("Cat meoms");
    }
}
public class AbstractKeyword{
    public static void main(String [] args){
Dog d=new Dog();
Cat c=new Cat();
d.sound();
c.sound();
    }
}*/
//Inner class in java
/*class A{
    int age;
    public void show(){
        System.out.println("in show");
    }
    class B{
        public void config(){
            System.out.println("in config");
        }
    }
}
public class AbstractKeyword{
    public static void main(String [] args){
A obj=new A();
obj.show();
A.B obj1=obj.new B();
obj1.config();
    }
}*/
//Anonyms inner class
/*class A{
    public void show(){
        System.out.println("in a show");
    }
}
public class AbstractKeyword{
    public static void main(String[] args){
        A obj=new A(){
public void show(){
    System.out.println("in new show");
}
        };
        obj.show();
    }
}*/
//Abstract and anonymous inner class
abstract class A{
    public abstract void show();
    public abstract void config();
}
public class AbstractKeyword{
    public static void main(String [] args){
        A obj=new A(){
            public void show(){
System.out.println("in show");
            }
            public void config(){
                System.out.println("in config");
            }
        };
        obj.show();
        obj.config();
    }
}
