import java.util.*;
public class Studienberatung {
	public static void main (String[] args){
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hast du Abitur?");
		String abitur = scanner.next();

		
		if (abitur.equalsIgnoreCase("n")){
			System.out.println("Hast du Fachabitur?");
			String fachabitur = scanner.next();
				if (fachabitur.equalsIgnoreCase("j")){
					System.out.println("Hast du eine Berufsausbildung?");
					String berufsausbildung = scanner.next();
				}
		}
	
		
		else if (abitur.equalsIgnoreCase("j")){
			System.out.println("Bist du wissbegierig?");
		}
	}
}