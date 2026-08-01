/*class calculator{//creating class
    int a;
    public int add(int n1,int n2)//method
    {
    int r=n1+n2;
    return r;//creating method
}
}
public class classAndObject{
    public static void main(String [] args){
        int num1=4;
        int num2=5;
        calculator calc=new calculator();
        int result=calc.add(num1,num2);
        System.out.println("the addition of this two numbers is"+":"+result);
    }
}*/
/*class student//creating class
{
    public class classAndObject//main method
    {
        public static void main(String[] args){
            student s1=new student();//creating object
            System.out.println("object created");
        }
    }
}*/
/*class student{
    String name;
    int age;
}
public class classAndObject
{
    public static void main(String[] args){
student s1=new student();//object creation
s1.name="mamatha";
s1.age=20;
System.out.println(s1.name);
System.out.println(s1.age);
    }
    }*/
   //creating multiple objects
   /*class student{
    String name;
    int age;
   }
   public class classAndObject{
    public static void main(String [] args){
    student s1=new student();
    student s2=new student();
    s1.name="mamatha";
    s1.age=19;
    s2.name="Divya";
    s2.age=20;
    System.out.println("name"+":"+s1.name);
    System.out.println("age:"+s1.age);
    System.out.println("name:"+s2.name);
    System.out.println("age:"+s2.age);

    }
   }*/
   //class with methods
   /*class student{
    String name;
   void display(){
    System.out.println(name);
   }
}
   public class classAndObject{
    public static void main(String [] args){
        student s1=new student();
        s1.name="mamatha";
        s1.display();
    }  
   }*/
  //complete example
  /*class student{
    String name;
    int age;
    double cgpa;
    void display(){
        System.out.println("name: "+name);
        System.out.println("age: "+age);
        System.out.println("cgpa: "+cgpa);
    }
  }
  public class classAndObject{
    public static void main(String [] args){
        student s1=new student();
        s1.name="mamatha";
        s1.age=19;
        s1.cgpa=9.3;
        s1.display();
        //object referance
        student s2=s1;//object referance
        s2.name="divya";
        System.out.println(s1.name);  
    }
    }*/
   //methods in java
   /*class computer{
    public void playMusic(){
        System.out.println("Music playing");
    }
    public String GetMeAPen(int cost){
        if(cost<=10)
            return "pen";
        else
            return "nothing";
    }
   }
   public class classAndObject{
    public static void main(String [] args){
        computer obj=new computer();
        obj.playMusic();
        String str=obj.GetMeAPen(2);
        System.out.println(str);
    }
   }*/
   //method overloading
   //we can use same method name with different types of parameters  or with no. of parameters
   /*class calculator{
    public int add(int n1,int n2,int n3){
    return n1+n2+n3;
   }
   public int add(int n1,int n2){
    return n1+n2;
   }
   public double add(double n1,int n2){
    return n1+n2;
   }
}
public class classAndObject{
    public static void main(String [] args){
        calculator calc=new calculator ();
     int res1=calc.add(2,4,5);
     int res2=calc.add(6,7);
     double res3=calc.add(8,9);
     System.out.println(res1);
     System.out.println(res2);
     System.out.println(res3);
    }
}*/
//student result processing
/*class student{
    int rollno;
    String name;
    int m1,m2,m3,m4,m5;
    int total;
    double percentage;
    char grade;
    void calculateResult(){
        total=m1+m2+m3+m4+m5;
        percentage=total/5.0;
        if(percentage>=90)
            grade='A';
        else if(percentage>=75)
            grade='B';
        else if(percentage>=60)
            grade='C';
        else if(percentage>=40)
            grade='D';
        else 
            grade='F';
    }
    void display(){
        System.out.println("name: "+name);
        System.out.println("roll no.: "+rollno);
        System.out.println("percentage: "+percentage);
        System.out.println("grade: "+grade);
    }
}
    public class classAndObject{
        public static void main(String[] args){
            student s1=new student();
            s1.name="Mamatha";
            s1.rollno=26;
            s1.m1=92;
            s1.m2=86;
            s1.m3=75;
            s1.m4=35;
            s1.m5=67;
            s1.calculateResult();
            s1.display();
        }
    }*/
//Number analysis
/*class NumberAnalysis{
    int num;
    void checkEvenOdd(){
        if(num%2==0)
            System.out.println(num+"is Even");
        else
            System.out.println(num+"is odd");
    }
void checkSign(){
    if(num>0)
        System.out.println(num+"is positive");
    else if(num<0)
        System.out.println(num+"is negative");
else
  System.out.println(num+"is zero")  ;
}
void checkDivisibility(){
    if(num%5==0 && num%11==0)
        System.out.println(num+"is divisible by both 5 and 11");
    else
        System.out.println(num+"is not divisible by both 5 and 11");

}
}
public class classAndObject{
    public static void main(String[] args){
        NumberAnalysis obj=new NumberAnalysis();
        obj.num=55;
        obj.checkEvenOdd();
        obj.checkSign();
        obj.checkDivisibility();
    }
}*/
//display all prime numbers and perfect numbers between 1 to N
/*class numberCheck{
    int n;
    void displayPrimeNumbers(){
        System.out.println("prime Numbers: ");
            for(int i=2;i<=n;i++){
                int count=0;
                for(int j=1;j<=i;j++){
                    if(i%j==0)
                    count ++;
                }
                if(count==2){
                    System.out.print(i);
                }
                System.out.println();
            }
        }
            void displayPerfectNumbers(){
                System.out.println("perfect Numbers: ");
                for(int i=1;i<=n;i++){
                    int sum=0;
                    for(int j=1;j<=i;j++){
                        if(i%j==0){
                            sum=sum+j;
                        }
                    }
                    if(sum==i){
                        System.out.print(i);
                    }
                    System.out.println();
                }

            }   
    }
    public class classAndObject{
        public static void main(String[] args){
            numberCheck obj=new numberCheck();
            obj.n=10;
            obj.displayPrimeNumbers();
            obj.displayPerfectNumbers();
        }
    }*/
    //method overloading
    //to calculate area of circle and area of rectangle and triangle
    /*class Area{
        //circle
        double calculateArea(double radius){
            return 3.14*radius*radius;
        }
        //rectangle
        int calculateArea(int length,int breadth){
            return length*breadth;
        }
        //triangle
        double calculateArea(double base,double height){
            return 0.5*base*height;
        }
    }
    public class classAndObject{
        public static void main(String[] args){
            Area obj=new Area();
           double circleArea= obj.calculateArea(5.0);
           int rectangleArea=obj.calculateArea(10,20);
           double triangleArea=obj.calculateArea(8.0,6.0);
           System.out.println("Area of circle="+circleArea);
           System.out.println("Area of rectangle="+rectangleArea);
           System.out.println("Area of triangle="+triangleArea);
        }
    }*/
   //star pattern
   /*class pattern{
    void printstars(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
   }
   public class classAndObject{
    public static void main(String[] args){
        pattern obj=new pattern();
        obj.printstars();
    }
   }*/
   //number pattern
   class pattern{
    void printNumbers(){
        for(int i=5;i>=1;i--){
            for(int j=5;j>=i;j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
   }
   public class classAndObject{
    public static void main(String[] args){
        pattern obj=new pattern();
        obj.printNumbers();
    }
   }





  

