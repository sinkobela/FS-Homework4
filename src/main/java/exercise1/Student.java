package exercise1;

import java.time.LocalDate;
import java.time.Period;
import java.util.Random;

record Student(String name, LocalDate birthDate, int grade) {

    public Student(String name, int grade, Integer age) {
        this(name, setBirthDate(age), grade);
    }

    public static LocalDate setBirthDate(int age) {
        Random random = new Random();
        return LocalDate.ofYearDay(LocalDate.now().getYear() - age, random.nextInt(LocalDate.now().getDayOfYear() + 1));
    }

    public int getAge() {
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

}
