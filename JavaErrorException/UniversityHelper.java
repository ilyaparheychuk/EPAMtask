import java.util.List;
import java.util.Set;

public class UniversityHelper {

    public static double averageMark(Student student) {

        double sum = 0;
        Set<Subject> subjects = student.getSubjects().keySet();
        for (Subject subject : subjects) {
            sum += student.getSubjects().get(subject);
        }
        return sum / subjects.size();
    }

    public static double averageMarkFacultyGroup(Faculty faculty, int groupNumber, Subject subject) throws Exception {

        double sum = 0;
        for (Group groupOne : faculty.getGroups()) {
            if (groupOne.getNumberOfGroup() == groupNumber) {
                List<Student> students = groupOne.getStudents();
                for (Student student : students) {
                    Set<Subject> subjects = student.getSubjects().keySet();
                    for (Subject subjectOne : subjects) {
                        if (subjectOne.equals(subject)) {
                            sum += student.getSubjects().get(subject);
                        }
                    }
                }
                return sum / students.size();
            }
        }
        return 0;
    }

    public static double averageMarkUniversity(University university, Subject subject) throws Exception {

        double sum = 0;
        for (Faculty faculty : university.getFacultys()) {
            for (Group group : faculty.getGroups()) {
                List<Student> students = group.getStudents();
                for (Student student : group.getStudents()) {
                    Set<Subject> subjects = student.getSubjects().keySet();
                    for (Subject subjectOne : subjects) {
                        if (subjectOne.equals(subject)) {
                            sum += student.getSubjects().get(subject);
                        }
                    }
                }return sum / students.size();
            }
        }
        return 0;
    }
}

