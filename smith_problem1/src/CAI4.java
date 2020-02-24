import java.security.SecureRandom;
import java.util.Scanner;

public class CAI4
{
	public static void main(String[] args)
	{ 
		quiz();
	}
	
	//Quiz contains all calls to make program run
	public static void quiz() {
	/* Declare random to generate random number based on what int 
	is passed within parameters. */
       SecureRandom random = new SecureRandom();	
       
    //Declares ints, and inits random ints
       int i = 0;
       int countcorrect = 0;
       int countincorrect = 0;
       int answer = 0;
       int difficulty = 0;
       int correct = 0;
       double score = 0.00;
       int product = 0;
       
       //Calls methods, declares some ints
       difficulty = readDifficulty();
       while (i < 10)
       {
    	 
           //Add functions readDifficulty and generateQuestionArgument here
           //Modify ask question depending on generateQuestionArgument
           //If user chooses to have another round, ask difficulty again
         
           int x = generateQuestionArgument(difficulty);
           int y = generateQuestionArgument(difficulty);
    	   product = askQuestion(x, y);
           answer = readResponse();
           correct = isAnswerCorrect(answer, product, correct);
           
           //If/else using responses from isAnswerCorrect to determine what to display
           if (correct == 1)
           {
        	   displayCorrectResponse(correct);
        	   countcorrect++;
        	   i++;
        	   //break;
        	 //Test to see if count is working
        	 //System.out.printf("Current amount of correct is: %d\n",countcorrect);
           }
           else  
           {
        	   displayIncorrectResponse(correct);
        	   countincorrect++;
        	   i++;
        	   //Test to see if count is working
        	   //System.out.printf("Current amount of incorrect is: %d\n",countincorrect);
           }
          
       }
       
       displayCompletionMessage(countcorrect, score);
       continueOrExit();
       
	}
	
	//Asks user to respond to question
	public static int askQuestion(int x, int y)
	{
		System.out.printf("What is %d times %d?\n > ", x, y);
		int product = x * y;
		return product;
	}
	
	public static int readResponse()
	{
		//Declare scanner to receive answer
		  Scanner scanner = new Scanner(System.in);
		//Declares int answer and sets it to received value
		  int answer = scanner.nextInt();
		//Returns answer
		  return answer;
	}
	
	//Checks if answer is correct, and records if answer is correct or not
	public static int isAnswerCorrect(int answer, int product, int correct)
	{
	    	    
	    	   if (answer == product)
	    	   {
	    		   correct = 1;
	    		 
	    	   }
	    	   else 
	    	   {
	    		   correct = 0;
	    	   }
	       return correct;
	}
	
	//Displays responses
	public static void displayCorrectResponse(int correct)
	{
		//Initialize randomizer for switch statement cases
		   SecureRandom random = new SecureRandom();
		   int response = random.nextInt(4)+1;
		   
		   //switch statement to display random reply
		   switch (response)
		   {
		   case 1:
			   System.out.printf("Bodacious!\n");
			   break;
			   
		   case 2:
			   System.out.printf("Totally tubular my man!\n");
			   break;
			   
		   case 3:
			   System.out.printf("Hell yeah dude!\n");
			   break;
			   
		   case 4:
			   System.out.printf("Super spectacular!\n");
			   break;
		   }
				   

	}
	public static void displayIncorrectResponse(int correct)
	{
		//Initialize randomizer for switch statement cases
		   SecureRandom random = new SecureRandom();
		   int response = random.nextInt(4)+1;
		   
		   //switch statement to display random reply
		   switch (response)
		   {
		   case 1:
			   System.out.printf("That just ain't it chief.\n");
			   break;
			   
		   case 2:
			   System.out.printf("Naaaaaaaah, you gonna have to give that another shot.\n");
			   break;
			   
		   case 3:
			   System.out.printf("Big oofsos. You'll get it this time!\n");
			   break;
			   
		   case 4:
			   System.out.printf("My guy, I hate to break it to ya, but that's not right.\n One more time, with feeling!\n");
			   break;
		   }
		
	}
	public static void displayCompletionMessage(int countcorrect, double score)
	{
		//Method takes countcorrect and calculates and prints student score and score response
		score = ( countcorrect / 10.0 ) * 100.0;
		  System.out.printf("Your score is %.2f!\n", score);
		  
		  if (score < 75)
		  {
			  System.out.printf("Please ask your teacher for extra help.\n");
		  }
		  else 
		  {
			  System.out.printf("Congratulation, you are ready to go to the next level!\n");
		  }
		
	}
	public static void continueOrExit()
	{
		//Prompts user to reply if they'd like to continue or not, and prompts user again if they imput an incorrect entry
		System.out.printf("Would you like to solve a new set of problems?\n Please enter Y or N. \n > ");
		  Scanner scanner = new Scanner(System.in);
		  char response = scanner.next().charAt(0);
		  if(response == 'y' || response == 'Y')
		  {
			  quiz();
		  }
		  else if (response == 'n' || response == 'N')
		  {
			  System.out.printf("See you next time!");
			  System.exit(0);
		  }
		  else
		  {
			  System.out.printf("Please try again!\n");
			  continueOrExit();
		  }
	}
	public static int readDifficulty()
	{
		      System.out.printf("Select a difficulty level, 1-4.\n > ");
			  Scanner scanner = new Scanner(System.in);
			  int difficulty = scanner.nextInt();
			  return difficulty;
	}
	public static int generateQuestionArgument(int difficulty)
	{
		SecureRandom random = new SecureRandom();	
		int qa = 0;
		if (difficulty == 1)
		{
			//Generate random numbers of 0-9
			  qa = random.nextInt(10);
		}
		else if (difficulty == 2) 
		{
			//Generate random numbers of 0-99
			  qa = random.nextInt(100);
		}
		else if (difficulty == 3)
		{
			//Generate random numbers of 0-999
			  qa = random.nextInt(1000);
		}
		else if (difficulty == 4)
		{
			//Generate random numbers of 0-9999
			  qa = random.nextInt(10000);
	     
		}
		return qa;
	}
}