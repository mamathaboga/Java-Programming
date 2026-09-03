//Exception Handling
/*public class ExceptionHand {
    public static void main(String[] args){
        int i=0;
        int j=0;
        try{
            //risky codes
            j=18/i;
        }
        catch(Exception e){
            //handling the Exception
            System.out.println("Something Went Wrong...");
        }
        System.out.println(j);
        System.out.println("Bye");
    }
    
}*/
//Try with multiple catches
/*public class ExceptionHand{
    public static void main(String[] args){
        int i=2;
        int j=0;
        int nums[]=new int[5];
        String str=null;
        try{
            j=18/i;
            System.out.println(str.length());
            System.out.println(nums[0]);
            System.out.println(nums[5]);
        }
        catch(ArithmeticException e) {
            System.out.println("Cannot divide by Zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Stay in your limit..");
        }
        catch(Exception e){
            System.out.println("Something went Wrong"+e);
        }
        System.out.println(j);
        System.out.println("Bye");
    }
}*/
//Exception handling using throw keyword
/*public class ExceptionHand{
    public static void main(String[] args){
        int i=20;
        int j=0;
        try{
            j=18/i;
            if(j==0){
                throw new ArithmeticException("I dont want to print zero!");
            }
        }
        catch(ArithmeticException e){
            j=18/1;
            System.out.println("default output"+e);
        }
        catch(Exception e){
            System.out.println("Something went wrong...");
        }
        System.out.println(j);
        System.out.println("Bye");
    }
}*/
//Custom Exception
/*class NavinException extends Exception{
    NavinException(String str){
        super(str);
    }
}
public class ExceptionHand{
    public static void main(String[] args){
        int i=20;
        int j=0;
        try{
            j=18/i;
            if(j==0){
                throw new NavinException("I dont want zero");
            }
        }
        catch(NavinException e){
            j=18/1;
            System.out.println("this is the default output"+e);
        }
        catch(Exception e){
            System.out.println("something went wrong"+e);
        }
        System.out.println(j);
        System.out.println("bye");
    }
}*/
//Ducking Exception using throws
/*public class ExceptionHand{
    static void divide() throws ArithmeticException{
        int a=10;
        int b=0;
        System.out.println(a/b);
    }
    public static void main(String[] args){
        try{
            divide();
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
    }
}*/
//try with finally 
/*public class ExceptionHand{
    public static void main(String[] args){
        try{
            int a=10;
            int b=0;
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by Zero");
        }
        finally{
            System.out.println("finally block executed");
        }
    }
}*/
//finally for closing a resource
/*import java.util.Scanner;
public class ExceptionHand{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("Enter a number");
            int n=sc.nextInt();
            System.out.println("you entered number is "+n);
        }
        catch(Exception e){
            System.out.println("Invalid input");
        }
        finally{
            sc.close();
            System.out.println("Scanner closed");
        }

    }
}*/


