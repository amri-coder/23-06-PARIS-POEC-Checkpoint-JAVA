import java.util.List;

public class Client {

	private String nom; 
	private String email;
	private List<Reservation> reservations;
	
	
	public Client() {}

	

	public Client(String nom, String email) {
		super();
		this.nom = nom;
		this.email = email;
	}



	public Client(String nom, String email, List<Reservation> reservations) {
		super();
		this.nom = nom;
		this.email = email;
		this.reservations = reservations;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public List<Reservation> getReservations() {
		return reservations;
	}


	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}
	/**
	 * Faire une réservation
	 * @param seance
	 * @param salle
	 * @param place
	 * @return
	 */
	public Reservation reserve(Seance seance, Salle salle, Place place) {
		if(seance.isFull()) {
			return null;
		}else {
			Reservation reservation = new Reservation(seance, salle, place);
			reservations.add(reservation);
			seance.addReservation(reservation);
			place.getIsOccupied().put(seance, true);
			return reservation;
		}
	}
}
