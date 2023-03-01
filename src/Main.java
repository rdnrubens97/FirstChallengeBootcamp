import java.time.LocalDate;

import javax.xml.transform.Source;

import domain.Course;
import domain.Mentoring;

public class Main {
    public static void main(String[] args) {,

        //creating java course
        Course java = new Course();
        java.setTitle("java 11");
        java.setDescription("learning java 11");
        java.setWorkload(8d);

        System.out.println(java);     

        //creating basic java mentorship
        Mentoring basicJava = new Mentoring();
        basicJava.setTitle("basic java");
        basicJava.setDescription("reviewing basic java");
        basicJava.setDate(LocalDate.now());

        System.out.println(basicJava);




    }
    
}
