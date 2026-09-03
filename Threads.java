class A extends Thread{
    public void run(){
        for(int i=1;i<=100;i++){
            System.out.println("hii");
        }
    }
}
    class B extends Thread{
        public void run(){
            for(int i=1;i<=100;i++){
                System.out.println("hello");
            }
        }
    }
    public class Threads{
        public static void main(String[] args){
            A obj1=new A();
            B obj2=new B();
            //here hii and hello will executed simultaneously by using start keyword
            obj1.start();
            obj2.start();
        }
    }
