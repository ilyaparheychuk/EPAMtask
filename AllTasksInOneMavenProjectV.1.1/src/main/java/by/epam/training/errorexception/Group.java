package by.epam.training.errorexception;

import java.util.ArrayList;
import java.util.List;

public class Group {

    private int numberOfGroup;
    private List<Student> students;

    public Group(int numberOfGroup) {
        this.students = new ArrayList<Student>();
        this.numberOfGroup = numberOfGroup;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public int getNumberOfGroup() {
        return numberOfGroup;
    }

    public void setNumberOfGroup(int numberOfGroup) {
        this.numberOfGroup = numberOfGroup;
    }

    public List<Student> getStudents() throws Exception {
        if (students.size() == 0) {
            throw new Exception("No students in some group");
        }
        return students;
    }
}
