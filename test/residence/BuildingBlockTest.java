package residence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuildingBlockTest {
    @Test
    public void testCreateBuildingBlock1() {
        BuildingBlock buildingBlock = new BuildingBlock();
        assertEquals(0, buildingBlock.getNumberOfApartments());
    }

}