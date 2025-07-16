package day1_workshop;
interface Graded {
 void assignGrade(Student student, Course course, double grade);
}


class Student {
 private String name;
 private int id;
 private double gpa = 0.0; 
 private int totalCredits = 0;

 public Student(String name, int id) {
     this.name = name;
     this.id = id;
 }

 public void updateGPA(double grade, int credits) {
     gpa = ((gpa * totalCredits) + (grade * credits)) / (totalCredits + credits); 
     totalCredits += credits;
 }

 public double getGPA() {
     return gpa;
 }

 public String getTranscript() {
     return name + " (ID: " + id + ") - GPA: " + gpa;
 }
}
class Undergraduate extends Student {
 public Undergraduate(String name, int id) {
     super(name, id);
 }
}
class Postgraduate extends Student {
 public Postgraduate(String name, int id) {
     super(name, id);
 }
}
class Course {
 String title;
 int credits;
 public Course(String title, int credits) {
     this.title = title;
     this.credits = credits;
 }
}
class Faculty implements Graded {
 String name;
 public Faculty(String name) {
     this.name = name;
 }
 
 public void assignGrade(Student student, Course course, double grade) {
     student.updateGPA(grade, course.credits);
     System.out.println(name + " assigned grade " + grade + " to " + student.getTranscript());
 }
}
class Enrollment {
 Student student;
 Course course;
 public Enrollment(Student student, Course course) {
     this.student = student;
     this.course = course;
 }
 public void enroll() {
     System.out.println(student.getTranscript() + " enrolled in " + course.title);
 }
}
public class UniversitySystem {
 public static void main(String[] args) {
     Undergraduate uStudent = new Undergraduate("Alice", 101);
     Postgraduate pStudent = new Postgraduate("Bob", 202);
     Course math = new Course("Advanced Math", 3);
     Course ai = new Course("AI Fundamentals", 4);
     Enrollment e1 = new Enrollment(uStudent, math);
     Enrollment e2 = new Enrollment(pStudent, ai);
     e1.enroll();
     e2.enroll();
     Faculty prof = new Faculty("Dr. Sharma");
     prof.assignGrade(uStudent, math, 3.7);
     prof.assignGrade(pStudent, ai, 4.0);
 }
}


