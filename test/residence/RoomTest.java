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
}