package by.epam.training.errorexception;

public class Runner {

    public static void main(String[] args) throws Exception {
        // SUBJECT
        Subject math = new Subject("Math");
        Subject physics = new Subject("Physics");

        // STUDENTS
        Student pasha = new Student(math, 7);
        pasha.addSubject(physics, 5);
        Student sasha = new Student(math, 8);
        sasha.addSubject(physics, 7);
        Student dima = new Student(math, 10);
        dima.addSubject(physics, 6);
        Student egor = new Student(math, 10);
        egor.addSubject(physics, 9);
        Student masha = new Student(math, 5);
        masha.addSubject(physics, 7);
        Student dasha = new Student(math, 6);
        dasha.addSubject(physics, 5);
        Student katya = new Student(math, 10);
        katya.addSubject(physics, 8);
        Student liza = new Student(math, 10);
        liza.addSubject(physics, 10);

        // GROUP
        Group one = new Group(1);
        one.addStudent(pasha);
        one.addStudent(masha);
        Group two = new Group(2);
        two.addStudent(sasha);
        two.addStudent(dasha);
        Group three = new Group(3);
        three.addStudent(dima);
        three.addStudent(katya);
        Group four = new Group(4);
        four.addStudent(egor);
        four.addStudent(liza);

        // FACULTY
        Faculty FITR = new Faculty();
        FITR.addGroup(one);
        Faculty MTF = new Faculty();
        MTF.addGroup(two);
        Faculty FRIT = new Faculty();
        FRIT.addGroup(three);
        Faculty FPMI = new Faculty();
        FPMI.addGroup(four);

        // UNIVERSITY
        University BNTU = new University();
        BNTU.addFaculty(FITR);
        BNTU.addFaculty(MTF);

        University BSU = new University();
        BSU.addFaculty(FRIT);
        BSU.addFaculty(FPMI);

        // TASK 1
        System.out.println("Student's average mark of all subjects:  " + UniversityHelper.averageStudentMarkOfAllSubject(pasha));
        // TASK 2
        System.out.println("Average mark for a specific subject in a specific group and a specific faculty: "
                + UniversityHelper.averageMarkFacultyGroup(FITR, 1, math));
        // TASK 3
        System.out.println("Average mark for a specific subject in a specific University: "
                + UniversityHelper.averageMarkUniversity(BSU, math));
    }
}
