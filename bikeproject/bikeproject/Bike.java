package bikeproject;

// implementation of Bike
public class Bike implements BikeParts {
	// properties of Bike
	private String handleBars;
	private String tyres;
	private String seatType;
	private String frame;
	private int gears;

	// constructor
	public Bike(String handleBars, String tyres, String seatType, String frame, int gears) {
		this.handleBars = handleBars;
		this.tyres = tyres;
		this.seatType = seatType;
		this.frame = frame;
		this.gears = gears;
	}

	// implementation of required methods!
	@Override
	public String getHandleBars() {
		return this.handleBars;
	}

	@Override
	public void setHandleBars(String newValue) {
		this.handleBars = newValue;
	}

	@Override
	public String getTyres() {
		return this.tyres;
	}

	@Override
	public void setTyres(String newValue) {
		this.tyres = newValue;
	}

	@Override
	public String getSeatType() {
		return this.seatType;
	}

	@Override
	public void setSeatType(String newValue) {
		this.seatType = newValue;
	}

	// getters and setters for properties of bike
	public String getFrame() {
		return frame;
	}

	public void setFrame(String frame) {
		this.frame = frame;
	}

	public int getGears() {
		return gears;
	}

	public void setGears(int gears) {
		this.gears = gears;
	}

	@Override
	public String toString() {
		return MAKE + "\n" +
				"This bike has " + handleBars + " handlebars on a " + frame + " frame with " + gears + " gears.\n"
				+
				"It has a " + seatType + " seat with " + tyres + " tyres.\n";
	}
}
