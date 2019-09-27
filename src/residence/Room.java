package residence;

public class Room {
    private int size;
    private Type type;

    public Room(int size, Type type) {
        this.size = size;
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public Type getType() {
        return type;
    }

}
