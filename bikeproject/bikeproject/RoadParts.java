package bikeproject;

public interface RoadParts {
	// constant declarations
	public final String TERRAIN = "track_racing";

	// required methods after implementation
	public String getTyreWidth();

	public void setTyreWidth(String newValue);

	public String getPosHeight();

	public void setPosHeight(String newValue);
}
