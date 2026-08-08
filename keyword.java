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
public class keyword{
    static {
        System.out.println("static block executed first");
    }
    public static void main(String[] args){
        System.out.println("Main method");
    }
}

