package seminar4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//        List<String> hi = new ArrayList<>();
//        hi.add("l");
//        System.out.println(hi);


        ArrayList<Employee> people = new ArrayList<>();
        people.add(new Employee("Фамильяр", "Именный", "Отчествович", 1, "sdfsd"));


        people.add(new Managers("Фамильяоров", "Именованный", "Отчествович", 1, "dsf"));


        //Employee person = new Employee();
        System.out.println(people.get(0).getInfo());

        //Employee person2 = new Managers();
        System.out.println(people.get(1).getInfo());


//        List<Employee> teams = new ArrayList<>();
//
//
//        System.out.println(teams.get(0).getInfo());
    }
}
