package task5;

public class Item {
    private final String name; //имя
    private final int volume; //объем
    private final int value; //ценность

    public Item( String name, int volume, int value) {
       this.value = value;
       this.volume = volume;
       this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public int getValue() {
        return value;
    }
}

