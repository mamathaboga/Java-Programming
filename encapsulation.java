//Encapsulation in java using getters
/*class Human {
    private int age=11;
    private String name="Navin";  
public int getAge(){
    return age;
}
public String getName(){
    return name;
}
}
public class encapsulation{
    public static void main(String[] args){
        Human obj=new Human();
        System.out.println(obj.getName()+":"+obj.getAge());
    }
}*/
//encapsulation using getters and setters
class Human{
    private int age;
    private String name;
    //getters are used to return some value
public int getAge(){
    return age;
}
//setters are used to set the value for the variables
public void setAge(int a){
    age=a;
}
public String getName(){
    return name;
}
public void setName(String n){
    name=n;
}
}
public class encapsulation{
    public static void main(String[] args){
        Human obj=new Human();
        obj.setAge(19);
        obj.setName("mamatha");
        System.out.println(obj.getName()+":"+obj.getAge());
    }
}
