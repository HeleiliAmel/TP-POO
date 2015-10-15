package homework;
public class Personne {
   private String Nom;
   private String Prenom; 
   private String Nationalite;
   private static int Nombre_Amis = 0;
   private Personne [] amis = new Personne [100];
public Personne(String Nom , String Prenom , String Nationalite){
	this.Nom = Nom;
	this.Prenom = Prenom;
	this.Nationalite = Nationalite;
}
public Personne (Personne autre){
	Nom = autre.Nom;
	Prenom = autre.Prenom;
	Nationalite = autre.Nationalite;
}
public String toString (){
	return this.Nom+ " " +this.Prenom+ " est de nationalité : " +this.Nationalite;
}
public void AjouterAmi (Personne p){
	amis[Nombre_Amis] = new Personne (p);
	Nombre_Amis++;
}
public void AmisAlgerien (){
	for(int i = 0 ; i < Nombre_Amis ; i++){
		if (this.amis[i].Nationalite == "algerienne")
			System.out.println(this.amis[i]);
	}
}
public void AmisEtranger (){
	for(int i = 0 ; i < Nombre_Amis ; i++){
		if (this.amis[i].Nationalite != "algerienne")
			System.out.println(this.amis[i]);
	}
}
public void AfficherListeAmis(){
	for (int i = 0 ; i < Nombre_Amis ; i++)
		System.out.println(this.amis[i]);
}
}
