package seminar4;


public class Employee {

    protected String surname;
    protected String name;
    protected String patronymic;
    protected Integer workExperience;
    protected String jobTitle;


    /**
     * Создание персонала
     * @param surname Фамилия
     * @param name Имя
     * @param patronymic Отчество
     * @param workExperience Опыт
     * @param jobTitle Должность
     */
    public Employee(String surname, String name, String patronymic, Integer workExperience, String jobTitle) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.workExperience = workExperience;
        this.jobTitle = jobTitle;
    }

    public Employee() {
        this.surname = "Не указан";
        this.name = "Не указан";
        this.patronymic = "Не указан";
        this.workExperience = -1;
        this.jobTitle = "Не указан";
    }



    @Override
    public String toString() {
        return String.format("-------------------------\nФамилия: %s. Имя: %s. Отчество: %s.\n Опыт: %x. Должность: %s.\n",
                this.surname, this.name, this.patronymic, this.workExperience,
                this.jobTitle, this.getClass().getSimpleName());
    }

}
