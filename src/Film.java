import java.util.Date;

public class Film {

	private String nom; 
	private String synopsis; 
	private Date dateDeSortie; 
	
	public Film() {}

	public Film(String nom, String synopsis, Date dateDeSortie) {
		super();
		this.nom = nom;
		this.synopsis = synopsis;
		this.dateDeSortie = dateDeSortie;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	public Date getDateDeSortie() {
		return dateDeSortie;
	}

	public void setDateDeSortie(Date dateDeSortie) {
		this.dateDeSortie = dateDeSortie;
	}
	
}
