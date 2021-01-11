/**
 * 
 */
package input;

import java.util.Scanner;

/**
 * @author Gyuris Csaba
 *
 */
public class MyInput {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Feladat
		// F1.01 Írja meg azt a programot amely egy a egész számot kér be 
		// a következõ szöveggel: "Adja meg a születési évét:".
		
		// F1.02 Szöveg kiírása a képernyõre. A szöveg végén nincs új sor karakter!
        System.out.print("Adja meg a születési évét:");
        
        // F1.03 Az "ev" egész típusú változó. Egy egész szám tárolására alkalmas.
        // F1.04 Scanner osztály példányosítása. 
        //       A Scenner osztály segítségével történik az adatbeolvasás.
        // F1.05 Egy egész szám beolvasása a konzolról. A beolvasott számot
        //       a year változóba tároljuk el.
        Scanner in=new Scanner(System.in);
        int year=in.nextInt();               
        
	}

}
