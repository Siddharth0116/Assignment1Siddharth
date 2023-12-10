/*Assignment 6 Siddharth*/


import java.util.Scanner;

class Student {
    int age;
    String name;
    String teacherName;
    double gpa;

    public Student() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter age: ");
        this.age = scanner.nextInt();

        System.out.println("Enter name: ");
        this.name = scanner.next();
        
          System.out.println("Enter GPA: ");
        this.gpa = scanner.nextDouble();

        System.out.println("Enter teacher name: ");
        this.teacherName = scanner.next();

      
    }

    public void welcomeStatement() {
        System.out.println("Welcome, " + this.name + "!");
    }

    public String grade(){
        String gradeNo="";
        switch(age){
            case 6:  gradeNo="First";
            break;
            case 7:  gradeNo="Second";
            break;
            case 8:  gradeNo="Third";
            break;
            case 9:  gradeNo="Fourth";
            break;
            case 10:  gradeNo="Fifth";
            break;
            case 11:  gradeNo="Sixth";
            break;
            case 12:  gradeNo="Seventh";
            break;
            case 13:  gradeNo="Eigth";
            break;
            case 14:  gradeNo="Ninth";
            break;
            case 15:  gradeNo="Tenth";
            break;
            case 16:  gradeNo="Eleventh";
            break;
            case 17: gradeNo="Twelfth";
            break;
            default:
            break;
        }
        return gradeNo;
    }
}
class Highschoolstudent extends Student{
    int communityhours;
    int SATscore;
    public void Highschoolstudentinfo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Community Hours: ");
        this.communityhours = scanner.nextInt();
        System.out.println("Enter SAT score: ");
        this.SATscore = scanner.nextInt();
}
}

class Main {
    public static void main(String[] args) {
        Highschoolstudent student1=new Highschoolstudent();
        student1.Highschoolstudentinfo();
        System.out.println("Grade: " + student1.grade());
        
    }
}








