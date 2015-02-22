import java.util.Scanner;

public class QuarterBackRating {

	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Passing Attempts: ");
		double passAttempts = input.nextDouble();
		
		System.out.print("Passing Completions: ");
		double passCompletions = input.nextDouble();
		
		System.out.print("Passing Yards: ");
		double passYards = input.nextDouble();
		
		System.out.print("Touchdown Passes: ");
		double touchdownPasses = input.nextDouble();
		
		System.out.print("Interceptions: ");
		double interceptions = input.nextDouble();
		
		double a = (passCompletions/passAttempts - .3) * 5;
		
		double b = (passYards/passAttempts - 3) * .25;
		
		double c = (touchdownPasses/passAttempts) * 20;
		
		double d = 2.375 - (interceptions/passAttempts) * 25;
		
		double A = Math.max(0, Math.min(a, 2.375));
		
		double B = Math.max(0, Math.min(b, 2.375));
		
		double C = Math.max(0, Math.min(c, 2.375));
		
		double D = Math.max(0, Math.min(d, 2.375));
		
		double passerRating = (A + B + C + D) / 6 * 100;
				
		System.out.format("Passer rating is: %.1f", passerRating);
	}
}
