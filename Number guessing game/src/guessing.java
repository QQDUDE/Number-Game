import java.util.Scanner;


public class guessing
 	{
 		public static void main(String[] args)
		{
			Scanner userInput = new Scanner(System.in);
			System.out.println("What is your name?");
			String name = userInput.nextLine();
			System.out.println("Hello, " + name + "!");	
				
			{
		     
				
				int randomNumber = (int) (Math.random() * 100) + 1;
		
			boolean correctGuess = false;
			int counter = 0;	
			while (correctGuess == false)
				{	
				System.out.println("Choose a number between 1 and 100."); 
				int guess = userInput.nextInt();
				counter = counter + 1;
			
			if (guess > randomNumber)
						{
						System.out.println("That's too high.");
						}
					    else if (guess < randomNumber)	
						{
						System.out.println("That's too low.");
					    }
					    else 
					    {
					    correctGuess= true;
					    if (counter > 1)
					    
					    
					    
					    System.out.println("Congrats! You got it in "+ counter + " tries.");
					
					    else
						
						
						
				
					    System.out.println("You got it in one try!");
			
			}
		   }		
		  }		
		 } 		
        }	
        		


 			
			

	
