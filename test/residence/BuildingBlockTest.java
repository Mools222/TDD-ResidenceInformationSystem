package residence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuildingBlockTest {
    @Test
    public void testCreateBuildingBlock1() {
        BuildingBlock buildingBlock = new BuildingBlock("Store Gade 19, 7400 Herning");
        assertEquals(0, buildingBlock.getNumberOfApartments());
        assertEquals(0, buildingBlock.getSize());
        assertEquals(0, buildingBlock.getAddress());
    }

}