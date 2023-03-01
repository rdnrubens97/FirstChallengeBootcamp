import java.time.LocalDate;
import domain.Bootcamp;
import domain.Course;
import domain.Dev;
import domain.Mentoring;

public class Main {
    public static void main(String[] args) {

        //creating java course:
        Course basicJava = new Course();
        basicJava.setTitle("basic java");
        basicJava.setDescription("learning basic java");
        basicJava.setWorkload(8d);

        //creating js course:
        Course advancedJava = new Course();
        advancedJava.setTitle("advanced java");
        advancedJava.setDescription("learning advanced java");
        advancedJava.setWorkload(10d);           

        //creating java mentorship:
        Mentoring mentoringJava = new Mentoring();
        mentoringJava.setTitle("java");
        mentoringJava.setDescription("reviewing java");
        mentoringJava.setDate(LocalDate.now());

        //creating bootcamp:
        Bootcamp bootcampJava = new Bootcamp();
        bootcampJava.setName("Bootcamp Java Developer");
        bootcampJava.setDescription("Basic and Advanced Java");
        bootcampJava.getContents().add(basicJava);
        bootcampJava.getContents().add(advancedJava);
        bootcampJava.getContents().add(mentoringJava);

        //creating dev's and resume:

        System.out.println();
        System.out.println(" - - - - - - - - - - - RESUME - - - - - - - - - - - ");
        Dev devRubens = new Dev();
        devRubens.setName("Rubens");
        devRubens.subscribeBootcamp(bootcampJava);
        System.out.println("Subscribed contents of Rubens: " + devRubens.getSubscribedContents());
        System.out.println("Finished contents of Rubens: " + devRubens.getFinishedContents());
        devRubens.toProgress();
        System.out.println();
        System.err.println("Advancing in learning");
        System.out.println();
        System.out.println("Subscribed contents of Rubens: " + devRubens.getSubscribedContents());
        System.out.println("Finished contents of Rubens: " + devRubens.getFinishedContents());
        System.out.println("XP: " + devRubens.calculateTotalXP());

        System.out.println();
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - ");
        System.out.println();

        Dev devLarissa = new Dev();
        devLarissa.setName("Larissa");
        devLarissa.subscribeBootcamp(bootcampJava);
        System.out.println("Subscribed contents of Larissa: " + devLarissa.getSubscribedContents());
        devLarissa.toProgress();
        devLarissa.toProgress();
        devLarissa.toProgress();
        System.out.println();
        System.err.println("Advancing in learning");
        System.out.println();
        System.out.println("Subscribed contents of Larissa: " + devLarissa.getSubscribedContents());
        System.out.println("Finished contents of Larissa: " + devLarissa.getFinishedContents());
        System.out.println("XP: " + devLarissa.calculateTotalXP());
        System.out.println();

    

        



    }
    
}
