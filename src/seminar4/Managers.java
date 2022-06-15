package seminar4;

public class Managers extends Employee{
    public Managers(String sername, String name, String patronymic, Integer workExperience, String jobTitle) {
        super(sername, name, patronymic, workExperience, jobTitle);
    }
    protected String[] listEmployee;
    //protected Integer lvl;


//    public Managers(String name) {
//        super(name);
//    }
//
//    public Managers() {
//        super(String.format(""));
//    }

    public String getInfo() {
        return String.format(super.getInfo());
    }


}
