package residence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApartmentTest {
    @Test
    public void testCreateApartment1() {
        Apartment apartment = new Apartment();
        assertEquals(0, apartment.getSize());
        assertEquals(0, apartment.getRoomCount());
    }

    @Test
    public void testCreateApartment2() {
        Apartment apartment = new Apartment();
        assertEquals(59, apartment.getSize());
    }
}