package seminar4;

import java.util.ArrayList;
import java.util.List;

public class Managers extends Employee {

    private ArrayList<Employee> subordinates;
    private Integer levelControl;


    /**
     * Создание персонала
     *
     * @param surname        Фамилия
     * @param name           Имя
     * @param patronymic     Отчество
     * @param workExperience Опыт
     * @param jobTitle       Должность
     * @param levelContor    стаж
     */
    public Managers(String surname, String name, String patronymic, Integer workExperience, String jobTitle, Integer levelContor) {
        super(surname, name, patronymic, workExperience, jobTitle);
        this.levelControl = levelContor;
        this.subordinates = new ArrayList<Employee>();

    }
    /**Добавление */
    public void addSubordinates(Employee employee) {
        subordinates.add(employee);
    }

    /**Удаление */
    public void removeSubordinates(Employee employee) {
        subordinates.remove(employee);
    }

    public String infoSubordinates() {
        String result = "Подчинённый(e) ";
        if(!subordinates.isEmpty()) {
            for (Employee employee : subordinates) {
                result += "\n" + employee.toString();
            }
        } else {
            result += "Don't";
        }


        return result + "\n";
    }

//        %d: целочисленных значений
//        %x: для вывода шестнадцатеричных чисел
//        %f: для вывода чисел с плавающей точкой
//        %e: для вывода чисел в экспоненциальной форме, например, 3.1415e+01
//        %c: для вывода одиночного символа
//        %s: для вывода строковых значений


    public String toString() {
        return super.toString() + String.format(" Уровень управления: %d", this.levelControl) + " " + infoSubordinates();
    }
}