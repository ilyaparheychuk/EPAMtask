import java.util.Calendar;
import java.util.GregorianCalendar;

public class List {
    private Student[] studentlist = new Student[10];

    int k = 0;

    public void addStudent(Student n) {
        studentlist[k++] = n;
    }

    // OUTPUT ALL
    public void listOut(Student[] studentlist) {

        for (Student m : studentlist) {

            System.out.print("ID: " + m.getId() + ", ");
            System.out.print("Name: " + m.getName() + ", ");
            System.out.print("Patronymic: " + m.getPatronymic() + ", ");
            System.out.print("Surname: " + m.getSurname() + ", ");
            System.out.print("ID: " + m.getId() + ", ");
            System.out.print("Birthdate: " + m.getBirthdate().get(Calendar.YEAR)+ "-"+ m.getBirthdate().get(Calendar.MONTH)
                    + "-"+ m.getBirthdate().get(Calendar.DAY_OF_MONTH) + ", ");
            System.out.print("Adress: " + m.getAdress() + ", ");
            System.out.print("Phone: " + m.getPhone() + ", ");
            System.out.print("Faculty: " + m.getFaculty() + ", ");
            System.out.print("Course number: " + m.getCourseNumber() + ", ");
            System.out.print("Group number: " + m.getGroupNumber() + ", ");
            System.out.println();
        }

    }

    //   A)
    public void listOutByFaculty(String faculty) {

        for (Student m : studentlist) {
            if(m != null) {

                if (faculty.equalsIgnoreCase(m.getFaculty())) {

                    System.out.print("ID: " + m.getId() + ", ");
                    System.out.print("Name: " + m.getName() + ", ");
                    System.out.print("Patronymic: " + m.getPatronymic() + ", ");
                    System.out.print("Surname: " + m.getSurname() + ", ");
                    System.out.print("ID: " + m.getId() + ", ");
                    System.out.print("Birthdate: " + m.getBirthdate().get(Calendar.YEAR)+ "-"+ m.getBirthdate().get(Calendar.MONTH)
                            + "-"+ m.getBirthdate().get(Calendar.DAY_OF_MONTH) + ", ");
                    System.out.print("Adress: " + m.getAdress() + ", ");
                    System.out.print("Phone: " + m.getPhone() + ", ");
                    System.out.print("Faculty: " + m.getFaculty() + ", ");
                    System.out.print("Course number: " + m.getCourseNumber() + ", ");
                    System.out.print("Group number: " + m.getGroupNumber() + ", ");
                    System.out.println();

                }
            }

        }

    }

    //    B)
    public void listOutByFacultyAndCourse(String Faculty, int course) {

        for (Student m : studentlist) {
            if (m != null) {
                if (m.getFaculty().equalsIgnoreCase(Faculty) && m.getCourseNumber() == course) {

                    System.out.print("ID: " + m.getId() + ", ");
                    System.out.print("Name: " + m.getName() + ", ");
                    System.out.print("Patronymic: " + m.getPatronymic() + ", ");
                    System.out.print("Surname: " + m.getSurname() + ", ");
                    System.out.print("ID: " + m.getId() + ", ");
                    System.out.print("Birthdate: " + m.getBirthdate().get(Calendar.YEAR) + "-" + m.getBirthdate().get(Calendar.MONTH)
                            + "-" + m.getBirthdate().get(Calendar.DAY_OF_MONTH) + ", ");
                    System.out.print("Adress: " + m.getAdress() + ", ");
                    System.out.print("Phone: " + m.getPhone() + ", ");
                    System.out.print("Faculty: " + m.getFaculty() + ", ");
                    System.out.print("Course number: " + m.getCourseNumber() + ", ");
                    System.out.print("Group number: " + m.getGroupNumber() + ", ");
                    System.out.println();

                }
            }
        }
    }

    //    C)
    public void listOutByYear(GregorianCalendar year) {

        for (Student m : studentlist) {
            if(m != null) {
                if (m.getBirthdate().get(Calendar.YEAR)>year.get(Calendar.YEAR)) {

                    System.out.print("ID: " + m.getId() + ", ");
                    System.out.print("Name: " + m.getName() + ", ");
                    System.out.print("Patronymic: " + m.getPatronymic() + ", ");
                    System.out.print("Surname: " + m.getSurname() + ", ");
                    System.out.print("ID: " + m.getId() + ", ");
                    System.out.print("Birthdate: " + m.getBirthdate().get(Calendar.YEAR)+ "-"+ m.getBirthdate().get(Calendar.MONTH)
                            + "-"+ m.getBirthdate().get(Calendar.DAY_OF_MONTH) + ", ");
                    System.out.print("Adress: " + m.getAdress() + ", ");
                    System.out.print("Phone: " + m.getPhone() + ", ");
                    System.out.print("Faculty: " + m.getFaculty() + ", ");
                    System.out.print("Course number: " + m.getCourseNumber() + ", ");
                    System.out.print("Group number: " + m.getGroupNumber() + ", ");
                    System.out.println();

                }
            }
        }

    }

    //     D)
    public void listOutByGroup(int groupe) {

        for (Student m : studentlist) {
            if (m != null) {
                if (m.getGroupNumber() == groupe) {

                    System.out.print("ID: " + m.getId() + ", ");
                    System.out.print("Name: " + m.getName() + ", ");
                    System.out.print("Patronymic: " + m.getPatronymic() + ", ");
                    System.out.print("Surname: " + m.getSurname() + ", ");
                    System.out.print("ID: " + m.getId() + ", ");
                    System.out.print("Birthdate: " + m.getBirthdate().get(Calendar.YEAR) + "-" + m.getBirthdate().get(Calendar.MONTH)
                            + "-" + m.getBirthdate().get(Calendar.DAY_OF_MONTH) + ", ");
                    System.out.print("Adress: " + m.getAdress() + ", ");
                    System.out.print("Phone: " + m.getPhone() + ", ");
                    System.out.print("Faculty: " + m.getFaculty() + ", ");
                    System.out.print("Course number: " + m.getCourseNumber() + ", ");
                    System.out.print("Group number: " + m.getGroupNumber() + ", ");
                    System.out.println();

                }
            }
        }
    }


}
