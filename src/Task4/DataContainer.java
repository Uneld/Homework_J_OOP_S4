package Task4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DataContainer<T> { //используем обобщение с типом T
    List<T> container; // обявляем список для хранения элементов

    public DataContainer() {
        this.container = new ArrayList<>(); //инициализируем список
    }

    //Метод добавления новых элементов с обобщением
    public void add(T newElem) {
        container.add(newElem);
    }

    //метод получения по индексу с проверкой на пустоту списка + обобщение
    public T get(Integer index) {
        if (container.isEmpty()) {
            System.out.println("Список пуст");
            return null;
        }
        return container.get(index);
    }

    //вывод списка в консоль с проверкой на пустоту списка
    public void print() {
        if (container.isEmpty()) {
            System.out.println("Список пуст");
        }
        System.out.println(container);
    }

    //реализация метода сортировки по компаратору с обобщением
    public void sort(Comparator<T> comparator) {
        container.sort(comparator);
    }

}
