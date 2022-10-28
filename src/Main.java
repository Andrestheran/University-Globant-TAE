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
        Globant.setNewStudent(new Student("Michael Scott", 30));

        Globant.setNewCourse(new Course("Sancocho 1", Globant.getTeacherList().get(0), 1001 ));
        Globant.setNewCourse(new Course("Memelogia 1", Globant.getTeacherList().get(1), 2001 ));
        Globant.setNewCourse(new Course("Java para dummies", Globant.getTeacherList().get(2), 3001 ));
        Globant.setNewCourse(new Course("Vida y obra de Diomedez ", Globant.getTeacherList().get(3), 4001 ));

        Globant.addStudentToCourse(1, 1);
        Globant.addStudentToCourse(2, 2);
        Globant.addStudentToCourse(3, 3);
        Globant.addStudentToCourse(2, 4);
        Globant.addStudentToCourse(4, 5);
        Globant.addStudentToCourse(1, 6);

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
                    System.out.println("Type the student ID to check the info.");
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
                        System.out.println("Wrong option, Please choose a valid option \n" + "------------");
                    }
                }
                break;
            case 2:
                Scanner menuJuniorScanner1 = new Scanner(System.in);
                System.out.println("Type student name");
                String studentName = menuJuniorScanner1.nextLine();
                System.out.println("Type student age");
                int studentAge = menuJuniorScanner1.nextInt();
                Globant.setNewStudent(new Student(studentName, studentAge));
                break;
            case 3:
                boolean subMenu1 = true;
                while(subMenu1){
                    System.out.println("Select the Course: ");
                    for (int i = 1; i <= Globant.getCourseList().size() ; i++) {
                        System.out.println(i + "." + Globant.getCourseList().get(i - 1).getName());
                    }
                    System.out.println("0. Return");

                    Scanner subMenuScanner = new Scanner(System.in);
                    int subMenuOpt2 = subMenuScanner.nextInt();
                    if (subMenuOpt2 > 0 && subMenuOpt2 <= Globant.getCourseList().size()){
                        Globant.getCourseList().get(subMenuOpt2 - 1).toString();
                        for (Student i: Globant.getCourseList().get(subMenuOpt2 - 1).getStudentList()){
                            System.out.println(i.toString());
                        }
                    } else if (subMenuOpt2 == 0) {
                        subMenu1 = false;
                    } else {
                        System.out.println("Wrong option, Please choose a valid option \n" + "------------");
                    }
                }
                    break;
            case 4:
                boolean subMenu3 = true;
                while (subMenu3){
                    Scanner subMenuScanner2 = new Scanner(System.in);
                    System.out.println("Select an option: \n" +
                            "1. Create Course \n" +
                            "2. Add Student \n" +
                            "0. Return");
                    int subMenuOpt2 = subMenuScanner2.nextInt();

                    switch (subMenuOpt2){
                        case 1:
                            Scanner subMenu2 = new Scanner(System.in);
                            System.out.println("Type the course name");
                            String courseName= subMenu2.nextLine();
                            System.out.println("Type Teacher ID to add");
                            int teacherId = subMenu2.nextInt();
                            System.out.println("Type classroom assigned to the course");
                            int classRoom = subMenu2.nextInt();
                            if (teacherId > 0 && teacherId <= Globant.getTeacherList().size()){
                                Globant.setNewCourse(new Course(
                                        courseName,
                                        Globant.getTeacherList().get(teacherId - 1),
                                        classRoom));
                            } else {
                                System.out.println("ERROR: please type a sequential ID to the teacher");
                            }

                            break;
                        case 2:
                            Scanner subMenu4 = new Scanner(System.in);
                            System.out.println("Type Student ID");
                            int studentId = subMenu4.nextInt();
                            System.out.println("Type ID of the course where the student will be added");
                            int courseId = subMenu4.nextInt();
                            if (studentId > 0 && courseId > 0 && studentId <= Globant.getStudentList().size() && courseId <= Globant.getCourseList().size()){
                               Globant.addStudentToCourse(courseId, studentId);
                                System.out.println("Awesome! student added correctly");
                            } else {
                                System.out.println("Wrong option, Please choose a valid option \n" + "------------");
                            }
                            break;

                        case 0:
                            subMenu3 = false;
                            break;
                        default:
                            System.out.println("Wrong option, Please choose a valid option \n" + "------------");
                            break;
                    }
                }

                break;
            case 5:
                for( Teacher i: Globant.getTeacherList()){
                    System.out.println(i. toString());
                }
                break;
            case 6:
                boolean subMenu = true;
                while(subMenu){
                    System.out.println("Select kind of Teacher contract: \n" +
                            "1. Part Time \n" +
                            "2. Full Time \n" +
                            "0. Back to Main Menu" );
                    Scanner subMenuScanner = new Scanner(System.in);
                    int subMenuOpt1 = subMenuScanner.nextInt();
                    switch (subMenuOpt1){

                        case 1:
                            Scanner subMenuScanner1 = new Scanner(System.in);
                            System.out.println("Type Teacher Name: ");
                            String partTimeName = subMenuScanner1.nextLine();
                            System.out.println("Type base salary: ");
                            float basePtSalary = subMenuScanner1.nextFloat();
                            System.out.println("Type experience years");
                            int experienceYearsPt = subMenuScanner1.nextInt();
                            Globant.setNewTeacher( new TeacherFullTime(partTimeName, basePtSalary, experienceYearsPt));

                            System.out.println("Teacher added correctly");
                            break;

                        case 2:
                            Scanner subMenuScanner2 = new Scanner(System.in);
                            System.out.println("Type Teacher name: ");
                            String fullTimeName = subMenuScanner2.nextLine();
                            System.out.println("Type base salary: ");
                            float baseFtSalary = subMenuScanner2.nextFloat();
                            System.out.println("Type hours per week");
                            float experienceYearsFt = subMenuScanner2.nextFloat();
                            Globant.setNewTeacher(new TeacherPartTime(fullTimeName, baseFtSalary, experienceYearsFt ));

                            System.out.println("Teacher added correctly");
                            break;
                        case 0:
                            subMenu = false;
                            break;
                        default:
                            System.out.println("Wrong option, Please choose a valid option \n" + "------------");

                    }
                }
                break;
            case 0:
                System.out.println("Gracias por usar esta app, vuelve a Globant university cuando quieras" +
                        "---------------------------------------------------");
                isMenuActive = false;
                break;
            default:
                System.out.println("Wrong option, Please choose a valid option \n" + "------------");
                break;
            }
        }
    }
}