import java.util.Scanner;

public class quiz {
    static void main(String[] args) {

        String[] questions = {"What is the time complexity of accessing an element in an array by its index?",
                              "Which data structure operates on a Last-In, First-Out (LIFO) principle?",
                              "Which keyword is used in Python to define a function?",
                              "In Boolean logic, what is the result of the expression (True AND False) OR True?",
                              "Which of the following sorting algorithms generally has a worst-case time complexity of $O(n^2)$?"};

        String[][] answers = {{"1.$O(1)$", "2.$O(n)$", "3.$O(log n)$", "4.$O(n^2)$"},
                              {"1.Queue", "2.Stack", "3.Linked List", "4.Tree"},
                              {"1.func", "2.function", "3.def", "4.define"},
                              {"1.False", "2.True", "3.Error", "4.None"},
                              {"1.Merge Sort", "2.Quick Sort", "3.Bubble Sort", "4.Heap Sort"}};

        int[] correctAnswer = {1, 2, 3, 2, 3};
        int score = 0;
        int guess;

        Scanner scn = new Scanner(System.in);

        System.out.println("*****************************");
        System.out.println("Welcome to the java Quiz Game");
        System.out.println("*****************************");

        for (int i=0; i < questions.length; i++){
            System.out.println(questions[i]);

            for(String option : answers[i]){
                System.out.println(option);
            }

            System.out.print("Enter the answer: ");
            guess = scn.nextInt();

            if(guess == correctAnswer[i]){
                System.out.println("-----------------");
                System.out.println(" CORRECT! ");
                System.out.println("-----------------");
                score++;
            }
            else{
                System.out.println("-----------------");
                System.out.println(" WRONG! ");
                System.out.println("-----------------");
            }
        }

        System.out.println("Your final score is "+ score + " out of "+ questions.length+".");


        scn.close();


    }
}
