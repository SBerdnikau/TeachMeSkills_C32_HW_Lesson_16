package com.teachmeskills.lesson_16.task1;

import com.teachmeskills.lesson_16.task1.model.student.Student;
import com.teachmeskills.lesson_16.task1.service.PassportGenerator;

import java.util.*;

/**
 * создать коллекцию номеров паспортов (формат String).
 * Создать коллекцию студентов нашей группы.
 * В каждой коллекции не должно быть повторяющихся элементов.
 * Создать коллекцию ключ-значение, где ключом будет номер паспорта из первой коллекции, а значением будет
 * объект класса Student из второй коллекции.
 * Пройти циклом for-each по коллекции ключ-значение и вывести элементы коллекции на экран.
 */
public class ApplicationRunner {
    public static void main(String[] args) {
        Set<String> passportNumbers = PassportGenerator.generatePassportNumbers();
        Set<Student> students = new LinkedHashSet<>();

        students.add(new Student("Dmitriy"));
        students.add(new Student("Ilya"));
        students.add(new Student("Bogdan"));
        students.add(new Student("Igor"));
        students.add(new Student("Marina"));
        students.add(new Student("Daniil"));
        students.add(new Student("Sultan"));
        students.add(new Student("Georgi"));
        students.add(new Student("Kirill"));
        students.add(new Student("Kate"));
        students.add(new Student("Dmitry"));
        students.add(new Student("Rita"));
        students.add(new Student("Vlad"));
        students.add(new Student("Sergio"));
        students.add(new Student("Oleg"));

        Map<String, Student> passportStudentMap = new HashMap<>();

        Iterator<String> passportIterator = passportNumbers.iterator();
        Iterator<Student> studentIterator = students.iterator();
        while (passportIterator.hasNext() && studentIterator.hasNext()  ){
            String passport = passportIterator.next();
            Student student = studentIterator.next();
            passportStudentMap.put(passport, student);
        }

        passportStudentMap.forEach( (numPassport, student) -> System.out.println("Passport: " + numPassport + ", name: " + student.getName())  ) ;
    }
}
