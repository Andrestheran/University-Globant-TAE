
public class Student {


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
