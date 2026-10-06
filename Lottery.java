//Carson Samples
//Lab Assignment 8
//9.25.26
//Course CMP-129-80231
import java.util.Random;
import java.util.Scanner;
public class Lottery 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int matches = 0;
        final int[] lottery = {10,10,10,10,10};
        final int[] user = {10,10,10,10,10};
        for(int i = 0; i<=4; i++)
        {
            lottery[i] = rand.nextInt(10);
            System.out.println("Set a number to guess for the lottery between 0 and 9: ");
            user[i] = input.nextInt();
            while(user[i] != 0 & user[i] != 1 & user[i] != 2 & user[i] != 3 & user[i] != 4 
                & user[i] != 5 & user[i] != 6 & user[i] != 7 & user[i] != 8 & user[i] != 9)
            {
                System.out.println("Please enter a number between 0 and 9.");
                System.out.println("Set a number to guess for the lottery between 0 and 9: ");
                user[i] = input.nextInt();
            }
        }
        System.out.print("Lottery array: ");
        for(int i = 0; i<=4; i++)
        {
            System.out.print(lottery[i] + " ");
        }
        System.out.print("\n");
        System.out.print("User array:    ");
        for(int i = 0; i<=4; i++)
        {
            System.out.print(user[i] + " ");
        }
        System.out.print("\n");
        for(int i = 0; i<=4; i++)
        {
            if(user[i] == lottery[i])
            {
                matches += 1;
            }
        }
        System.out.println("Matches: " + matches);
        if(matches == 5)
        {
            System.out.println("Congratulations! You are the grand-prize winner!");
        }
        input.close();
    }    
}
