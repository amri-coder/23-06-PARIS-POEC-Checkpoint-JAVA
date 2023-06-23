import java.util.List;

public class Salle {
	
	 // = listPlaces.size();
	private List<String> listPlaces;
	private int capaciteSalle;
	
	public Salle() {}
	

	public Salle(int capaciteSalle, List<String> listPlaces) {
		super();
		this.capaciteSalle = capaciteSalle;
		this.listPlaces = listPlaces;
	}


	public int getCapaciteSalle() {
		return capaciteSalle;
	}

	public void setCapaciteSalle(int capaciteSalle) {
		this.capaciteSalle = capaciteSalle;
	}

	public List<String> getListPlaces() {
		return listPlaces;
	}

	public void setListPlaces(List<String> listPlaces) {
		this.listPlaces = listPlaces;
	}
	

}
