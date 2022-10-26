import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private  int id;
    private Teacher teacher;
    private int classRoom;
    private List<Student> studentList;


    private static int rep_id = 1;

    public Course (String name, Teacher teacher, int classRoom){
        this.id = rep_id++;
        this.name = name;
        this.studentList = new ArrayList<Student>();
        this.teacher = teacher;
        this.classRoom = classRoom;
    }

    //Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public int getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(int classRoom) {
        this.classRoom = classRoom;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public String toString(){
        return ("Name: " + getName() + "\n" +
                "Id: " + getId() + "\n" +
                "ClassRoom: " + getClassRoom() + "\n" +
                "Teacher: " + getTeacher().getName() + "\n");

    }
}
