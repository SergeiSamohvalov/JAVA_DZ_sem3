package Java_DZ.JAVA_DZ_sem3;

// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

import java.util.*;

public class HWTask2 {
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
    Collections.sort(list);
    int min = list.get(0);
    int max = list.get(list.size() - 1);
    double n = Аverage(list);
    System.out.println("Минимальное значение: " + min);
    System.out.println("Максимальное значение: " + max);
    System.out.println("Среднее арифметичнское: " + n);
}

static double Аverage(ArrayList<Integer> list) {
    double sum = 0;
    for (int i = 0; i < list.size(); i++) {
        sum += list.get(i);
    }
    return sum / list.size();
}
}

