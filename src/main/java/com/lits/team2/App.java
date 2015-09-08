package com.lits.team2;

import java.io.IOException;
import java.util.List;

public class App
{
    public static void printStudentsSortedList (String jsonPath){
        StudentJacksonUsage parser = new StudentJacksonUsage();
        List<StudentDTO> students = null;
        try {
            students = parser.loadStudents(jsonPath);
            students.sort(new StudentsComparator());
            for (StudentDTO stDTO : students) {
                System.out.println(stDTO);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void main( String[] args ) {
        printStudentsSortedList("src/main/resources/Students.json");
    }
}
