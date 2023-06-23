import java.util.Map;

public class Place {
	
	
	private String numPlace; // Créez une classe Place avec un numéro (chaîne de caractères)
	//  Cette map indique si la place est occupée pour une séance donnée.
	public Map<Seance, Boolean> isOccupied;  
	
	public Place() {}


	public Place(String numPlace, Map<Seance, Boolean> isOccupied) {
		super();
		this.numPlace = numPlace;
		this.isOccupied = isOccupied;
	}


	public Place(String numPlace) {
		super();
		this.numPlace = numPlace;
	}


	public String getNumPlace() {
		return numPlace;
	}


	public void setNumPlace(String numPlace) {
		this.numPlace = numPlace;
	}


	public Map<Seance, Boolean> getIsOccupied() {
		return isOccupied;
	}


	public void setIsOccupied(Map<Seance, Boolean> isOccupied) {
		this.isOccupied = isOccupied;
	}
	
	
}
