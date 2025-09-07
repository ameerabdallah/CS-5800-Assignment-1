package com.ameer.aggregation;

import java.util.List;

public class Course {
    private String courseName;
    private List<Instructor> instructors;
    private List<Textbook> textbooks;

    public Course(String courseName, List<Instructor> instructors, List<Textbook> textBooks) {
        this.courseName = courseName;
        this.instructors = instructors;
        this.textbooks = textBooks;
    }

    public void printCourseDetails() {
        System.out.println("===============================");
        System.out.printf("Course Name: %s\n", courseName);
        for (Instructor instructor : instructors) {
            System.out.printf(
                    "\tInstructor: %s %s, Office: %s\n",
                    instructor.getFirstName(),
                    instructor.getLastName(),
                    instructor.getOfficeNumber()
            );
        }
        for (Textbook textbook : textbooks) {
            System.out.printf(
                    "\tTextbook: %s by %s, Publisher: %s\n",
                    textbook.getTitle(),
                    textbook.getAuthor(),
                    textbook.getPublisher()
            );
        }
        System.out.println("===============================");
    }
}
