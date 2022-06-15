package seminar4;

public class Employee{
    protected String sername;
    protected String name;
    protected String patronymic;
    protected Integer workExperience;
    protected String jobTitle;


    public Employee(String sername, String name, String patronymic, Integer workExperience, String jobTitle) {
        this.sername = sername;
        this.name = name;
        this.patronymic = patronymic;
        this.workExperience = workExperience;
        this.jobTitle = jobTitle;

    }

    public Employee() {

    }

//    public Employee() {
//        this(String.format("Max %d"));
//    }

    public String getInfo() {
        return String.format("Surname: %s Name: %s Patronymic: %s WorkExperience: %x JobTitle: %s", this.sername, this.name, this.patronymic, this.workExperience, this.jobTitle, this.getClass().getSimpleName());

    }

    public void add(String dsf) {
    }
//        %d: целочисленных значений
//        %x: для вывода шестнадцатеричных чисел
//        %f: для вывода чисел с плавающей точкой
//        %e: для вывода чисел в экспоненциальной форме, например, 3.1415e+01
//        %c: для вывода одиночного символа
//        %s: для вывода строковых значений
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
