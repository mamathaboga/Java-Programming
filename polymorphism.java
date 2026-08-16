//dynamic method dispatch in java
/*class A{
    public void show(){
        System.out.println("In show A");
    }
}
    class B extends A{
        public void show(){
            System.out.println("IN show B");
        }
    }
        class C extends B{
            public void show(){
                System.out.println("In show C");
            }
        }
public class polymorphism{
    public static void main(String[] args){
       // A obj=new B();//creating obj B of type A
       // obj.show();
       A obj=new A();
       obj.show();
       obj=new B();//we are creating obj B of type A because A is parent class and B is a child class
       obj.show();
       obj=new C();
       obj.show();
    }

}*/
//object class equals to string hashcode
/*class laptop{
    String model;
    int price;
}
public class polymorphism{
    public static void main(String[] args){
laptop obj=new laptop();
obj.model="Lenovo";
obj.price=1000;
System.out.println(obj);//it will print some hashcode
    }
}*/
//upcasting and downcasting
/*class A{
    public void show1(){
        System.out.println("in A show");
    }
}
    class B extends A{
        public void show2(){
            System.out.println("in b show");
        }
    }
        public class polymorphism{
            public static void main(String[] args){
                A obj=(A)new B();//upcasting
                obj.show1();
                B obj1=(B)obj;//downcasting
                obj1.show2();
            }
        }*/
       //wrapper class in java
       public class polymorphism{
        public static void main(String [] args){
            int num=7;
           /*  Integer num1=new Integer(num);//boxing
            System.out.println(num1);*/
             Integer num1=num;//auto boxing
            System.out.println(num1);
           /*  int num2=num1.intValue();//unboxing
            System.out.println(num2);*/
            int num2=num1;//auto unboxing
            System.out.println(num2);
        }
       }
    
