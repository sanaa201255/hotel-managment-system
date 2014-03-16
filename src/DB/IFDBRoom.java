package DB;
import Model.*;

import java.util.ArrayList;


public interface IFDBRoom {
   
    public ArrayList<Room> getAllRooms();
    public Room searchRoomId(int roomId);
    public int insertRoom(Room room);
    public int updateRoom(Room room);

    
}
