/*public class strings {
    public static void main(String [] args){
        String name="Mamatha";
        System.out.println("hello "+name);
        //some string methods
        System.out.println(name.length());
        System.out.println(name.concat(" Boga"));
        System.out.println(name.charAt(3));
        System.out.println(name.toUpperCase());
        System.out.println(name);//by default strings in java are immutable

    } 
}*/
//mutable strings 
//string Buffer
/*public class strings{
    public static void main(String [] args){
        StringBuffer sb=new StringBuffer("Navin") ;
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append(" Reddy");
        System.out.println(sb);
    }
}*/
//String Builder
/*public class strings{/
    public static void main(String [] args){
        StringBuilder sb=new StringBuilder("java");
        sb.append(" Programming");
        System.out.println(sb);
    }
}*/
//Reverse a string
public class string{
    public static void main(String [] args){
        String str="Java";
        for(int i=str.length()-1;i>=0;i--){
System.out.print(str.charAt(i));
        }
    }    
}


