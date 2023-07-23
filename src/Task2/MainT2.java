package Task2;

import java.util.ArrayList;
import java.util.Arrays;

//Задача 2 : Напишите обобщенный метод printArray, который принимает массив любого типа и выводит его элементы на консоль.
//В этом примере мы объявляем обобщенный метод printArray, который принимает массив типа T. Затем мы используем цикл for-each, чтобы пройти по всем элементам массива и вывести их на консоль.
//В методе main мы создаем массивы типов Integer и String и вызываем printArray для каждого из них. В результате мы получаем вывод на консоль элементов каждого массива.
//Таким образом, обобщенные методы позволяют нам создавать код, который может работать с разными типами данных, обеспечивая повторное использование и гибкость.
public class MainT2 {
    public static <T> void printArrayList(ArrayList<T> arrayList) { //реализация для ArrayList
        if (!arrayList.isEmpty()){
            System.out.println("Тип параметра: " + arrayList.get(0).getClass().getTypeName()); // после проверки на пустоту можно проверить тип у первого элемента
            System.out.println(arrayList);
            System.out.println("---------------------------");
        }
    }

    public static <T> void printArray(T[] array) { //реализация для массивов
        System.out.println("Тип параметра: " + array.getClass().getTypeName()); // получаем тип
        for (T item : array) {
            System.out.print(item + " ");
        }
        System.out.println("\n---------------------------");
    }

    public static void main(String[] args) {
        Integer[] iArray = new Integer[]{1, 2, 3, 4, 5};
        printArray(iArray);
        String[] sArray = new String[]{"s1", "s2", "s3", "s4", "s5"};
        printArray(sArray);
        Double[] dArray = new Double[]{1.1, 2.2, 3.3, 4.4, 5.5};
        printArray(dArray);

        printArrayList(new ArrayList<>(Arrays.asList(iArray)));
        printArrayList(new ArrayList<>(Arrays.asList(sArray)));
        printArrayList(new ArrayList<>(Arrays.asList(dArray)));
    }
}
