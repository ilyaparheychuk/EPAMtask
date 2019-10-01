package JavaErrorException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class University {

    List<Faculty> facultys;

    public University() {
        this.facultys = new ArrayList<Faculty>();
    }

    public void addFaculty(Faculty faculty){
        facultys.add(faculty);
    }

    public List<Faculty> getFacultys() throws Exception {
        if(facultys.size()==0){
            throw new Exception("No facultys in University");
        }
        return facultys;
    }
}

