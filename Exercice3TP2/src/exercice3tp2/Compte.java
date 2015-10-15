package exercice3tp2;

public class Compte {
 private int Numero_Compte;
 private double Solde;
 public double getSolde() {
	return Solde;
}
public void setSolde(double solde) {
	Solde = solde;
}
private double Taux;	
public Compte(int Numero_Compte , double Solde , double Taux){
	this.Numero_Compte = Numero_Compte ;
	this.Solde = Solde;
	this.Taux = Taux;
}
public void Afficher(){
	System.out.println(" Le compte numéro " +Numero_Compte+ " est de " +Solde);
}
public void Interet(){
	double interet;
	interet = Solde * Taux;
	System.out.println("L'interet du compte Numero " +Numero_Compte+ " est : " +interet);
}
public void Ajout(double Montant){
	Solde = Montant + Solde ;
}
public void Retrait(double Montant){
	if( Solde >= Montant)
		Solde = Solde - Montant;
}
}
