package Database;

import model.Room;

import java.util.HashMap;

public class RoomDatatbase {
    HashMap<String, Room>roomDB;
    public RoomDatatbase(){
        roomDB=new HashMap<>();
    }

    public Room getUnoccupiedRoom(){
        for(String roomId : roomDB.keySet()){
            Room room = roomDB.get(roomId);
            if(!room.isOccupied()){
                return room;
            }
        }
        return null;
    }
    public int getTotalRooms(){
        return roomDB.size();
    }
    public void addRoomToDB(Room room){
        String roomId = room.getRoomId();
        roomDB.put(roomId,room);
    }
}
