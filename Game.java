import java.util.Random;
import java.util.*;

public class Game {
    public Category[] gameCategories = new Category[5];

    public Game(Category[] categories_params) {
        gameCategories = categories_params;// The order of the categories simulate the level of complexity of questions
    }

    public Question chooseQuestion(Category category) {
        int randomNum = new Random().nextInt(5);
        return category.questions[randomNum];
    }

    public void printQuestion(Question q){
        System.out.println("Question: " + q.question_statement);
        for(int i = 0; i < 5; i++){
            System.out.print( (i +1) + ".");
            System.out.println(q.answers[i].statement);
        }
    }

    public boolean isCorrect(Question q, String answer_number){
        return (q.answers[ Integer.parseInt(answer_number) - 1].right_answer == true) ? true : false;
    }

    public void Run() {
        int score = 0;
        boolean game_not_over = true;
        int i = 0;
        System.out.println("Let's play a game and answer some categorized questions! ");
        do{
            if(i > 4) {
                System.out.print("You won!!");
                break;
            }
           Question q = chooseQuestion(gameCategories[i]);
           printQuestion(q);
            Scanner sc= new Scanner(System.in);
            System.out.print("Enter number of answer: ");
            String str= sc.nextLine();
            System.out.println("You have entered: "+ str);
            game_not_over = isCorrect(q,str);
            if (game_not_over) score++;
            i++;
        }while (game_not_over);
        System.out.println("You scored " + score);
    }
}
