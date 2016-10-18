import java.util.*;
public class Studienberatung {
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hast du Abitur?");
		String abitur = scanner.next();
		

	
	if (abitur.equalsIgnoreCase("n")){
		System.out.println("Hast du Fachabitur?");
		abitur = scanner.next();
		if (abitur.equalsIgnoreCase("j")){
			System.out.println("Hast du eine Berufsausbildung?");
			abitur = scanner.next();
			if(abitur.equalsIgnoreCase("j")){
				System.out.println("Du kannst ja später noch studieren");
			}
			else {
				System.out.println("Besser noch studieren");
			}
		
	}
	}
	else if (abitur.equalsIgnoreCase("j")){
			System.out.println("Bist du wissbegierig?");
			String wiss = scanner.next();
		}
			
		
	}}