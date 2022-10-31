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

    public void setNewTeacher( Teacher teacher){
        this.teacherList.add(teacher);
    }

    public void setNewStudent( Student student){
        this.studentList.add(student);
    }

    public void setNewCourse ( Course course){
        this.courseList.add(course);
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(List<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public void addStudentToCourse (int courseID, int studentID){
        this.courseList.get(courseID - 1).setAddStudent(this.studentList.get(studentID - 1));
    }

    public static class Student {


        private String name;
        private int id;
        private int age;

        private static int rep_id = 1;

        public Student(String name, int age) {
            this.name = name;
            this.id = rep_id++;
            this.age = age;
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

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String toString(){
            return ("Name: " + getName() + "\n" +
                    "Id: " + getId() + "\n" +
                    "Age: " + getAge() + "\n" +
                    "----------------");
        }
    }
}
