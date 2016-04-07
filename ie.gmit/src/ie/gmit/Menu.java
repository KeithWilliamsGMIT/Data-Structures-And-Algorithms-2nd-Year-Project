/*
 * Keith Williams (G00324844)
 * 18/03/2016
 */

package ie.gmit;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		int option;
		String text;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("1) PoblachtNaHEireann");
			System.out.println("2) DeBelloGallico");
			System.out.println("3) WarAndPeace-LeoTolstoy");
			
			System.out.println("Enter option: ");
			option = scanner.nextInt();
		} while (option < 1 || option > 3);
		
		switch (option) {
		case 1:
			text = "../PoblachtNaHEireann.txt";
			break;
		case 2:
			text = "../DeBelloGallico.txt";
			break;
		default:
			text = "../WarAndPeace-LeoTolstoy.txt";
		}
		
		long startTime = System.nanoTime();
		
		IIndex index = new Index(text);
		
		long endTime = System.nanoTime();
		System.out.println("Took " + (endTime - startTime) + " ns");
		
		do {
			System.out.println("1) Print index");
			System.out.println("2) Print dictionary");
			System.out.println("3) Search Word");
			System.out.println("-1) Exit");
			
			option = scanner.nextInt();
			
			switch (option) {
			case 1:
				index.printIndex();
				break;
			case 2:
				index.printDictionary();
				break;
			case 3:
				index.search();
				break;
			}
			
			System.out.println();
		} while (option != -1);
	}
}
