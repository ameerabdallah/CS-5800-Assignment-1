package com.ameer.aggregation;

import java.util.List;

public class AggregationDriverProgram {
    public static void main(String[] args) {
        Course course = new Course(
                "Advanced Software Engineering",
                List.of(new Instructor("Nima", "Davarpanah", "3-2636"), new Instructor("Ameer", "Khan", "3-2637")),
                List.of(
                        new Textbook("Clean Code", "Robert C. Martin", "Pearson Education"),
                        new Textbook(
                                "Design Patterns",
                                "Erich Gamma, Richard Helm, Ralph Johnson, John Vlissides",
                                "Addison-Wesley"
                        )
                )
        );

        course.printCourseDetails();
    }
}
