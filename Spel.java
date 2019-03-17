import java.util.Arrays;
import java.util.Random;
import java.util.List;
import java.util.Iterator;

public class Spel {

	public static void main(String[] args) {
		Kaart[] kaarten = new Kaart[6];
		kaarten[0] = new Kaart(2, "H2");
		kaarten[1] = new Kaart(3, "H3");
		kaarten[2] = new Kaart(4, "H4");
		kaarten[3] = new Kaart(5, "H5");
		kaarten[4] = new Kaart(6, "H6");
		kaarten[5] = new Kaart(7, "H7");
		Random random = new Random();
		int numberOfElements = kaarten.length;
		for (int i = 0; i < numberOfElements; i++) {
			int randomIndex = random.nextInt(kaarten.length);
			Kaart randomKaart = kaarten[randomIndex];
			System.out.println(randomKaart);
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