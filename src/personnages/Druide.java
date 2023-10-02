package personnages;
import java.util.Random;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int ForcePotion;
	
	
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		this.ForcePotion = 1; 
		parler("Bonjour, je suis le druide "+ nom + " et ma potion peut aller d'une force "
				+ effetPotionMin + " à " + effetPotionMax + ".");
		
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String text) {
		System.out.println(prendreparole()+ "<<" + text + ">>");
		
	}
	
	private String prendreparole() {
		return "Le druide" + nom + " : ";
	}
	
	public void preparerpotion() {
		Random random = new Random();
		do {
		ForcePotion = random.nextInt(effetPotionMax);
		}while(ForcePotion<effetPotionMin);
		
		if (ForcePotion > 7) {
			parler("J'ai préparé une super potion de force " + ForcePotion);
		
		}
		else {
			parler("Je n'ai pas trouvé tous les ingrédients, ma potion "
					+ "est seulement de force " + ForcePotion);
		}
		
	}
	
	public void booster(Gaulois gaulois) {
		if (gaulois.getNom() == "Obélix"){
				parler("Non, Obélix !... Tu n'auras pas de potions magique !");
		}
		gaulois.boirePotion(ForcePotion);
		
	}
	
	public static void main(String[] args) {
		Druide Panoramix = new Druide("Panoramix ", 5, 10);
		Panoramix.preparerpotion();
	}
	

}
