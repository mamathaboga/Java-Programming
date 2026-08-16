//static variable
/*class Mobile{
    String  brand;
    int price;
    static String name;
    public void show(){
        System.out.println(brand+":"+price+":"+name);
    }
}
public  class keyword{
    public static void main(String[] args){
        Mobile obj1=new Mobile();
        obj1.brand="Apple";
        obj1.price=1500;
        //static variable should call by using class name
        Mobile.name="Smart Name";
        Mobile obj2=new Mobile();
        obj2.brand="Samsung";
        obj2.price=1700;
        Mobile.name="Smart phone";
        obj1.show();
        obj2.show();
    }
}*/
//static method
/*class student{
    static String college="Vit";
    static void display(){
        System.out.println(college);
    }
}
public class keyword{
    public static void main(String[] args){
        student obj=new student();
        student.display();
    }
}*/
//static block
/*class Demo{
    static{
        System.out.println("static block executed first!");
    }
}
public class keyword{
    public static void main(){
        System.out.println("Main Method");
    }
}*/
//when java program runs class with keyword executes firstin the above program the static method which is inside the keyword is executed but in the below program the static method which is inside the keyword class is executed
/*public class keyword{
    static {
        System.out.println("static block executed first");
    }
    public static void main(String[] args){
        System.out.println("Main method");
    }
}*/
//this Keyword in java(uses when instance variables and local variables are same)
//refers to the current object
/*class student{
    String name;
    student(String name){
       this.name=name;
    }
void display(){
    System.out.println(this.name);
}
}
public class keyword{
    public static void main(String[] args){
        student obj=new student("Mamatha");
        obj.display();
    }
}*/
/*class student{
    String name;
    int age;
    int marks;
    student(String name,int age,int marks){
        this.name=name;
        this.age=age;
        this.marks=marks;
    }
    void display(){
        System.out.println("Name:"+this.name);
        System.out.println("age:"+this.age);
        System.out.println("marks:"+this.marks);
    }
}
public class keyword{
    public static void main(String[] args){
        student obj=new student("Mamatha",19,99);
        obj.display();
    }
}*/
//this and super method in java
/*class A{
    public A(){
        super();//default keyword
        System.out.println("in A");
    }
    public A (int n){
        super();//default keyword
        System.out.println("int A int");
    }
}
class B extends A{
    public B(){
        super();
        System.out.println("in B");
    }
    public B(int n){
        this();
        System.out.println("int B int");
    }

}
public class keyword{
    public static void main(String [] args){
        B obj=new B(5);

    }
}*/
//final Keyword
 class calc{
   final public void show(){
    //here this method cannot be overrided in another class which extends class calc
        System.out.println("in Calc show");
    }
    public void add(int a,int b){
        System.out.println(a+b);
    }
}
class AdvCalc extends calc{
    /*public void show(){
        System.out.println("in Advcalc show");
    }*/
}
public class keyword{
    public static void main(String [] args){
        AdvCalc obj=new AdvCalc();
        obj.show();
        obj.add(2,5);
    }
}




