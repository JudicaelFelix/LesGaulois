package personnages;

public class Gaulois{
	private String nom;
	private int force;
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
		
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
		System.out.println(nom + "envoie un grand coup dans la mâchoire de" + romain.getNom());
		romain.recevoircoup(force/3);
		
	}

//	@Override
//	public String toString() {
//		return "Gaulois [nom=" + nom + ", force=" + force + "]";
//	}
	
	public static void main(String[] args) {
		Gaulois Asterix = new Gaulois("Asterix", 8);
		System.out.println(Asterix.getNom());
	
	}
}


