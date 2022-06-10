package bikeproject;

public class MountainBike extends Bike implements MountainParts {
	// properties of MountainBike
	private String suspension;
	private String type;
	private String frameSize;

	// constructor
	public MountainBike(String handleBars, String tyres, String seatType, String frame, int gears, String suspension,
			String type, String frameSize) {
		super(handleBars, tyres, seatType, frame, gears);
		this.suspension = suspension;
		this.type = type;
		this.frameSize = frameSize;
	}

	@Override
	public String getSuspension() {
		return this.suspension;
	}

	@Override
	public void setSuspension(String newValue) {
		this.suspension = newValue;
	}

	@Override
	public String getType() {
		return this.type;
	}

	@Override
	public void setType(String newValue) {
		this.type = newValue;
	}

	// getter and setter for MountainBike properties
	public String getFrameSize() {
		return frameSize;
	}

	public void setFrameSize(String frameSize) {
		this.frameSize = frameSize;
	}

	@Override
	public String toString() {
		return super.toString() +
				"This mountain bike is a " + type + " bike and has a " + suspension + " suspension and a frame size of "
				+ frameSize + ".\n";
	}
}
