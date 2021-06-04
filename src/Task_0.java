import java.util.*;
import java.util.stream.*;

/**
 *
 0. Создать коллекцию класса ArrayList наполнить ее элементами рандомными элементами типа Integer.
 С помощью Stream'ов:
 - Удалить дубликаты
 - Вывести все четные элементы в диапазоне от 7 до 17 (включительно)
 - Каждый элемент умножить на 2
 - Отсортировать и вывести на экран первых 4 элемента
 - Вывести количество элементов в стриме
 - Вывести среднее арифметическое всех чисел в стриме

 */


public class Task_0 {
    public static void main(String[] args) {

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add((int) (Math.random()*100));
        integerArrayList.add((int) (Math.random()*100));
        integerArrayList.add((int) (Math.random()*100));
        integerArrayList.add((int) (Math.random()*100));
        integerArrayList.add((int) (Math.random()*100));
        integerArrayList.add((int) (Math.random()*100));
        integerArrayList.add((int) (Math.random()*100));
        integerArrayList.add((int) (Math.random()*100));
        integerArrayList.add((int) (Math.random()*100));
        integerArrayList.add((int) (Math.random()*100));

        Stream<Integer> integerStream = integerArrayList.stream();
        System.out.println(integerStream.collect(Collectors.toList()));


        System.out.println(integerArrayList.stream()
                .distinct()
                .filter(n-> n%2==0 && n>=7 && n<=17)  // вывод всех четных элементов от 7 до 17
                .collect(Collectors.toList()));

        System.out.println(integerArrayList.stream()
                .map(n-> n*2) //каждый элемент умножаем на 2
                .sorted()     // сортируем
                .limit(4)     // выводим первых 4 элемента
                .collect(Collectors.toList()));


        System.out.println(integerArrayList.stream().count()); // количество элементов в стриме


        OptionalDouble obj;
        try (IntStream stream = IntStream.of(1, 2, 6, 15, 25, 56)) {
            obj = stream.average();                             // среднее арифметическое
        }
        if (obj.isPresent()) {

            System.out.println(obj.getAsDouble());
        }
        else {
            System.out.println("Операция невозможна");
        }

//        IntStream integerStream1 = (IntStream) integerArrayList.stream();
//        OptionalDouble obj;
//        try (IntStream stream = (IntStream) integerStream1) {      // не работает, если вставляю свой первоначальный стрим
//            obj = stream.average();                             // среднее арифметическое
//        }
//        if (obj.isPresent()) {
//
//            System.out.println(obj.getAsDouble());
//        }
//        else {
//            System.out.println("Операция невозможна");
//        }

    }

}
