import java.util.Scanner;
class B{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of subjects:");
        int  n=sc.nextInt();
        int total=0;
        for( int i=1;i<=n;i++){
            System.out.println("Enter number of marks obtained in subject"+" "+i+" "+":");
            int marks=sc.nextInt();
            if(marks<0||marks>100){
                System.out.println("Invalid marks");
                return;
            }
            total+=marks;
        }
    double Avgper=(double)total/n;
    System.out.println("Total marks:"+total);
    System.out.println("Average percentage:"+Avgper);
    String grade;
    if(Avgper>=90)
        grade="A";
    else if(Avgper>=80)
        grade="B";
    else if(Avgper>=70)
        grade="C";
    else if(Avgper>=60)
        grade="D";
    else
        grade="f";
        System.err.println("Grade="+grade);
}
}
