package jana60;

import java.util.Scanner;

public class CalcolaBiglietto {

	public static void main(String[] args) {
		// Variabili
		float numeroChilometri;
		int anniPasseggero;
		float scontoMinorenni;
		float scontoOver65;
		// Scanner
		Scanner scan = new Scanner (System.in);
		System.out.println("Chilometri da percorrere");
		numeroChilometri = scan.nextFloat();
		
		System.out.println("Età passeggero");
		anniPasseggero = scan.nextInt();
		//variabili prezzi biglietti
		float prezzoBiglietto = numeroChilometri * 0.21f;
			//calcolo prezzo biglietto
		if(anniPasseggero < 18) {
			scontoMinorenni = prezzoBiglietto - (prezzoBiglietto * 0.2f);
			System.out.println("Normalmente il prezzo del biglietto sarebbe:" + prezzoBiglietto + " euro");
			System.out.println("Ma per i minorenni verrà applicato uno sconto del 20%. Quindi il prezzo del biglietto scontato è di: ");
			System.out.println(scontoMinorenni + "euro");
		} else if (anniPasseggero > 65) {
			scontoOver65 = prezzoBiglietto - (prezzoBiglietto * 0.4f);
			System.out.println("Normalmente il prezzo del biglietto sarebbe:" + prezzoBiglietto + " euro");
			System.out.println("Ma per gli over65 verrà applicato uno sconto del 40%. Quindi il prezzo del biglietto scontato è di: ");
			System.out.println(scontoOver65 + "euro");
		}else {
			System.out.println("Il prezzo del biglietto è: " + prezzoBiglietto);
		}

		scan.close();
	}

}