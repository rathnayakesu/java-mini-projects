public class quiz {
    static void main(String[] args) {

        String[] questions = {"What is the time complexity of accessing an element in an array by its index?",
                              "Which data structure operates on a Last-In, First-Out (LIFO) principle?",
                              "Which keyword is used in Python to define a function?",
                              "In Boolean logic, what is the result of the expression (True AND False) OR True?",
                              "Which of the following sorting algorithms generally has a worst-case time complexity of $O(n^2)$?"};

        String[][] answers = {{"$O(1)$", "$O(n)$", "$O(log n)$", "$O(n^2)$"},
                              {"Queue", "Stack", "Linked List", "Tree"},
                              {"func", "function", "def", "define"},
                              {"False", "True", "Error", "None"},
                              {"Merge Sort", "Quick Sort", "Bubble Sort", "Heap Sort"}};

        int[] correctAnswer = {1, 2, 3, 2, 3};
        int score = 0;
        int guess;

    }
}
