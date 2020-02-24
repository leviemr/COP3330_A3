import java.security.SecureRandom;
import java.util.Scanner;

public class CAI2
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
       int x = random.nextInt(10);
       int y = random.nextInt(10);
       int product = x * y;
       int answer = 0;
       int correct = 0;
       
       //Calls methods
       while (true)
       {
    	   askQuestion(x, y);
           answer = readResponse();
           correct = isAnswerCorrect(answer, product, correct);
           
           if (correct == 1)
           {
        	   displayCorrectResponse(correct);
        	   break;
           }
           else  
           {
        	   displayIncorrectResponse(correct);
           }
       }
    
       
	}
	
	//Asks user to respond to question
	public static int askQuestion(int x, int y)
	{
		System.out.printf("What is %d times %d?\n > ", x, y);
		return x * y;
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
			   System.out.printf("That just ain't it chief. Try again!\n");
			   break;
			   
		   case 2:
			   System.out.printf("Naaaaaaaah, you gonna have to give that another shot.\n");
			   break;
			   
		   case 3:
			   System.out.printf("Big oofsos. You'll get it this time!\n");
			   break;
			   
		   case 4:
			   System.out.printf("My guy, I hate to break it to ya, but that ain't it.\n One more time, with feeling!\n");
			   break;
		   }
		
	}
	
}