package histoire;
import personnages.Gaulois;
import personnages.Romain;

public class Sc�nario {

	public static void main(String[] args) {
		Gaulois Asterix = new Gaulois("Asterix", 8);
		Romain Minus = new Romain("Minus", 6);
		Asterix.parler("Bonjour � tous ");
		Minus.parler("UN GAU... UN GAUGAU... ");
		Asterix.frapper(Minus);
		Asterix.frapper(Minus);
		Asterix.frapper(Minus);
		
	}

}
