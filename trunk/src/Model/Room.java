package Model;

public class Room {

	
	private int roomId;
	private String roomType;
	private String status;
	private String description;
	private String lastClean;
	private double price;
	
	
	public Room(int roomId, String roomType, String status, String description,
			double price, String lastClean) {
		
		this.roomId = roomId;
		this.roomType = roomType;
		this.status = status;
		this.description = description;
		this.price = price;
		this.lastClean = lastClean;
	}
	
	public Room() {
		
	}

	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String  status) {
		this.status = status;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getLastClean() {
		return lastClean;
	}

	public void setLastClean(String lastClean) {
		this.lastClean = lastClean;
	}
	
}
