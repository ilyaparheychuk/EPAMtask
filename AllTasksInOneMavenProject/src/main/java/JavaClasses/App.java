package JavaClasses;

import java.util.GregorianCalendar;

public class App {

    public static void main(String[] args) {

        Student[] stud = new Student[4];
        stud[0] = new Student(1, "Ilya", "Ilyich", "Ilychov", new GregorianCalendar(1995, 6, 1), "Minsk", "029-161-33-33", "FMO", 4, 4);
        stud[1] = new Student(2, "Pavel", "Pavlovich", "Pavlov", new GregorianCalendar(1994, 7, 12), "Magilov", "029-111-99-33", "FFF", 3, 1);
        stud[2] = new Student(3, "Aleksei", "Alekseevich", "Alexsov", new GregorianCalendar(1991, 3, 20), "Oshmyani", "029-222-10-30", "PF", 1, 1);
        stud[3] = new Student(4,"Marina","Grogorievna","Marinovich", new GregorianCalendar(1996,1,25), "Logoisk", "029-111-11-11", "FMO", 4,4);

        List st = new List();

        for (Student i : stud) {
            st.addStudent(i);
        }
        //  OUTPUT ALL
        System.out.println("All students:");
        st.listOut(stud);
        //  A)
        System.out.println("List of students of a set faculty:");
        st.listOutByFaculty("FMO");
        //  B)
        System.out.println("List of students of set faculty and course:");
        st.listOutByFacultyAndCourse("FMO",4);
        //  C)
        System.out.println("List of students who were born after set year: ");
        st.listOutByYear(new GregorianCalendar(1994, 9, 9));
        //  D)
        System.out.println("List of group:");
        st.listOutByGroup(1);
    }
}
