package JavaErrorException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student {

    private Map<Subject, Integer> subjects;

    public Map<Subject, Integer> getSubjects() {
        return subjects;
    }

    public Student(Subject subject, int mark) throws Exception {
        if(subject==null){
            throw new Exception("No subject");
        }
        this.subjects = new HashMap();
        addSubject(subject, mark);
    }

    public void addSubject(Subject subject, int mark) throws Exception {
        if(mark <0 || mark>10){
            throw new Exception("mark is not between 0 and 10");
        }
        subjects.put(subject, mark);
    }
}
