package residence;

import java.util.ArrayList;
import java.util.Arrays;

public class BuildingBlock {
    private String address;
    private ArrayList<Apartment> apartmentList;

    public BuildingBlock(String address, Apartment...apartments) {
        this.address = address;
        apartmentList = new ArrayList<>(Arrays.asList(apartments));
    }

    public int getNumberOfApartments() {
        return apartmentList.size();
    }

    public int getSize() {
        return 0;
    }

    public String getAddress() {
        return address;
    }
}
