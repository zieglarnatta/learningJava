import java.util.Scanner;

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World!!! Roy's going to kick Java @$$ !!!");
        int studentAge = 15;
        double studentGPA = 3.45;
        String studentFirstName = "Kayla";
        String studentLastName = "Harley";
        //char studentFirstInitial = 'K';
        char studentFirstInitial = studentFirstName.charAt(0);

        //char studentLastInitial = 'H';
        char studentLastInitial = studentLastName.charAt(0);
        boolean hasPerfectAttendance = true;



        System.out.println("Student age is: " + studentAge);
        System.out.println( "Student GPA is: " + studentGPA);
        System.out.println("Student First Initial is: " + studentFirstInitial);
        System.out.println("Student Last Initial is: " + studentLastInitial);
        System.out.println("Student's Perfect Attendence is: " + hasPerfectAttendance);
        System.out.println("Student First Name is: " + studentFirstName);
        System.out.println("Student Last Name is: " + studentLastName);
        System.out.println("Student Full name is: " + studentFirstName +
                " " + studentLastName + "and has a GPA of: " + studentGPA);
        System.out.println("What would you like to update the GPA to?");

        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();
        String studentFullName = studentFirstName + " " + studentLastName;
        System.out.println(studentFullName + " now has the updated GPA os: " + studentGPA);
    }
}
