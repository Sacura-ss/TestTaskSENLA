package task5;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Safe {
    private final int value;
    private Item[] items;

    public Safe(Item[] items, int value) {
        this.items = items;
        this.value = value;
    }

    public Item[] getItems() {
        return items;
    }

    public int getValue() {
        return value;
    }

    //Описание состояния рюкзака
    public String getDescription() {
        return items == null ? "" : Arrays.stream(items).map(Item::getName).collect(Collectors.joining("+")) + "-" + getValue();
    }
}
// Using Arrays.stream() to convert array into Stream
// stream().map() позволяет преобразовать объект во что-то еще. (В нашем случае списка предметов в их имя)
/*Большинство операций класса Stream, которые модифицируют набор данных, возвращают этот набор в виде потока.
Однако бывают ситуации, когда хотелось бы получить данные не в виде потока, а в виде обычной коллекции,
например, ArrayList или HashSet. И для этого у класса Stream определен метод collect. */
//joining() Returns a Collector that concatenates the input elements into a String, in encounter order.
//joining(CharSequence delimiter) Returns a Collector that concatenates the input elements, separated by the specified delimiter, in encounter order.