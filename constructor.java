//without constructor
/*class student{
    String name;
    int age;
}
public class constructors {
    public static void main(String[] args){
        student s1=new student();
        s1.name="Mamatha";
        s1.age=19;
        System.out.println(s1.name);
        System.out.println(s1.age);
    }
}*/
//with constructors
/*class student{
    String name;
    int age;
    //constructor
    student() //constructor name should be same as class name
    {
        name="Mamatha";
        age=19;
    }}
    public class constructors{
    public static void main(String[] args){
        student s1=new student();
        System.out.println(s1.name);
        System.out.println(s1.age);
    }
}*/
//Default constructor(No parameters)
/*class student{
    student(){
        System.out.println("Constructor called");
    }
}
public class constructors{
    public static void main(String[] args){
        student obj=new student();
    }
}*/
//parameterized constructor(having parameters)
/*class student {
    String name;
    int age;
    student(String n,int a){
        name=n;
        age=a;
    } 
    void display(){
        System.out.println(name);
        System.out.println(age);
    }
}
public class constructor{
    public static void main(String[] args){
        student s1=new student("Mamatha",19);
        student s2=new student("Rahul",20);
        s1.display();
        s2.display();
    }
}*/
//constructor overloading
//A class can have multiple constructors with diff parameters list
class student {
    student(){
        System.out.println("Default constructor");
    }
    student(String name){
        System.out.println(name);
    }
    student(String name,int age){
        System.out.println(name+" "+age);
    }
}
public class constructor{
    public static void main(String [] args){
      //   student s1=new student("mamatha",19);
      new student();
      new student("mamatha");
      new student("mamatha",19);
    }
}

