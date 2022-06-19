package seminar4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Employee people = new Employee("Фамильяров", "Именный", "Отчествович", 4, "Рыболов");
        Employee people1 = new Employee("Иванов", "Иван", "Иваныч", 1, "Крысолов");
        Employee people2 = new Employee("Подмышкин", "Борис", "Морисович", 2, "Мышолов");
        Employee people3 = new Employee("Проппер", "Сергей", "Морковович", 3, "Котолов");
        System.out.println(people);
        System.out.println(people1);
        System.out.println(people2);
        System.out.println(people3);



        Managers manager = new Managers("Боссов", "Маруся", "Батуткин", 1, "Скамейка", 1);
        manager.addSubordinates(people);
        manager.addSubordinates(people1);
        System.out.println(manager);







    }
}


//    Создать класс служащий(сотрудник), содержащий следующие поля:
//        1. Фамилия
//        2. Имя
//        3. Отчество
//        4. Опыт работы
//        5. Должность
//        От него создать ещё один класс менеджер, содержащий все те же самые поля, но в дополнении содержащий:
//        1. Список подчинённых
//        2. Уровень управления
//        Все классы должны содержать метод печати информации об объекте класса