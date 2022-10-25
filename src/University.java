import java.util.ArrayList;
import java.util.List;

public class University {

    private List <Teacher> teacherList;
    private List <Student> studentList;
    private List <Course>  courseList;

    public University(){
        this.teacherList = new ArrayList<Teacher>();
        this.studentList = new ArrayList<Student>();
        this.courseList  = new ArrayList<Course>();
    }


}
