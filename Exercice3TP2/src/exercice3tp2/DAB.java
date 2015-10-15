package exercice3tp2;
import java.util.Scanner;
public class DAB {
public static void main(String[]args){
	Compte compte = new Compte (1,5000,0.5);
	compte.Afficher();
	compte.Interet();
int choix = 0;
while(choix != 3){
	System.out.println("Tapez 1 si vous voulez ajouter un montant ");
	System.out.println("Tapez 2 si vous voulez retirer un montant ");
	@SuppressWarnings("resource")
	Scanner clavier = new Scanner(System.in);
	System.out.print(" choix : ");
	choix = clavier.nextInt();
	switch(choix){
	case 1 :{
		System.out.print("Le montant que vous voulez ajouter au compte :");
		double montant = clavier.nextDouble();
		compte.Ajout(montant);
		compte.Afficher();
	}
	break;
	case 2 :{
		System.out.print("Le montant que vous voulez retirer au compte :");
		double montant = clavier.nextDouble();
		compte.Retrait(montant);
		compte.Afficher(); 
	}
	break;
	}
}
}
}
