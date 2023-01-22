package task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Stream;

public class Task1 {
    public static void main(String[] args) {
        Stream<Integer> stream = new ArrayList<>(Arrays.asList(50, 63, 556, 27, 1, 9, 47, 56, 89, 975)).stream();
        findMinMax(
                stream,
                Integer::compareTo,
                (a, b) -> System.out.printf("Минимальный элемент: %s \nМаксимальный элемент: %s%n", a, b)
        );
        stream.close();
    }

    public static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {
        List<T> items = (List<T>) stream.sorted(order).toList();
        if (!items.isEmpty()) {
            minMaxConsumer.accept(items.get(0), items.get(items.size() - 1));

        } else {
            minMaxConsumer.accept(null, null);
        }
    }
}