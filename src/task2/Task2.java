package task2;

import java.util.List;

public class Task2 {
    static List<Integer> list = List.of(50, 63, 556, 27, 1, 9, 47, 56, 89, 975);

    public static void main(String[] args) {
        task2(list);
        System.out.println();
    }

    public static void task2(List<Integer> list) {
        List<Integer> res = list.stream().filter(e -> e % 2 == 0).toList();
        System.out.println(res);
    }
}