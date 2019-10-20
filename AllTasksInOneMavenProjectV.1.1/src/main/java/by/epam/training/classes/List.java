package by.epam.training.classes;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class List {

    private Student[] studentList = new Student[10];

    int i = 0;

    public void addStudent(Student student) {
        studentList[i++] = student;
    }

    // OUTPUT ALL
    public void listOut(Student[] studentList) {
        for (Student student : studentList) {
            System.out.print("ID: " + student.getId() + ", ");
            System.out.print("Name: " + student.getName() + ", ");
            System.out.print("Patronymic: " + student.getPatronymic() + ", ");
            System.out.print("Surname: " + student.getSurname() + ", ");
            System.out.print("ID: " + student.getId() + ", ");
            System.out.print("Birthdate: " + student.getBirthdate().get(Calendar.YEAR) + "-" + student.getBirthdate().get(Calendar.MONTH)
                    + "-" + student.getBirthdate().get(Calendar.DAY_OF_MONTH) + ", ");
            System.out.print("Adress: " + student.getAdress() + ", ");
            System.out.print("Phone: " + student.getPhone() + ", ");
            System.out.print("Faculty: " + student.getFaculty() + ", ");
            System.out.print("Course number: " + student.getCourseNumber() + ", ");
            System.out.print("Group number: " + student.getGroupNumber() + ", ");
            System.out.println();
        }
    }

    //   A)
    public void listOutByFaculty(String faculty) {
        for (Student student : studentList) {
            if (student != null) {
                if (faculty.equalsIgnoreCase(student.getFaculty())) {
                    System.out.print("ID: " + student.getId() + ", ");
                    System.out.print("Name: " + student.getName() + ", ");
                    System.out.print("Patronymic: " + student.getPatronymic() + ", ");
                    System.out.print("Surname: " + student.getSurname() + ", ");
                    System.out.print("ID: " + student.getId() + ", ");
                    System.out.print("Birthdate: " + student.getBirthdate().get(Calendar.YEAR) + "-" + student.getBirthdate().get(Calendar.MONTH)
                            + "-" + student.getBirthdate().get(Calendar.DAY_OF_MONTH) + ", ");
                    System.out.print("Adress: " + student.getAdress() + ", ");
                    System.out.print("Phone: " + student.getPhone() + ", ");
                    System.out.print("Faculty: " + student.getFaculty() + ", ");
                    System.out.print("Course number: " + student.getCourseNumber() + ", ");
                    System.out.print("Group number: " + student.getGroupNumber() + ", ");
                    System.out.println();
                }
            }
        }
    }

    //    B)
    public void listOutByFacultyAndCourse(String Faculty, int course) {
        for (Student student : studentList) {
            if (student != null) {
                if (student.getFaculty().equalsIgnoreCase(Faculty) && student.getCourseNumber() == course) {
                    System.out.print("ID: " + student.getId() + ", ");
                    System.out.print("Name: " + student.getName() + ", ");
                    System.out.print("Patronymic: " + student.getPatronymic() + ", ");
                    System.out.print("Surname: " + student.getSurname() + ", ");
                    System.out.print("ID: " + student.getId() + ", ");
                    System.out.print("Birthdate: " + student.getBirthdate().get(Calendar.YEAR) + "-" + student.getBirthdate().get(Calendar.MONTH)
                            + "-" + student.getBirthdate().get(Calendar.DAY_OF_MONTH) + ", ");
                    System.out.print("Adress: " + student.getAdress() + ", ");
                    System.out.print("Phone: " + student.getPhone() + ", ");
                    System.out.print("Faculty: " + student.getFaculty() + ", ");
                    System.out.print("Course number: " + student.getCourseNumber() + ", ");
                    System.out.print("Group number: " + student.getGroupNumber() + ", ");
                    System.out.println();
                }
            }
        }
    }

    //    C)
    public void listOutByYear(GregorianCalendar year) {
        for (Student student : studentList) {
            if (student != null) {
                if (student.getBirthdate().get(Calendar.YEAR) > year.get(Calendar.YEAR)) {
                    System.out.print("ID: " + student.getId() + ", ");
                    System.out.print("Name: " + student.getName() + ", ");
                    System.out.print("Patronymic: " + student.getPatronymic() + ", ");
                    System.out.print("Surname: " + student.getSurname() + ", ");
                    System.out.print("ID: " + student.getId() + ", ");
                    System.out.print("Birthdate: " + student.getBirthdate().get(Calendar.YEAR) + "-" + student.getBirthdate().get(Calendar.MONTH)
                            + "-" + student.getBirthdate().get(Calendar.DAY_OF_MONTH) + ", ");
                    System.out.print("Adress: " + student.getAdress() + ", ");
                    System.out.print("Phone: " + student.getPhone() + ", ");
                    System.out.print("Faculty: " + student.getFaculty() + ", ");
                    System.out.print("Course number: " + student.getCourseNumber() + ", ");
                    System.out.print("Group number: " + student.getGroupNumber() + ", ");
                    System.out.println();
                }
            }
        }
    }

    //     D)
    public void listOutByGroup(int groupe) {
        for (Student student : studentList) {
            if (student != null) {
                if (student.getGroupNumber() == groupe) {
                    System.out.print("ID: " + student.getId() + ", ");
                    System.out.print("Name: " + student.getName() + ", ");
                    System.out.print("Patronymic: " + student.getPatronymic() + ", ");
                    System.out.print("Surname: " + student.getSurname() + ", ");
                    System.out.print("ID: " + student.getId() + ", ");
                    System.out.print("Birthdate: " + student.getBirthdate().get(Calendar.YEAR) + "-" + student.getBirthdate().get(Calendar.MONTH)
                            + "-" + student.getBirthdate().get(Calendar.DAY_OF_MONTH) + ", ");
                    System.out.print("Adress: " + student.getAdress() + ", ");
                    System.out.print("Phone: " + student.getPhone() + ", ");
                    System.out.print("Faculty: " + student.getFaculty() + ", ");
                    System.out.print("Course number: " + student.getCourseNumber() + ", ");
                    System.out.print("Group number: " + student.getGroupNumber() + ", ");
                    System.out.println();
                }
            }
        }
    }
}

