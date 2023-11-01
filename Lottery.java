import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lotteryNumber = 10 + (int)(Math.random() * 90);
        System.out.print("Enter a two digit number: ");
        int NumberChoice = scan.nextInt();

        if (NumberChoice == lotteryNumber)
        {System.out.println("You win $10,000");}

        else if (NumberChoice % 10 == lotteryNumber / 10
                &&
                NumberChoice / 10 == lotteryNumber % 10)
        {System.out.println("You win $2,000");}

        else if (NumberChoice % 10 == lotteryNumber % 10
                ||
                NumberChoice / 10 == lotteryNumber / 10
                ||
                NumberChoice % 10 == lotteryNumber / 10
                ||
                NumberChoice / 10 == lotteryNumber % 10)

        {System.out.println("You win $500");}
        else {System.out.println("You did not win anything :(");}
        System.out.println("The lotto number is: " + lotteryNumber);
    }
}
