package Task4;

import java.util.Comparator;
import java.util.List;

public class MainT4 {
    public static void main(String[] args) {
        //Создаем экземпляр класса DataContainer с заполнителем типа String
        DataContainer<String> dataContainer = new DataContainer<>();
        // Добавляем строки
        dataContainer.add("Уронили мишку на пол");
        dataContainer.add("Оторвали мишке лапу");
        dataContainer.add("Все равно его не брошу");
        dataContainer.add("Потому что он хороший");

        System.out.println("Элемент с индексом 1:");
        System.out.println(dataContainer.get(1)); // выводим элемент полученный по индексу 1
        System.out.println("------------------------------");
        System.out.println("Вывод всего списка:");
        dataContainer.print(); // вывод всего списка
        System.out.println("------------------------------");
        System.out.println("Сортировка в прямом порядке:");
        dataContainer.sort(null); // сортировка в прямом порядке
        dataContainer.print();  // вывод списка после сортировки
        System.out.println("------------------------------");
        System.out.println("Сортировка в обратном порядке:");
        dataContainer.sort(Comparator.reverseOrder()); // сортировка в обратном порядке
        dataContainer.print();  // вывод списка после сортировки
    }

}
