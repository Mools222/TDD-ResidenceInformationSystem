package residence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {
    @Test
    public void testRoomKitchen() {
        Room room = new Room(14, Type.KITCHEN);
        assertEquals(14, room.getSize());
        assertEquals(Type.KITCHEN, room.getType());
    }

    @Test
    public void testRoomBathroom() {
        Room room = new Room(9, Type.BATHROOM);
        assertEquals(9, room.getSize());
        assertEquals(Type.BATHROOM, room.getType());
    }

    @Test
    public void testRoomRoom() {
        Room room = new Room(20, Type.ROOM);
        assertEquals(20, room.getSize());
        assertEquals(Type.ROOM, room.getType());
    }
}