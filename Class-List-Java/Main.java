import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    //System.out.println("Hello world!");
  Scanner scan = new Scanner(System.in);


Classroom c = new Classroom(6);

  System.out.println("Please enter the students name:");
  Student s1 = new Student(scan.nextLine()); 

  System.out.println("Please enter the students name:");
  Student s2 = new Student(scan.nextLine()); 

  System.out.println("Please enter the students name:");
  Student s3 = new Student(scan.nextLine()); 

  System.out.println("Please enter the students name:");
  Student s4 = new Student(scan.nextLine()); 

  System.out.println("Please enter the students name:");
  Student s5 = new Student(scan.nextLine()); 

  System.out.println("Please enter the students name:");
  Student s6 = new Student(scan.nextLine()); 

  System.out.println("Please enter the students name:");
  Student s7 = new Student(scan.nextLine()); 

  c.addStudent(s1);
  c.addStudent(s2);
  c.addStudent(s3);
  c.addStudent(s4); 
  c.addStudent(s5);
  c.addStudent(s6);
  c.addStudent(s7);

  c.displayStudents();


  }
}