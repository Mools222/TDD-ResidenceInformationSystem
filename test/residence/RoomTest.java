package residence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {
    @Test
    public void testRoomKitchen() {
        Room room = new Room();
        room.setSize(14);
        assertEquals(14, room.getSize());
    }
}