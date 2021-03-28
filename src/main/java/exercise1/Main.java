package exercise1;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Mark", LocalDate.of(1995,11,7), 5);
        System.out.println(student1.getAge());

        Student student2 = new Student("Ana", 50, 20);
        System.out.println(student2);

        Student student3 = new Student("Bela", LocalDate.of(1990, 3, 5), 8);
        Student student4 = new Student("Peter", LocalDate.of(1996, 8, 30), 6);
        Student student5 = new Student("Jhon", LocalDate.of(1997, 2, 20), 10);
        Student student6 = new Student("Paul", LocalDate.of(1998, 10, 9), 7);
        Student student7 = new Student("Maria", LocalDate.of(1999, 12, 16), 2);
        Student student9 = new Student("Ioana", LocalDate.of(1992, 5, 23), 5);
        Student student8 = new Student("Stefan", LocalDate.of(1991, 6, 11), 10);
        Student student10 = new Student("Kira", LocalDate.of(1993, 9, 29), 7);

        List<Student> students = List.of(student1, student2, student3, student4, student5, student6, student7, student8, student9, student10);

        List<Course> courses = List.of(
                new Course("Math 101", 2),
                new Course("English 201", 1),
                new Course("Physics 301", 3));

        StudentService studentService = new StudentService(students, courses);

        System.out.println("\n");
        System.out.println("Average:");
        System.out.println(studentService.studentsAverage());

        System.out.println("\n");
        System.out.println("Student courses:");
        System.out.println(studentService.allocateCourses());


    }
}
