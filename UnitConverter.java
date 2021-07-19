import java.util.Scanner;


public class UnitConverter {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		char menu = ' ', submenu = ' ';
		
		
		System.out.println("\tConvertisseur d'unités");
		System.out.println("\t======================\n");
		
		do {
			
			do {
				menu = ' ';
				System.out.println(("Catégories :\n").toUpperCase());
				System.out.println("1 - Température");
				System.out.println("2 - Masse");
				System.out.println("3 - Longueur");
				System.out.println("Q - Quitter");
				System.out.println("\n-> Entrez le chiffre correpondant à la catégorie souhaitée, ou 'Q' pour quitter :");
				menu = sc.nextLine().charAt(0);
				
				if(menu != '1' && menu != '2' && menu != '3' && menu != 'Q') {
					System.out.println("\nSaisie invalide !\n");
				}
			} while(menu != '1' && menu != '2' && menu != '3' && menu != 'Q');
			
			submenu = ' ';
			
			while(menu != 'Q' && submenu != 'C') {
				
				switch(menu) {
					case '1':
						Object temperatureValues[] = inputValues("Température", Temperature.showUnits());
						Temperature temperature = new Temperature((double)temperatureValues[0], (int)temperatureValues[1], (int)temperatureValues[2]);
						System.out.println(temperature.toResult());
						break;
					case '2':			
						Object massValues[] = inputValues("Masse", Mass.showUnits());
						Mass mass = new Mass((double)massValues[0], (int)massValues[1], (int)massValues[2]);
						System.out.println(mass.toResult());
						break;
					case '3':
						Object lengthValues[] = inputValues("Longueur", Length.showUnits());
						Length length = new Length((double)lengthValues[0], (int)lengthValues[1], (int)lengthValues[2]);
						System.out.println(length.toResult());
						break;
				}
								
				do {
					System.out.println("\n-> Que voulez-vous faire ?");
					System.out.println("-> Tapez 'R' pour recommencer, 'C' pour changer de catégorie ou 'Q' pour quitter :");
					submenu = sc.nextLine().charAt(0);
				} while (submenu != 'Q' && submenu != 'R' && submenu != 'C');
				
				if(submenu == 'Q') {
					menu = 'Q';
				}
			}
			
			
		} while (menu != 'Q');
		
		System.out.println("\n\t*** FIN ***");
				
	}
	
	
	public static Object[] inputValues(String category, String categoryUnits) {
			
		Scanner input = new Scanner(System.in);
		int nbUnits = categoryUnits.split("\n").length;
		String number, inUnit, outUnit;
				
		String regexDouble = "^-?\\d*\\.?\\d+$";
		String regexUnit = "^\\d$";
				
		System.out.println(("\nConversion : " + category + "\n").toUpperCase());
				
		
		// Saisie du nombre à convertir
		
		do {
			System.out.println("-> Saisissez la valeur à convertir :");
			number = input.nextLine();
			
			if(number.contains(",")) {
				number = number.replace(",", ".");
			}
			
			if(!number.matches(regexDouble)) {
				System.out.println("\nSaisie invalide !\nVeuillez saisir un nombre valide.\n");
			}
		} while (!number.matches(regexDouble));
		
		
		System.out.println(("\nUnités de " + category + "\n").toUpperCase());
		System.out.println(categoryUnits);
		
		
		// Choix de l'unité de départ
		
		do {
			do {
				System.out.println("\n-> Entrez le chiffre correspondant à l'unité de départ :");
				inUnit = String.valueOf(input.nextLine().charAt(0));
				
				if(!inUnit.matches(regexUnit)) {
					System.out.println("Saisie invalide !\nVeuillez saisir un chiffre valide !\n");
				}
			} while (!inUnit.matches(regexUnit));
			
			if(!(Integer.parseInt(inUnit) > 0 && Integer.parseInt(inUnit) <= nbUnits)) {
				System.out.println("Saisie invalide !\nVeuillez saisir un chiffre correspondant au choix désiré !\n");
			}
		} while (!(Integer.parseInt(inUnit) > 0 && Integer.parseInt(inUnit) <= nbUnits));
		
		
		// Choix de l'unité de conversion
		
		do {
			do {
				System.out.println("\n-> Convertir vers quelle unité ? Entrez le chiffre correspondant :");
				outUnit = String.valueOf(input.nextLine().charAt(0));
				
				if(!outUnit.matches(regexUnit)) {
					System.out.println("Saisie invalide !\nVeuillez saisir un chiffre valide !\n");
				}
			} while (!outUnit.matches(regexUnit));
			
			if(!(Integer.parseInt(outUnit) > 0 && Integer.parseInt(outUnit) <= nbUnits)) {
				System.out.println("Saisie invalide !\nVeuillez saisir un chiffre correspondant au choix désiré !\n");
			}
		} while (!(Integer.parseInt(outUnit) > 0 && Integer.parseInt(outUnit) <= nbUnits));
		

		Object tab[] = new Object[3];
		tab[0] = new Double(number);
		tab[1] = new Integer(inUnit);
		tab[2] = new Integer(outUnit);
		return tab;
		
	}
	
}
