import java.util.Scanner;
class NumberGuessing{
    public static void Guessing(){
        Scanner sc = new Scanner(System.in);
        int number=2 + (int)(100 * Math.random());
        int trails=9;
        int i,guess;
        System.out.println("Choose a number between 1 to 100.\n"+"Guess the number.");
        System.out.println("You have only  9 trails.");
        System.out.println("Guess the number:");
        for(i=0;i<trails;i++)
        {
        guess=sc.nextInt();
        if(number == guess){
            System.out.println("Your guess is correct");
        }
        else if(number>guess && i!=trails-1)
        {
            System.out.println("The guessing number is "+"greater than "+guess);
        }
        else if(number<guess && i!=trails-1){
            System.out.println("The guessing number is "+"less than "+guess);
        }
    }
    if(i==trails)
    {
        System.out.println("You have reached your maximum trails");
        System.out.println("The number is "+number);
    }

    }
    public static void main(String args[])
    {
        Guessing();
    }
}