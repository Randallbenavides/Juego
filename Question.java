public class Question {
    public String question_statement = "";
    Answer[] answers = new Answer[5];

    public Question (String statement, Answer[] answers_param) {
        question_statement = statement;
        answers = answers_param;
    }

    static class Answer {
        String statement = "";
        Boolean right_answer = false;
    }
}
