/*public class arrays {
    public static void main(String[] args){
        int arr[]=new int[4];//4 indicates size
        arr[0]=9;
        arr[1]=3;
        arr[2]=5;
        arr[3]=6;
        for(int i=0;i<arr.length;i++)
        System.out.println(arr[i]);
    }    
}*/
//enhanced for loop and sum of array elements
/*public class arrays{
    public static void main(String[] args){
        int arr[]={10,20,30,40};
        for( int value:arr){
            System.out.println(value);
        }
            int sum=0;
            for(int i=0;i<arr.length;i++){
                sum=sum+arr[i];
            }
            System.out.println("the sum of the array elements is:"+sum);
    }
}*/
//two dimensional arrays
/*public class arrays{
    public static void main(){
        int arr[][]=new int[3][4];
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}*/
//array elements using random function
/*public class arrays{
    public static void main(String[] args){
        int arr[][]=new int[3][4];
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                arr[i][j]=(int)(Math.random()*10);
            }  
        }
        //enhanced for loop
        for(int value[]:arr){
            for(int array:value){
            System.out.print(array+" ");
        }
        System.out.println();
    }
    }
}*/
//two dimensional matrix
/*public class arrays{
    public static void main(String[] args){
        int matrix[][]={{10,20,30},{40,50,60},{70,80,90}};
        for (int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}*/
//jagged array
//each row may contain different no. of elements
/*public class arrays{
    public static void main(String[] args){
        int arr[][]=new int[3][];
        arr[0]=new int[3];//zeroth contains 3 elements ie.3 columns
        arr[1]=new int[4];
        arr[2]=new int[2];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=(int)(Math.random()*10);
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        //using enhanced for loop
        for(int n[]:arr){
            for(int array:n){
                System.out.print(array+" ");
            }
            System.out.println();
        }
    }
}*/
//three dimensional array
/*public class arrays{
    public static void main(String[] args){
        int arr[][][]={{{1,2},{3,4}},{{5,6},{7,8}}};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                for(int k=0;k<arr[i][j].length;k++){
                    System.out.println(arr[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
        }
    }*/
    //array of objects
    /*class student{
        String name;
        int rollno;
        int marks;
    }
    public class arrays{
        public static void main(String[] args){
            student s1=new student();
            s1.name="mamatha";
            s1.rollno=26;
            s1.marks=100;
            student s2=new student();
            s2.name="divya";
            s2.rollno=24;
            s2.marks=95;
            student s3=new student();
            s3.name="nirupama";
            s3.rollno=40;
            s3.marks=80;
            //creatind an array of objects
            student  students[]=new student[3];
            students[0]=s1;
            students[1]=s2;
            students[2]=s3;
            //to print all the details of the students
            for(int i=0;i<students.length;i++){
                System.out.println(students[i].name+":"+students[i].marks);
            }
            //using enhanced for loop
            for(student stud:students){
                System.out.println(stud.name+":"+stud.marks);
            }


        }
    }*/
    







