import java.util.Scanner;

/**
 * @author Doğan Seyfi Şen - 2022
 */

public class Driver {
	
	public static void main(String[] args) {
		int math, physics, turkish, chemistry, music;

		Scanner inp = new Scanner(System.in);
		
		System.out.print("Your math score: ");
		math = inp.nextInt();
		
		System.out.print("Your physics score: ");
		physics = inp.nextInt();
		
		System.out.print("Your turkish score: ");
		turkish = inp.nextInt();
		
		System.out.print("Your chemistry score: ");
		chemistry = inp.nextInt();
		
		System.out.print("Your music score: ");
		music = inp.nextInt();
		
		if(math<0 || math>100) {math = 0;}
        else if (physics<0 || physics>100) {physics = 0;}
        else if(turkish<0 || turkish>100) {turkish = 0;}
        else if(chemistry<0 || chemistry>100) {chemistry = 0;}
        else if(music<0 || music>100) {music = 0;}
		
		double average = (math + physics + turkish + chemistry + music)/5.0;
		System.out.println("Your average score: "+average);
		if(average >= 55) {
			System.out.println("You've passed.");
		} else {
			System.out.println("You've failed.");
		}
	}
}
