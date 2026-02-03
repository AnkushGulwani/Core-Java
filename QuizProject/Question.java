public class Question {
    private int id;
    private String question;
    private String opt1;
    private String opt2;
    private String opt3;
    private String opt4;
    private String result;

    public Question(int id, String question, String opt1, String opt2, String opt3, String opt4, String result) {
        this.id = id;
        this.question = question;
        this.opt1 = opt1;
        this.opt2 = opt2;
        this.opt3 = opt3;
        this.opt4 = opt4;
        this.result = result;
    }

    public int getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }

    public String getOpt1() {
        return opt1;
    }

    public String getOpt2() {
        return opt2;
    }

    public String getOpt3() {
        return opt3;
    }

    public String getOpt4() {
        return opt4;
    }

    public String getResult() {
        return result;
    }

    // Helper method to print the question
    public void printQuestion() {
        System.out.println(id + ". " + question);
        System.out.println("1) " + opt1);
        System.out.println("2) " + opt2);
        System.out.println("3) " + opt3);
        System.out.println("4) " + opt4);
    }
}