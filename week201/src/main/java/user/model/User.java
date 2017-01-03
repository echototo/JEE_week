package user.model;

public class User {
	
	private String mail;
	private String prenom;
	private String nom;
	private String motDePasse;
	
	public User(){}
	
	public User(String email, String lastname, String firstname, String password) {
		this.mail=email;
		this.nom=lastname;
		this.prenom=firstname;
		this.motDePasse=password;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getMotDePasse() {
		return motDePasse;
	}
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	
	
}
