import java.util.Scanner;
public class Number_Guess_Game {
    public static void main(String arg[]){

        Scanner sc=new Scanner(System.in);

        int number=1+(int) (100*Math.random());

        int n=10,i;// Number of attemppts
        int guess; //User will Guess The Number

        System.out.println("Number is choosen between 1 to 100. Guess the number with 10 Trials");

        for(i=1;i<=n;i++){
            System.out.println("Guess the number");
            guess=sc.nextInt();

            if(number==guess)
           {
               System.out.println("Congratulations! You guessed the number. = "+ number);
               System.out.println("Your score is "+((11-i)*10)+" out of 100");
               break;
            }
           else if(guess<number && i!=n)
            {
               System.out.println("The number is greater than  "+guess+" "+ "(No of attempts left ="+(n-i)+")");
            }
            else if(guess>number && i!=n)
           {
               System.out.println("The number is less than "+guess+" "+"(No of attempts left ="+(n-i)+")");
            }

        if((n-i)==0)
         {
            System.out.println("Sorry! You have ran out 10 limits");
            System.out.println("Your score is "+((11-i)*10)+" out of 100");
            System.out.println("The Number was = "+number);
         }
    }
}
}