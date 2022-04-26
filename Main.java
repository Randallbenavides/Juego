public class Main {
    public static void main(String[] args) {
        Question.Answer a1 = new Question.Answer(); //Answers of question 1
        a1.statement = "Answer 1 of Question 1";
        a1.right_answer = true;
        Question.Answer a2 = new Question.Answer();
        a2.statement = "Answer 2 of Question 1";
        a2.right_answer = false;
        Question.Answer a3 = new Question.Answer();
        a3.statement = "Answer 3 of Question 1";
        a3.right_answer = false;
        Question.Answer a4 = new Question.Answer();
        a4.statement = "Answer 4 of Question 1";
        a4.right_answer = false;
        Question.Answer a5 = new Question.Answer();
        a5.statement = "Answer 5 of Question 1";
        a5.right_answer = false;
        Question.Answer[] answers1 = new Question.Answer[]{a1,a2,a3,a4,a5};
        Question q1 = new Question("Any question?", answers1);  //Question1 of Category 1

        Question.Answer a6 = new Question.Answer(); //Answers of question 2
        a6.statement = "Answer 1 of Question 2";
        a6.right_answer = true;
        Question.Answer a7 = new Question.Answer();
        a7.statement = "Answer 2 of Question 2";
        a7.right_answer = false;
        Question.Answer a8 = new Question.Answer();
        a8.statement = "Answer 3 of Question 2";
        a8.right_answer = false;
        Question.Answer a9 = new Question.Answer();
        a9.statement = "Answer 4 of Question 2";
        a9.right_answer = false;
        Question.Answer a10 = new Question.Answer();
        a10.statement = "Answer 5 of Question 2";
        a10.right_answer = false;
        Question.Answer[] answers2 = new Question.Answer[]{a6,a7,a8,a9,a10};
        Question q2 = new Question("Any question?", answers2);  //Question 2 of Category 1

        Question.Answer a11 = new Question.Answer(); //Answers of question 3
        a11.statement = "Answer 1 of Question 3";
        a11.right_answer = true;
        Question.Answer a12 = new Question.Answer();
        a12.statement = "Answer 2 of Question 3";
        a12.right_answer = false;
        Question.Answer a13 = new Question.Answer();
        a13.statement = "Answer 3 of Question 3";
        a13.right_answer = false;
        Question.Answer a14 = new Question.Answer();
        a14.statement = "Answer 4 of Question 3";
        a14.right_answer = false;
        Question.Answer a15 = new Question.Answer();
        a15.statement = "Answer 5 of Question 3";
        a15.right_answer = false;
        Question.Answer[] answers3 = new Question.Answer[]{a11,a12,a13,a14,a15};
        Question q3 = new Question("Any question?", answers3);  //Question 3 of Category 1

        Question.Answer a16 = new Question.Answer(); //Answers of question 4
        a16.statement = "Answer 1 of Question 4";
        a16.right_answer = true;
        Question.Answer a17 = new Question.Answer();
        a17.statement = "Answer 2 of Question 4";
        a17.right_answer = false;
        Question.Answer a18 = new Question.Answer();
        a18.statement = "Answer 3 of Question 4";
        a18.right_answer = false;
        Question.Answer a19 = new Question.Answer();
        a19.statement = "Answer 4 of Question 4";
        a19.right_answer = false;
        Question.Answer a20 = new Question.Answer();
        a20.statement = "Answer 5 of Question 4";
        a20.right_answer = false;
        Question.Answer[] answers4 = new Question.Answer[]{a16,a17,a18,a19,a20};
        Question q4 = new Question("Any question?", answers4);  //Question 4 of Category 1

        Question.Answer a21 = new Question.Answer(); //Answers of question 4
        a21.statement = "Answer 1 of Question 5";
        a21.right_answer = true;
        Question.Answer a22 = new Question.Answer();
        a22.statement = "Answer 2 of Question 5";
        a22.right_answer = false;
        Question.Answer a23 = new Question.Answer();
        a23.statement = "Answer 3 of Question 5";
        a23.right_answer = false;
        Question.Answer a24 = new Question.Answer();
        a24.statement = "Answer 4 of Question 5";
        a24.right_answer = false;
        Question.Answer a25 = new Question.Answer();
        a25.statement = "Answer 5 of Question 5";
        a25.right_answer = false;
        Question.Answer[] answers5 = new Question.Answer[]{a21,a22,a23,a24,a25};
        Question q5 = new Question("Any question?", answers5);  //Question 5 of Category 1

        Question[] questions_params = new Question[]{q1,q2,q3,q4,q5};

        Category cat1 = new Category(questions_params); //Create category 1
        Category cat2 = new Category(questions_params); //Create category 2
        Category cat3 = new Category(questions_params); //Create category 3
        Category cat4 = new Category(questions_params); //Create category 4
        Category cat5 = new Category(questions_params); //Create category 5

        Category[] categories_params = new Category[]{cat1,cat2,cat3,cat4,cat5};

        Game g = new Game(categories_params);
        g.Run();
    }
}
