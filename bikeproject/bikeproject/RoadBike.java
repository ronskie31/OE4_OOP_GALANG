package bikeproject;

// implementation of RoadBike
public class RoadBike extends Bike implements RoadParts {
	// properties of RoadBike
	private String tyreWidth;
	private String posHeight;

	// constructor
	public RoadBike(String handleBars, String tyres, String seatType, String frame, int gears, String tyreWidth,
			String posHeight) {
		super(handleBars, tyres, seatType, frame, gears);
		this.tyreWidth = tyreWidth;
		this.posHeight = posHeight;
	}

	@Override
	public String getTyreWidth() {
		return this.tyreWidth;
	}

	@Override
	public void setTyreWidth(String newValue) {
		this.tyreWidth = newValue;
	}

	@Override
	public String getPosHeight() {
		return this.posHeight;
	}

	@Override
	public void setPosHeight(String newValue) {
		this.posHeight = newValue;
	}

	@Override
	public String toString() {
		return super.toString() +
				"This Roadbike has " + tyreWidth + " tyres and a post width of " + posHeight + ".\n";
	}
}
