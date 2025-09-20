import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== JAVA QUIZ APPLICATION =====");
        System.out.print("Enter your name: ");
        String playerName = sc.nextLine();

        // Questions
        Question[] quizQuestions = {
            new Question("Which language is used for Android development?",
                    new String[]{"Python", "Java", "C++", "Kotlin"}, 3),
            new Question("Which company developed Java?",
                    new String[]{"Microsoft", "Apple", "Sun Microsystems", "Google"}, 2),
            new Question("Which keyword is used to inherit a class in Java?",
                    new String[]{"this", "super", "extends", "implements"}, 2),
            new Question("Which of the following is not an OOP concept?",
                    new String[]{"Encapsulation", "Polymorphism", "Compilation", "Inheritance"}, 2),
            new Question("Which method is the entry point of a Java program?",
                    new String[]{"start()", "main()", "run()", "init()"}, 1),
            new Question("Which operator is used to allocate memory for objects?",
                    new String[]{"malloc", "allocate", "new", "alloc"}, 2),
            new Question("Which version of Java introduced lambda expressions?",
                    new String[]{"Java 6", "Java 7", "Java 8", "Java 11"}, 2),
            new Question("Which is the parent class of all Java classes?",
                    new String[]{"Object", "Class", "Super", "Base"}, 0)
        };

        // Shuffle questions
        List<Question> questionList = Arrays.asList(quizQuestions);
        Collections.shuffle(questionList);

        Quiz quiz = new Quiz(questionList.toArray(new Question[0]));
        quiz.start(playerName);

        sc.close();
    }
}
