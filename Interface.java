interface A{
    int age=44;//by default these variables are final and static
    String name="Mumbai";//that means fixed
    void show();
    void config();
}
class B implements A{
    public void show(){
        System.out.println("in show");
    }
    public void config(){
        System.out.println("in config");
    }
}
public class Interface{
    public static void main(String [] args){
        A obj;//not object reference of A
        obj=new B();
        obj.show();
        obj.config();
        
    }
}
