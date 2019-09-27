package residence;

import java.util.ArrayList;
import java.util.Arrays;

public class Apartment {
    private ArrayList<Room> roomList;

    public Apartment(Room... rooms) {
        roomList = new ArrayList<>(Arrays.asList(rooms));
    }

    public int getSize() {
        int size = 0;
        for (Room room: roomList) {
            size += room.getSize();
        }
        return size;
    }

    public int getRoomCount() {
        return 0;
    }

}
