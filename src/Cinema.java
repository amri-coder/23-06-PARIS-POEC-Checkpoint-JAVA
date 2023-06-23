import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cinema {
	
	private String nom;
	private String adresse; 
	private List<Film> films;
	private List<Seance> seances;
	private List<Salle> salles;
	
	public Cinema() {}
	public Cinema(String nom, String adresse) {
		this.nom=nom;
		this.adresse=adresse;
	}
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public List<Film> getFilms() {
		return films;
	}
	public void setFilms(List<Film> films) {
		this.films = films;
	}
	public List<Seance> getSeances() {
		return seances;
	}
	public void setSeances(List<Seance> seances) {
		this.seances = seances;
	}
	public List<Salle> getSalles() {
		return salles;
	}
	public void setSalles(List<Salle> salles) {
		this.salles = salles;
	}
	/**
	 * Ajouter un film
	 * @param film
	 */
	public void addFilm(Film film) {
		films.add(film);
	}  
	/**
	 * Ajouter une salle
	 * @param salle
	 */
	public void addSalle(Salle salle) {
		salles.add(salle);
	}
	/**
	 * Supprimer un film
	 * @param film
	 * @return
	 */
	public boolean removeFilm(Film film) {
		if(films.contains(film)) {
			films.remove(film);
			return true;
		}else {
			return false;
		}
	}
	/**
	 * Programmer une séance
	 * @param film
	 * @param date
	 * @param heure
	 * @param salle
	 */
	public void scheduleSeance(Film film, Date date, Time heure, Salle salle) {
		Seance seance= new Seance(film, date, heure, salle);
		seances.add(seance);
	}
	/**
	 * Récupérer toutes les séances d'un film à une date donnée
	 * @param film
	 * @param date
	 * @return
	 */
	public List<Seance> getAllSeancesForFilmOnDate(Film film, Date date) {
		List<Seance> getAllSeances = new ArrayList<>();
		Seance seance = new Seance(film, date);
		seance.getDate();
		seance.getFilm();
		for(Seance seances:seances) {
			if(seances.equals(seance)) {
				getAllSeances.add(seance);
			}
		}
		return getAllSeances;
	} 
	

}
