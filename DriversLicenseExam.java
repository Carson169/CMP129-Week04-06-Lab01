//Carson Samples
//Lab Assignment 8
//9.25.26
//Course CMP-129-80231
import java.util.Scanner;
public class DriversLicenseExam 
{
    public static void main(String[] args) 
    {
        //Initialzing my variables with placeholder values
        String answer = "evil";
        int correct = 0;
        int incorrect = 0;
        int p = 0;
        //Initalizing scanner
        Scanner keyboard = new Scanner(System.in);
        //Making a array with the right answers for comparison
        final String[] answerkey = {"A", "D", "B", "B", "C", "B", "A",
        "B", "C", "D", "A", "C", "D", "B", "D", "C", "C", "A", "D", "B"};
        //Initalizing the array for the studentanswers with placeholder values
        String[] studentanswers = {"","","","","","","","","","","","","",
        "","","","","","","","","","","","","",""};
        //Initialzing a array for incorrect answers with placeholder values
        int[] incorrectanswers = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        // for loop to take user input 20 times (one for each question)
        for(int i = 1; i<21; i++)
        {
            //Asking input for each answer
            System.out.println("Input answer for problem " + i + ":");
            //Setting the answer of the problem to the answer variable
            answer = keyboard.nextLine();
            //Using a while loop for input validation, this runs if "answer" is anything that isnt A, a, B, b, C, c, D, or d
            while(!answer.equalsIgnoreCase("A") && !answer.equalsIgnoreCase("B") && !answer.equalsIgnoreCase("C") && !answer.equalsIgnoreCase("D"))
            {
                //Redoing input if the user puts in a bad input
                System.out.println("Answer must be A, B, C or D");
                System.out.println("Input answer for problem " + i + ":");
                answer = keyboard.nextLine();
            }
            //Setting the value correspondent to the problem in the studentanswers array to the user's answer 
            studentanswers[i - 1] = answer;
            //IF the student answer is the same as the answer key, the correct variable gets increase
            if(studentanswers[i-1].equalsIgnoreCase(answerkey[i-1]))
            {
                correct += 1;
            }
            //If the student answer isn't the same as the answer key, the incorrect variable gets increased
            if(!studentanswers[i-1].equalsIgnoreCase(answerkey[i-1]))
            {
                //assigns the question you got wrong to the incorrectanswers array
                incorrect += 1;
                incorrectanswers[p] = i;
                p +=1;
            }
            //sets the answer variable back to the placeholder
            answer = "Evil";
        }
        //sets p variable to 0 for use later
        p = 0;
        //prints amount of correct or incorrect answers
        System.out.println("Amount of correct answers: " + correct);
        System.out.println("Amount of incorrect answers: " + incorrect);
        //if statement to verify if you passed or not
        if(correct >= 15)
        {
            System.out.println("You passed!");
        }
        if(correct < 15)
        {
            System.out.println("You did not pass.");
        }
        //For display
        //Only displays the incorrect answers if the placeholder value doesn't say 0
        while(incorrectanswers[p] != 0)
        {
            if(p == 0)
            {
                System.out.print("Incorrect answers: ");
            }
            System.out.print(incorrectanswers[p] + ", ");
            p += 1;
        }
        //closes the scanner to prevent memory leak
        keyboard.close();
    }
}
