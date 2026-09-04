/*class A extends Thread{
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
    }*/
   //thread priority 
   /*class MyThread extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName()+" ,Priority:"+Thread.currentThread().getPriority());
    }
   }
   public class Threads{
    public static void main(String[] args){
        MyThread t1=new MyThread();
        MyThread t2=new MyThread();
        MyThread t3=new MyThread();
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        t1.setName("Low priority thread");
        t2.setName("Normal priority thread");
        t3.setName("High priority thread");
        t1.start();
        t2.start();
        t3.start();

    }
   }*/
  //thread sleep in java
  /*class Mythread extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("child Thread:"+i);
            try{
                Thread.sleep(10);
            }
            catch(InterruptedException e){
                System.out.println("thread interrupted");
            }
        }
    }
  }
public class Threads{
    public static void main(String[] args){
        Mythread t1=new Mythread();
        t1.start();
    }
}*/
//Runnable
/*class Mytask implements Runnable{
    public void run(){
        System.out.println("thread running");
    }
}
public class  Threads{
    public static void main(String[] args){
        Mytask t1=new Mytask();
        Thread t2=new Thread(t1);
        t2.start();
    }
}*/
//Runnable with sleep
/*class Mytask implements Runnable{
    public void run(){
        for(int i=1;i<=5;i++)
        System.out.println(i);
        try{
            Thread.sleep(10);
        }
        catch(InterruptedException e){
            System.out.println("thread interrupted");
        }
    }
}
public class Threads{
    public static void main(String [] args){
        Mytask task=new Mytask();
        Thread t1=new Thread(task);
        t1.start();
    }
}*/
//runnable with sleep
/*class A implements Runnable{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("hii");
            try{
                Thread.sleep(10);
            }
            catch(InterruptedException e){
                System.out.println("thread interrupted");
            }
        }
    }
}
class B implements Runnable{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("hello");
            try{
                Thread.sleep(10);
            }
            catch(InterruptedException e){
                System.out.println("thread interrupted");
            }
        }
    }
}
public class Threads{
    public static void main(String[] args){
        Runnable obj1=new A();
        Runnable obj2=new B();
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
        t1.start();
        t2.start();
    }
}*/
//using anonyms inner class of above program
/*public class Threads{
    public static void main(String[] args){
        Runnable obj1=new Runnable(){
            public void run(){
                for(int i=1;i<=5;i++){
                    System.out.println("hii");
                    try{
                        Thread.sleep(10);
                    }
                    catch(InterruptedException e){
                        System.out.println("thread interrupted");
                    }
                }
            }

        };
        Runnable obj2=new Runnable(){
            public void run(){
                for(int i=1;i<=5;i++){
                    System.out.println("hello");
                }
                try{
                    Thread.sleep(10);
                }
                catch(InterruptedException e){
                    System.out.println("Thread interrupted");
                }
            }
        };
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
        t1.start();
        t2.start();
    }
}*/
//using lambda version of above program
public class Threads{
    public static void main(String[] args){
        Runnable obj1=() ->{
            for(int i=1;i<=5;i++){
                System.out.println("hii");
                try{
                    Thread.sleep(10);
                }
                catch(InterruptedException e){
                    System.out.println("thread interrupted");
                }
            }

        };
        Runnable obj2=() ->{
            for(int i=1;i<=5;i++){
                System.out.println("hello");
                try{
                    Thread.sleep(10);
                }
                catch(InterruptedException e){
                    System.out.println("Thread interrupted");
                }
            }
        };
        Thread t1=new Thread(obj1);
        Thread t2=new Thread(obj2);
        t1.start();
        t2.start();

    }
}





