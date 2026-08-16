/*enum status{
    Running,failed,pending,success;
}
public class Enums{
    public static void main(String[] args){
        status s=status.failed;
        System.out.println(s);
        System.out.println(s.ordinal());
        status []ss=status.values();
        System.out.println(ss[0]);
        for(status S:ss){
            System.out.println(S +":"+S.ordinal());
        }
    }
}*/
//Enums using If and Switch
/*enum Day{
    Monday,tuesday,wednesday,thursday;  
}
public class Enums{
    public static void main(String [] args){
        Day D=Day.wednesday;
        //using if else
        if(D==Day.Monday)
            System.out.println("All Good");
    else if(D==Day.tuesday)
        System.out.println("Try Again");
    else if(D==Day.wednesday)
        System.out.println("Please wait");
    else
        System.out.println("Done");
    //using switch
    switch (D){
        case Monday:
            System.out.println("All Good");
            break;
            case tuesday:
                System.out.println("Try again");
                break;
                case wednesday:
                    System.out.println("please wait");
                    break;
                    default:
                        System.out.println("Done");
                        break;
    }

    }
}*/
//enum class in java
/*enum pizzasize{
    small(100),medium(200),large(300);
    int price;
    pizzasize(int price){
        this.price=price;
    }
}
public class Enums{
    public static void main(String[] args){
        pizzasize p=pizzasize.medium;
        System.out.println("pizzasize: "+p);
        System.out.println("price: "+p.price);
    }
}*/
enum laptop{
    Macbook(2000),asus(1500),lenovo(3000),HP(1200);
    private int price;
    private laptop(int price){
        this.price=price;
    }
    public int getprice(){
        return price;
    }
    public void setprice(int price){
        this.price=price;
    }
}
public class Enums{
    public static void main(String[] args){
        for(laptop lap:laptop.values()){
            System.out.println(lap+":"+lap.getprice());
        }
    }
}

