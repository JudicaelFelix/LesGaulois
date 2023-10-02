package personnages;

public class Gaulois{
	private String nom;
	private int force;
	private int effetPotion;
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
		this.effetPotion = 1;
		
	}
	
	public String getNom() {
		return nom;
		
	}
	
	public void parler(String texte) {
		System.out.println(prendreparole() + "<<" + texte + ">>");		
	}
	
	private String prendreparole() {
		return "Le gaulois" + nom + ":";
		
	}
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		romain.recevoircoup((force/3)*effetPotion);
		
	}

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + "]";
	}
	
	public void boirePotion(int forcepotion) {
		effetPotion = forcepotion;
	parler("Merci Druide, je sens que ma force est " + forcepotion +" fois décuplée." );
	}
	
	public static void main(String[] args) {
		Gaulois Asterix = new Gaulois("Asterix", 8);
		Asterix.boirePotion(7);

	
	}
}


