import java.util.*;

public class Question {
    String question;
    String[] options;
    int correctAnswerIndex; // 0-based
    String correctAnswerText;

    public Question(String question, String[] options, int correctAnswerIndex) {
        this.question = question;
        this.options = options;
        this.correctAnswerIndex = correctAnswerIndex;
        this.correctAnswerText = options[correctAnswerIndex];
    }

    public void display() {
        System.out.println("\n" + question);

        // Shuffle options for display
        List<String> optionList = new ArrayList<>(Arrays.asList(options));
        Collections.shuffle(optionList);
        options = optionList.toArray(new String[0]);

        // Update correct answer index after shuffle
        correctAnswerIndex = Arrays.asList(options).indexOf(correctAnswerText);

        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
    }

    public boolean checkAnswer(int answer) {
        return answer - 1 == correctAnswerIndex;
    }
}
