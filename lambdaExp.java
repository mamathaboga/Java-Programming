/*interface A{
    void show();
}
public class lambdaExp{
    public static void main(String[] args){
        //abstract and anonyms inner class
        A obj=new A(){
            public void show(){
                System.out.println("in show");
            }
        };
        obj.show();
    }
}*/
//we can also write like by busing lambda expression
/*interface A{
    void show();
}
public class lambdaExp{
    public static void main(){
        //using lamda expression
        A obj=() ->{
            System.out.println("in show");
        };
        obj.show();
    }
    
}*/
/*interface A{
    void show(int i);
}
public class lambdaExp{
    public static void main(String[] args){
        A obj=(i) -> System.out.println("in show"+i);
        obj.show(5);
    }
}*/
//without using lambda Expression
/*interface A{
    int add(int i,int j);
}
public class lambdaExp{
    public static void main(String[] args){
        //abstract and anonyms inner class
        A obj=new A(){
            public int add(int i,int j){
                return i+j;
            }
        };
        int result=obj.add(5,4);
        System.out.println(result);
    }
}*/
//using lambda Expression
/*interface A{
    int add(int i,int j); 
}
public class lambdaExp{
    public static void main(String[] args){
        A obj=(i,j) -> i+j;
    int result=obj.add(5,4);
    System.out.println(result);
}}*/