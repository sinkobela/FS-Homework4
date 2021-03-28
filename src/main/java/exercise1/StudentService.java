package exercise1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.*;


record StudentService(List<Student> students, List<Course> courses) {

    public String studentsAverage() {
        return students.stream()
                .collect(teeing(
                        Collectors.mapping(Student::name, Collectors.toList()),
                        averagingInt(Student::grade),
                        (list, avg) -> list + " have an avg grade of: " + avg));
    }


    public String allocateCourses() {
        Random random = new Random();
        return students.stream()
                .map(student -> student.name() + " will participate to course " + courses.get(random.nextInt(3)).getCourse())
                .collect(Collectors.joining());
    }

//    public String switchExpressions() {
//        List<Student> studentList = students.stream()
//                .sorted(comparing(Student::grade))
//                .collect(toList());
//
//        return switch (studentList) {
//            case studentList.get(0), studentList.get(1), studentList.get(2) -> "1st grade";
//            case studentList.get(3) -> "5th grade";
//            default -> "7th grade";
//        };
//    }

}
