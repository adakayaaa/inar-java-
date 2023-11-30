package week_11.assignments;


public class Question_11_02 {
    public static void main(String[] args) {
        Person person=new Person("Gurol","9999999","gurol@gmail.com","Istanbul");
        System.out.println(person.toString());

        System.out.println("-------------------");

        Student student= new Student("Nafiz","3333333","nafiz@gmail.com","Ankara" ,0);
        System.out.println(student.toString());

        System.out.println("-------------------");

        Employee employee=new Employee("Recai","6666666","recai@gmail.com","Istabul","910",60000.0);
        System.out.println(employee.toString());

        System.out.println("-------------------");

        Faculty faculty=new Faculty("Serhat","4133333","serhat@gmail.com","Texas,Dallas","101",50000.0,"10am to 6pm","manager");
        System.out.println(faculty.toString());

        System.out.println("-------------------");

        Staff staff=new Staff("Elon","20390934","elon@musk.com","California","12",6005000.0,"CEO");
        System.out.println(staff.toString());
    }
}

