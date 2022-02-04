import java.util.ArrayList;
import java.util.Scanner;



public class Classroom{

  private String name;
  private int classSize;
  private ArrayList<Student> students;

  public Classroom(int classSize){
    this.classSize = classSize;
    students = new ArrayList<>();
  }

  public void addStudent(Student student){
    if(students.size() == classSize){
      System.out.println("The class is full. Tell the student to find another");
      return;
    }
    else{
    students.add(student);}
  }

  public void displayStudents(){
    String result = "-";
    
    for(Student student : students){
      if(student == students.get(5)){
        result += student.getName() + ".";
      }
      else{
      result += student.getName() + ", ";
      }
      
    }
    System.out.println(result);
  }

  public void setSize(int classSize){
    this.classSize = classSize;
    
  }

  public int getSize(){
    return classSize;
  }

}