public class TeacherPartTime extends Teacher{

    private float activeHoursWeek;

    public TeacherPartTime(String name, float baseSalary, float activeHoursWeek){
        super(name, baseSalary);
        this.activeHoursWeek = activeHoursWeek;
    }

    //Getter and Setter
    public float getActiveHoursWeek() {
        return activeHoursWeek;
    }

    public void setActiveHoursWeek(float activeHoursWeek) {
        this.activeHoursWeek = activeHoursWeek;
    }

    public String toString(){
        return ("Name: " + getName() + "\n" +
                "Id: " + getId() + "\n" +
                "Contract Type: PartTime" + "\n" +
                "Active hours by week: " + getActiveHoursWeek() + "\n" +
                "Salary / Week: " + "$" + calculateSalary() + "\n" +
                "-----------------------" );
    }

    @Override
    public float calculateSalary() {
        return  getBaseSalary() * ((1/4F)/48F) * this.activeHoursWeek;
    }
}
