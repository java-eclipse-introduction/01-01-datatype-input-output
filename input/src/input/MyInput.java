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
		// F1.01 �rja meg azt a programot amely egy a eg�sz sz�mot k�r be 
		// a k�vetkez� sz�veggel: "Adja meg a sz�let�si �v�t:".
		
		// F1.02 Sz�veg ki�r�sa a k�perny�re. A sz�veg v�g�n nincs �j sor karakter!
        System.out.print("Adja meg a sz�let�si �v�t:");
        
        // F1.03 Az "ev" eg�sz t�pus� v�ltoz�. Egy eg�sz sz�m t�rol�s�ra alkalmas.
        // F1.04 Scanner oszt�ly p�ld�nyos�t�sa. 
        //       A Scenner oszt�ly seg�ts�g�vel t�rt�nik az adatbeolvas�s.
        // F1.05 Egy eg�sz sz�m beolvas�sa a konzolr�l. A beolvasott sz�mot
        //       a year v�ltoz�ba t�roljuk el.
        Scanner in=new Scanner(System.in);
        int year=in.nextInt();               
        
	}

}
