class calc{
    public int add(int n1,int n2){
        return n1+n2;
    }
}
    class advCalc extends calc{
        public int add (int n1,int n2){
            return n1+n2+1;
        }
    }
        public class methodOverriding{
            public static void main(String[] args){
                advCalc obj=new advCalc();
                int r1=obj.add(4,5);
                System.out.println(r1);
            }
        }
    
