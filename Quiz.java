import java.util.*;

public class Quiz {
    Question[] questions;
    int score;
    Map<Question, Integer> wrongAnswers; // Store wrong questions & user's choice

    public Quiz(Question[] questions) {
        this.questions = questions;
        this.score = 0;
        this.wrongAnswers = new LinkedHashMap<>();
    }

    public void start(String playerName) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n===== Welcome, " + playerName + "! =====");

        int qNumber = 1;
        for (Question q : questions) {
            System.out.println("\nQuestion " + qNumber + ":");
            q.display();

            int ans = -1;
            while (true) {
                System.out.print("Enter your answer (1-" + q.options.length + "): ");
                if (sc.hasNextInt()) {
                    ans = sc.nextInt();
                    if (ans >= 1 && ans <= q.options.length) break;
                    else System.out.println(" Enter a valid number.");
                } else {
                    System.out.println(" Invalid input! Enter a number.");
                    sc.next();
                }
            }

            if (q.checkAnswer(ans)) {
                score++;
            } else {
                wrongAnswers.put(q, ans);
            }
            qNumber++;
        }

        // Quiz over
        System.out.println("\n===== Quiz Over =====");
        System.out.println("Player: " + playerName);
        System.out.println("Your Score: " + score + " / " + questions.length);

        double percentage = ((double) score / questions.length) * 100;
        if (percentage >= 50) System.out.println(" Pass!");
        else System.out.println(" Fail!");

        // ✅ Show wrong answers only at the end
        if (!wrongAnswers.isEmpty()) {
            System.out.println("\n===== Questions You Got Wrong =====");
            for (Map.Entry<Question, Integer> entry : wrongAnswers.entrySet()) {
                Question q = entry.getKey();
                int userAns = entry.getValue() - 1;
                System.out.println("\nQuestion: " + q.question);
                System.out.println("Your Answer: " + (userAns >= 0 && userAns < q.options.length ? q.options[userAns] : "Invalid"));
                System.out.println("Correct Answer: " + q.correctAnswerText);
            }
        } else {
            System.out.println("\n Amazing! You got all correct!");
        }
    }
}
