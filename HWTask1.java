package Java_DZ.JAVA_DZ_sem3;

 // Пусть дан произвольный список целых чисел, удалить из него четные числа

import java.util.*;
public class HWTask1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(17);
        list.add(22);
        list.add(331);
        list.add(51);
        list.add(124);
        list.add(89);
        list.add(4);
        list.add(12);
        list.add(61);

        System.out.println(list);

        list.removeIf(num -> num % 2 == 0);
        System.out.println(list);
    }
} 

