public class TeacherFullTime extends Teacher{

    private int yearsOfExperience;

    public TeacherFullTime(String name, float baseSalary, int yearsOfExperience) {
        super(name, baseSalary);
        this.yearsOfExperience = yearsOfExperience;
    }

    // Getter and Setter
    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public String toString(){
        return ("NAme: " + getName() + "\n" +
                "Id: " + getId() + "\n" +
                "Contract type: FullTime" + "\n" +
                "Salary: " + "$" + calculateSalary() + "\n" +
                "---------------------------------");
    }

    @Override
    public float calculateSalary() {
        return  this.getBaseSalary() * 1.10F;
    }
}
