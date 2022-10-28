import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        University Globant = new University();

        Globant.setNewTeacher( new TeacherFullTime("Felipe Jimenez", 2000F, 3));
        Globant.setNewTeacher( new TeacherFullTime("Juan Pablo Castiblanco", 1900F, 2));
        Globant.setNewTeacher( new TeacherFullTime("Otto Octavius", 3000F, 5));
        Globant.setNewTeacher(new TeacherPartTime("Sheldon Cooper", 1200F, 5));
        Globant.setNewTeacher(new TeacherPartTime("Leonard Hofstadter", 1000F, 3));
        Globant.setNewTeacher(new TeacherPartTime("Tony Stark", 2000F, 8));

        Globant.setNewStudent(new Student("Andres Theran", 25));
        Globant.setNewStudent(new Student("Howard Wolowitz", 28));
        Globant.setNewStudent(new Student("Peter Parker", 29));
        Globant.setNewStudent(new Student("Harry Osborn", 27));
        Globant.setNewStudent(new Student("Jim Halpert", 25));
        Globant.setNewStudent(new Student("Andres Theran", 25));

        Globant.setNewCourse(new Course("Sancocho 1", Globant.getTeacherList().get(0), 1001 ));
        Globant.setNewCourse(new Course("Memelogia 1", Globant.getTeacherList().get(1), 2001 ));
        Globant.setNewCourse(new Course("Java para dummies", Globant.getTeacherList().get(2), 3001 ));
        Globant.setNewCourse(new Course("Vida y obra de Diomedez ", Globant.getTeacherList().get(3), 4001 ));

        Globant.addStudentToCourse(10, 100);
        Globant.addStudentToCourse(20, 200);
        Globant.addStudentToCourse(30, 300);
        Globant.addStudentToCourse(40, 400);
        Globant.addStudentToCourse(50, 500);
        Globant.addStudentToCourse(60, 600);

        boolean isMenuActive = true;

        while(isMenuActive){
            System.out.println("Choose an option form the list: \n" +
                    "1. Check Students. \n" +
                    "2. Add Students to the system \n" +
                    "3. Check Courses. \n" +
                    "4. Add Courses to the system. \n" +
                    "5. Check Teachers. \n" +
                    "6. Add Teachers to the system \n" +
                    "0. Exit");
        Scanner scanner= new Scanner(System.in);
        int menuOption = scanner.nextInt();

        switch (menuOption){
            case 1:
                boolean isStudentActive = true;
                while(isStudentActive){
                    System.out.println("Type the student ID.");
                    System.out.println("Select 0 to exit");
                    for(Student i: Globant.getStudentList()){
                        System.out.println(i.getId() + "-" + i.getName());
                    }
                    Scanner Scanner2 = new Scanner(System.in);
                    int studentId = Scanner2.nextInt();
                    if(studentId > 0 && studentId <= Globant.getStudentList().size()){
                        System.out.println(Globant.getStudentList().get(studentId - 1).toString());
                        System.out.println("Active in these courses: \n" + "------------");
                        for(Course i: Globant.getCourseList()){
                            for(Student j: i.getStudentList()){
                                if(studentId == j.getId()){
                                    System.out.println(i.toString());
                                }
                            }
                        }
                    } else if (studentId == 0) {
                        isStudentActive = false;
                    } else {
                        System.out.println("Wrong option, Please choose a valid option");
                    }
                }
        }
        }



    }
}