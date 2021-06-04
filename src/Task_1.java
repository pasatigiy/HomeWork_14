import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 1. Создать коллекцию класса ArrayList со значениями имен всех студентов в группе
 * С помощью Stream'ов:
 * 	- Вернуть количество количество людей с вашим именем (вне зависимости от верхнего/нижнего регистра букв)
 * 	- Выбрать все имена, начинающиеся на "а" (вне зависимости от верхнего/нижнего регистра букв)
 * 	- Отсортировать и вернуть первый элемент коллекции или "Empty@, если коллекция пуста
 */

public class Task_1 {

    public static void main(String[] args) {

        Collection<String> studentsList = new ArrayList<> ();
        studentsList.add("Alex");
        studentsList.add("Svetlana");
        studentsList.add("Maria");
        studentsList.add("Vitaliy");
        studentsList.add("Evgenii");
        studentsList.add("Vitaliy");
        studentsList.add("Katharina");
        studentsList.add("Olga");
        studentsList.add("Mary");
        studentsList.add("Lera");
        studentsList.add("Antonio");
        studentsList.add("Yulia");
        studentsList.add("Aina");
        studentsList.add("Tanya");
        studentsList.add("Anatoliy");

        Stream<String> streamStudentsList = studentsList.stream();

        System.out.println(streamStudentsList
                .filter("Vitaliy"::equalsIgnoreCase) // выводим количество студентов с именем Vitaliy
                .count());
        System.out.println("-----------------------------");


        Stream<String> streamStudentsList1 = studentsList.stream();
                 streamStudentsList1               //выводим все имена начинающиеся на "a"
                         .map(String ::toUpperCase)
                         .filter(str-> str.startsWith("A"))
                         .forEach(System.out::println);
        System.out.println("-----------------------------");


        Stream<String> streamStudentsList2 = studentsList.stream();
        streamStudentsList2
                .sorted()
                .limit(1)
                .forEach(x-> System.out.println(x)); //сортируем и возвращаем первый элемент коллекции

    }
}
