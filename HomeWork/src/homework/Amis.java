package homework;
import java.util.Scanner;
public class Amis {
public static void main (String [] args){
	@SuppressWarnings("resource")
	Scanner clavier = new Scanner (System.in);
	Personne p = new Personne ("HELEILI" , "Amel" , "algerienne");
	Personne p1 = new Personne("BENTAYEB" , "Malika" , "algerienne");
	Personne p2 = new Personne("SMITH" , "Sam" , "americaine");
	Personne p3 = new Personne("STIWART" , "Marie" , "française");
	Personne p4 = new Personne("ABI-AYAD" , "Yacine" ,"algerienne");
	        p.AjouterAmi(p1);
			p.AjouterAmi(p2);
			p.AjouterAmi(p3);
			p.AjouterAmi(p4);
	int choix = 0;
	while( choix != 4){
		System.out.println(" Que voulez vous faire ? ");
		System.out.println(" Tapez 1 si vous voulez afficher toute la liste d'amis ");
		System.out.println(" Tapez 2 si vous voulez afiicher la liste d'amis algeriens ");
		System.out.println(" Tapez 3 si vous voulez Afficher la liste d'amis etrangers ");
		System.out.print(" votre choix : ");
		choix = clavier.nextInt();
		
		switch( choix ){
		case 1 :{
			p.AfficherListeAmis();
		}
		break;
		case 2 :{
			p.AmisAlgerien();
		}
		break;
		case 3 :{
			p.AmisEtranger();
		}
		break;
		}
	}
}
}
