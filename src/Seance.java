import java.sql.Time;
import java.util.Date;
import java.util.List;


public class Seance {
	
	private Film film;
	private Date date;
	private Time heure;
	private Salle salle;
	private List<Reservation> reservations;
	
	public Seance() {}
	
	public Seance(Film film, Date date, Time heure, Salle salle) {
		super();
		this.film = film;
		this.date = date;
		this.heure = heure;
		this.salle = salle;
	}

	public Seance(Film film, Date date, Time heure, Salle salle, List<Reservation> reservations) {
		super();
		this.film = film;
		this.date = date;
		this.heure = heure;
		this.salle = salle;
		this.reservations = reservations;
	}

	
	public Seance(Film film, Date date) {
		super();
		this.film = film;
		this.date = date;
	}

	public Film getFilm() {
		return film;
	}

	public void setFilm(Film film) {
		this.film = film;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Time getHeure() {
		return heure;
	}

	public void setHeure(Time heure) {
		this.heure = heure;
	}

	public Salle getSalle() {
		return salle;
	}

	public void setSalle(Salle salle) {
		this.salle = salle;
	}

	public List<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}
/**
 * Ajouter une réservation
 * @param reservation
 */
	public void addReservation(Reservation reservation) {
		
			reservations.add(reservation);
	
	} 
	
	// Vérifier si la séance est complète (isFull()) qui renvoie true
	//si toutes les places de la séance sont réservées, sinon false
	/**
	 * Vérifier si la séance est complète
	 * @return
	 */
	public boolean isFull() {
			if(salle.getCapaciteSalle()==reservations.size()) {
				return true;
			}else {
				return false;
			}
	} 
	
}
