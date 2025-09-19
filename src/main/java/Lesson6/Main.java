package Lesson6;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();

        students.add(new Student("Вадик", "А", 1, List.of(4, 4, 4)));
        students.add(new Student("Паша", "Б", 1, List.of(2, 2, 3)));
        students.add(new Student("Женя", "B", 2, List.of(3, 2, 4)));

        removeLowGrades(students);
        promoteStudents(students);

        printStudents(students, 2);
        //--------задание 2------
        Phone phone = new Phone();
        phone.add("Павлюков", "123-456");
        phone.add("Павлюков", "309-567");
        phone.add("Сидоревич", "753-159");

        System.out.println("Телефоны Павлюкова: " + phone.get("Павлюков"));
        System.out.println("Телефоны Сидоревича: " + phone.get("Сидоревич"));
    }

    // удаляет студентов с баллом меньше 3
    public static void removeLowGrades(Set<Student> students) {
        students.removeIf(s -> s.getAverageGrade() < 3);
    }

    // переводит на след.курс, если балл больше\равен 3
    public static void promoteStudents(Set<Student> students) {
        for (Student s : students) {
            if (s.getAverageGrade() >= 3) {
                s.setCourse(s.getCourse() + 1);
            }
        }
    }

        public static void printStudents(Set<Student> students, int course) {
        System.out.println("Студенты курса " + course + ":");
        for (Student s : students) {
            if (s.getCourse() == course) {
                System.out.println(s.getName());
            }
        }
    }
}

