import java.util.Arrays;
import java.util.Random;
import java.util.List;
import java.util.Iterator;
import java.util.Scanner;

public class Spel {

	public static void main(String[] args) {
		Kaart[] kaarten = new Kaart[52];
		kaarten[0] = new Kaart(2, "H2");
		kaarten[1] = new Kaart(3, "H3");
		kaarten[2] = new Kaart(4, "H4");
		kaarten[3] = new Kaart(5, "H5");
		kaarten[4] = new Kaart(6, "H6");
		kaarten[5] = new Kaart(7, "H7");
		kaarten[6] = new Kaart(8, "H8");
		kaarten[7] = new Kaart(9, "H9");
		kaarten[8] = new Kaart(10, "H10");
		kaarten[9] = new Kaart(10, "HB");
		kaarten[10] = new Kaart(10, "HV");
		kaarten[11] = new Kaart(10, "HH");
		kaarten[12] = new Kaart(11, "HA");
		kaarten[13] = new Kaart(2, "S2");
		kaarten[14] = new Kaart(3, "S3");
		kaarten[15] = new Kaart(4, "S4");
		kaarten[16] = new Kaart(5, "S5");
		kaarten[17] = new Kaart(6, "S6");
		kaarten[18] = new Kaart(7, "S7");
		kaarten[19] = new Kaart(8, "S8");
		kaarten[20] = new Kaart(9, "S9");
		kaarten[21] = new Kaart(10, "S10");
		kaarten[22] = new Kaart(10, "SB");
		kaarten[23] = new Kaart(10, "SV");
		kaarten[24] = new Kaart(10, "SH");
		kaarten[25] = new Kaart(11, "SA");
		kaarten[26] = new Kaart(2, "R2");
		kaarten[27] = new Kaart(3, "R3");
		kaarten[28] = new Kaart(4, "R4");
		kaarten[29] = new Kaart(5, "R5");
		kaarten[30] = new Kaart(6, "R6");
		kaarten[31] = new Kaart(7, "R7");
		kaarten[32] = new Kaart(8, "R8");
		kaarten[33] = new Kaart(9, "R9");
		kaarten[34] = new Kaart(10, "R10");
		kaarten[35] = new Kaart(10, "RB");
		kaarten[36] = new Kaart(10, "RV");
		kaarten[37] = new Kaart(10, "RH");
		kaarten[38] = new Kaart(11, "RA");
		kaarten[39] = new Kaart(2, "K2");
		kaarten[40] = new Kaart(3, "K3");
		kaarten[41] = new Kaart(4, "K4");
		kaarten[42] = new Kaart(5, "K5");
		kaarten[43] = new Kaart(6, "K6");
		kaarten[44] = new Kaart(7, "K7");
		kaarten[45] = new Kaart(8, "K8");
		kaarten[46] = new Kaart(9, "K9");
		kaarten[47] = new Kaart(10, "K10");
		kaarten[48] = new Kaart(10, "KB");
		kaarten[49] = new Kaart(10, "KV");
		kaarten[50] = new Kaart(10, "KH");
		kaarten[51] = new Kaart(11, "KA");
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		System.out.println("Welkom bij BlackJack.");
		System.out.println("Wil je een kaart vragen? Druk dan op k.");
		for (int puntenAantal = 0; puntenAantal < 21;) {
		String s = scan.next();
		String k = "k";
		String q = "q";
		String p = "p";
		if (k.equals(s)) {
		for (int i = 0; i < 1; i++) {
			int randomIndex = random.nextInt(kaarten.length);
			if (kaarten[randomIndex] != null) {
			Kaart randomKaart = kaarten[randomIndex];
			System.out.println(randomKaart.kaartNaam + " " + randomKaart.kaartWaarde);
			puntenAantal = puntenAantal + randomKaart.kaartWaarde;
			if(puntenAantal < 21) {
				System.out.println("Je hebt op dit moment " + puntenAantal + " punten.");
			}
			else if(puntenAantal == 21) {
				System.out.println("Blackjack!");
			}
			else if(puntenAantal > 21) {
				System.out.println("Je hebt verloren met " + puntenAantal + " punten.");
			}
			kaarten[randomIndex] = null;
			}
			else {
				i--;
			}
		}
		}
		else if(q.equals(s)) {
			System.out.println("Je bent gestopt met het spel.");
			puntenAantal = 0;
		}
		else if (p.equals(s)) {
			for (int i = 0; i < 1; i++) {
				int randomIndex = random.nextInt(kaarten.length);
				if (kaarten[randomIndex] != null) {
				Kaart randomKaart = kaarten[randomIndex];
				System.out.println("Je hebt een beurt gepasst.");
				System.out.println("Je hebt op dit moment " + puntenAantal + " punten.");
				kaarten[randomIndex] = null;
				}
				else {
					i--;
				}
			}
		}
		}
		}
		
	}
class Kaart{
	int kaartWaarde;
	String kaartNaam;
	Kaart(int waarde, String naam){
		kaartWaarde = waarde;
		kaartNaam = naam;
	}
}