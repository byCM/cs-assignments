import java.util.Scanner;

public class bounce {

	public static void main(String[] args) {
		int time = 0;
		double height = 0;
		double velocity = 0;
		int i;
		
		Scanner keyboard = new Scanner(System.in);
		
		
		for (i = 0; i >= velocity; i++) {
			do {
				System.out.print("Please enter the initial velocity: ");
				if (keyboard.hasNextInt()) {
				    velocity = keyboard.nextDouble();
				    System.out.println("Initial velocity: " + velocity);
				    
				    height = 0;
				    time = 0;
				    System.out.println("Time: " + time + "       Height: " + height + "        Velocity: " + velocity);
				    for (i = 0; i <= height; i ++) {
				    	height += velocity;
				    	velocity -= 32;
				    	time++;
				    	System.out.println("Time: " + time + "       Height: " + height + "        Velocity: " + velocity);
				    }
				    
				} else {
				    System.out.println("I need an int, please try again.");
				    keyboard.nextDouble();
				}
			} while (velocity <= 0);
			
		}

			
	}
}
