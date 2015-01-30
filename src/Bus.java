public class Bus {

	private String plateNumber;
	private Type type;
	private boolean availability;
	private int busNumber;

	public String getPlateNumber() {
		return this.plateNumber;
	}

	/**
	 * 
	 * @param plateNumber
	 */
	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}

	public Type getType() {
		return this.type;
	}

	/**
	 * 
	 * @param type
	 */
	public void setType(Type type) {
		this.type = type;
	}

	public boolean getAvailability() {
		return this.availability;
	}

	/**
	 * 
	 * @param availability
	 */
	public void setAvailability(boolean availability) {
		this.availability = availability;
	}

	public int getBusNumber() {
		return this.busNumber;
	}

	/**
	 * 
	 * @param busNumber
	 */
	public void setBusNumber(int busNumber) {
		this.busNumber = busNumber;
	}

}