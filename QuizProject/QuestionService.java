public class QuestionService {
    Question[] questions = new Question[3];

    public void loadQuestions() {
        questions[0] = new Question(1, "Which language is used for Android development?",
                                    "Python", "Java", "C++", "Swift", "Java");
        questions[1] = new Question(2, "Which keyword is used to inherit a class in Java?",
                                    "extends", "implements", "inherits", "super", "extends");
        questions[2] = new Question(3, "Which data structure uses FIFO?",
                                    "Stack", "Queue", "Tree", "Graph", "Queue");
    }

    public Question[] getQuestions() {
        return questions;
    }
}