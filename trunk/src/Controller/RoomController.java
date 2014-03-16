package Controller;

import java.util.ArrayList;

import DB.*;
import Model.*;

public class RoomController {
	
	
	private DBRoom dbRoom;
	
	
	public RoomController(){

	}
	
	public Room searchRoomsId(int roomId){
		
		dbRoom = new DBRoom();
		return dbRoom.searchRoomId(roomId);
		
	}
	
	public  void insertRoom(Room room){
		
		dbRoom = new DBRoom();
		dbRoom.insertRoom(room);
		
	}
	
	
	public void updateRoom(Room room) {
		
		dbRoom=new DBRoom();
		dbRoom.updateRoomPrice(room);
		
	}

	public void updateRoomCleaningStatus(Room room) {
		
		dbRoom=new DBRoom();
		dbRoom.updateRoomLastClean(room);
		
	}

	
	
	public ArrayList<Room> getAllRoom() {
		
		dbRoom = new DBRoom();
		return dbRoom.getAllRooms();
		
	}
	
	public void updateRoomStatus(Room room) {
		
		dbRoom = new DBRoom();
		dbRoom.updateRoomStatus(room);
	
		
	}
	
	public void updateRoomPrice(Room room) {
		
		dbRoom = new DBRoom();
		dbRoom.updateRoomPrice(room);
		
		
	}
	
	public void updateRoomDescription(Room room) {
		
		dbRoom = new DBRoom();
		dbRoom.updateRoomDescription(room);
		
		
	}
	
	public void deleteRoom(int roomId) {
		
		dbRoom = new DBRoom();
		dbRoom.deleteRoom(roomId);
	
	}
	
	}
	


