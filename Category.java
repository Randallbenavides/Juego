public class Category {
    public String name = "";
    public Question[] questions = new Question[5];

    public Category(Question[] questions_params) {
        questions = questions_params;
    }
}
