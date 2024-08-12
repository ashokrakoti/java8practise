package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8CommonProgrammingQA {

    public static void main(String[] args) {
        List<Student> studentList = Stream.of(
                        new Student(1, "Rohit", 30, "Male", "Mechanical Engineering", "Mumbai", 122, Arrays.asList("+912632632782", "+1673434729929")),
                        new Student(2, "Pulkit", 56, "Male", "Computer Engineering", "Delhi", 67, Arrays.asList("+912632632762", "+1673434723929")),
                        new Student(3, "Ankit", 25, "Female", "Mechanical Engineering", "Kerala", 164, Arrays.asList("+912632633882", "+1673434709929")),
                        new Student(4, "Satish Ray", 30, "Male", "Mechanical Engineering", "Kerala", 26, Arrays.asList("+9126325832782", "+1671434729929")),
                        new Student(5, "Roshan", 23, "Male", "Biotech Engineering", "Mumbai", 12, Arrays.asList("+012632632782")),
                        new Student(6, "Chetan", 24, "Male", "Mechanical Engineering", "Karnataka", 90, Arrays.asList("+9126254632782", "+16736784729929")),
                        new Student(7, "Arun", 26, "Male", "Electronics Engineering", "Karnataka", 324, Arrays.asList("+912632632782", "+1671234729929")),
                        new Student(8, "Nam", 31, "Male", "Computer Engineering", "Karnataka", 433, Arrays.asList("+9126326355782", "+1673434729929")),
                        new Student(9, "Sonu", 27, "Female", "Computer Engineering", "Karnataka", 7, Arrays.asList("+9126398932782", "+16563434729929", "+5673434729929")),
                        new Student(10, "Shubham", 26, "Male", "Instrumentation Engineering", "Mumbai", 98, Arrays.asList("+912632646482", "+16734323229929")))
                .collect(Collectors.toList());

        // 1. Find the list of students whose rank is in between 50 and 100
        //pass the variable and parameter and then apply the conditions as many as we want.
//        List<Student> students = studentList.stream().filter(student -> student.getRank() > 50 && student.getRank() > 100).collect(Collectors.toList());
//
//         System.out.println(students);
//         students.forEach(student -> System.out.println(student.getFirstName()));

        //2. Find the Students who stays in Karnataka and sort them by their names
//       List<Student> studentsByCity = studentList.stream().filter(student -> student.getCity().equals("Karnataka"))
//               .sorted(Comparator.comparing(Student::getFirstName)).collect(Collectors.toList());
//       studentsByCity.forEach(student -> System.out.println(student.getFirstName()));
//       System.out.println(studentsByCity);
//        List<Student> studentsByCity = studentList.stream().filter(student -> student.getCity().equals("Karnataka"))
//                .sorted(Comparator.comparing(Student::getFirstName, Comparator.reverseOrder())).collect(Collectors.toList());
//         System.out.println(studentsByCity);

//        List<Student> studentsByCity = studentList.stream().filter(student -> student.getCity().equals("Karnataka"))
//                .sorted(Comparator.comparing(Student::getFirstName).reversed()).collect(Collectors.toList());
//        System.out.println(studentsByCity);
//
        // 3. Find all departments names. in this case we want to extract one field from the data. so we use the map as it has a return type.
//        List<String> uniqueDeptNames = studentList.stream().map(student -> student.getDept()).distinct().toList();

//        List<String> uniqueDeptNames = studentList.stream().map(Student::getDept).distinct().toList();
//
//        Set<String> deptNamesInSet = studentList
//                .stream().map(Student::getDept)
//                .collect(Collectors.toSet());

//        System.out.println("uniqueDeptNames are : " + uniqueDeptNames);
        //System.out.println(deptNamesInSet);
//
//        4.  Find all the contact numbers
//        var studentContacts = studentList.stream().map(Student::getContacts).toList();
//        var studentsContactsList = studentList.stream()
//                .flatMap(student -> student.getContacts().stream())
//                .distinct()
//                .sorted()
//                .toList();
//        System.out.println(studentContacts);
//        System.out.println(studentsContactsList);
//        List<String> contacts = studentList.stream()
//                .flatMap(student -> student.getContacts().stream())
//                .distinct()
//                .collect(Collectors.toList());
//        System.out.println(contacts);
        //one2one-> map
        //one2many-> flatmap
//
//        //5.  Group The Student By Department Names


        Map<String, List<Student>> studentMap = studentList.stream()
                .collect(Collectors.groupingBy(Student::getDept));
         System.out.println(studentMap);
//
//
//        //6. Find the department who is having maximum number of students
//        Map.Entry<String, Long> results = studentList.stream()
//                .collect(Collectors.groupingBy(Student::getDept, Collectors.counting()))
//                .entrySet().stream().max(Map.Entry.comparingByValue()).get();
//
//        System.out.println(results);
//
//        //7. Find the average age of male and female students
//
//        Map<String, Double> avgStudents = studentList.stream()
//                .collect(Collectors
//                        .groupingBy(Student::getGender,
//                                Collectors.averagingInt(Student::getAge)));
//
//        //System.out.println(avgStudents);
//
//        //8. Find the highest rank in each department
//
//        Map<String, Optional<Student>> stdMap = studentList.stream()
//                .collect(Collectors.groupingBy(Student::getDept,
//                        Collectors.minBy(Comparator.comparing(Student::getRank))));
//        // System.out.println(stdMap);
//
//        //9 .Find the student who has second rank
//
//        Student student = studentList.stream()
//                .sorted(Comparator.comparing(Student::getRank))
//                .skip(2)
//                .findFirst().get();
//        System.out.println(student);

    }


}