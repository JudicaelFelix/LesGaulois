package personnages;

public class Romain {
	private String nom;
	public int force;
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreparole()+ "<<" + texte + ">>");
		
	}
	
	private String prendreparole() {
		return "Le romain " + nom + ":";
		
	}
	
	public void recevoircoup(int forcecoup) {
		force -= forcecoup;
		if (force > 0) {
			parler("Aie");
			
		} else {
			parler("J'abandonne");

		}
		}

	
	}

