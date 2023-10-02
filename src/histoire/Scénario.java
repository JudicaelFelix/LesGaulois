package histoire;
import personnages.Gaulois;
import personnages.Romain;

public class Scénario {

	public static void main(String[] args) {
		Gaulois Asterix = new Gaulois("Asterix", 8);
		Romain Minus = new Romain("Minus", 6);
		Asterix.parler("Bonjour à tous ");
		Minus.parler("UN GAU... UN GAUGAU... ");
		Asterix.frapper(Minus);
		Asterix.frapper(Minus);
		Asterix.frapper(Minus);
		
	}

}
