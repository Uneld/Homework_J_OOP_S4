package Task3;
//Задача 3 (по желанию):Напишите обобщенную функцию getMax, которая принимает два параметра типа T и возвращает максимальное значение из них.
//В этом примере мы объявляем обобщенную функцию getMax, которая принимает два параметра типа T, ограниченных интерфейсом Comparable. Мы используем метод compareTo для сравнения значений и возвращаем максимальное значение из двух.
//В методе main мы вызываем getMax с разными типами данных: целое число (Integer), число с плавающей запятой (Double) и строку (String). В результате мы получаем максимальные значения из каждой пары и выводим их на консоль.
//Обобщения позволяют нам писать универсальный код, который может работать с разными типами данных, сохраняя при этом безопасность типов.
public class MainT3 {
    public static <T extends Comparable> T getMax(T arg1, T arg2){ //реализация метода нахождения максимума
        if (arg1.compareTo(arg2) < 0) {
            return arg2;
        }
        return arg1; //т.к. в остальных случаях или arg1 > arg2 или arg1 = arg2
    }
    public static void main(String[] args) {
        Integer ival1 = 10, ival2 = 20;
        System.out.println(getMax(ival1, ival2));

        Double dval1 = 35.66, dval2 = 15.11;
        System.out.println(getMax(dval1, dval2));

        String sval1 = "string", sval2 = "string";
        System.out.println(getMax(sval1, sval2));
    }
}
