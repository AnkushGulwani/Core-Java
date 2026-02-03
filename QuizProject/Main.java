import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuestionService service = new QuestionService();
        service.loadQuestions();

        int score = 0;

        for (Question q : service.getQuestions()) {
            q.printQuestion();
            System.out.print("Enter your choice (1-4): ");
            int choice = sc.nextInt();

            String selectedAnswer = switch (choice) {
                case 1 -> q.getOpt1();
                case 2 -> q.getOpt2();
                case 3 -> q.getOpt3();
                case 4 -> q.getOpt4();
                default -> "";
            };

            if (selectedAnswer.equals(q.getResult())) {
                System.out.println("✅ Correct!\n");
                score++;
            } else {
                System.out.println("❌ Wrong! Correct answer: " + q.getResult() + "\n");
            }
        }

        System.out.println("Quiz finished! Your score: " + score + "/" + service.getQuestions().length);
        sc.close();
    }
}