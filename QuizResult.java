import java.util.Scanner;

class QuizResult {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N;

        System.out.print("Enter number of participants (between 4 and 10): ");
        N = sc.nextInt();

        if (N < 4 || N > 10) {
            System.out.println("Invalid input. Number of participants must be between 4 and 10.");
            return;
        }

        char[][] answers = new char[N][5];
        char[] key = new char[5];
        int[] scores = new int[N];
        int highest = 0;

        // Input answers for each participant
        System.out.println("Enter answers for each participant (A/B/C/D):");
        for (int i = 0; i < N; i++) {
            System.out.println("Participant " + (i + 1) + ":");
            for (int j = 0; j < 5; j++) {
                System.out.print("Q" + (j + 1) + ": ");
                char ch = sc.next().toUpperCase().charAt(0);

                if (ch != 'A' && ch != 'B' && ch != 'C' && ch != 'D') {
                    System.out.println("Invalid answer entered. Only A, B, C, or D allowed.");
                    return;
                }

                answers[i][j] = ch;
            }
        }

        // Input correct answer key
        System.out.println("Enter the correct answers for the 5 questions:");
        for (int j = 0; j < 5; j++) {
            System.out.print("Answer for Q" + (j + 1) + ": ");
            char ch = sc.next().toUpperCase().charAt(0);

            if (ch != 'A' && ch != 'B' && ch != 'C' && ch != 'D') {
                System.out.println("Invalid answer key. Only A, B, C, or D allowed.");
                return;
            }

            key[j] = ch;
        }

        // Calculate scores
        for (int i = 0; i < N; i++) {
            int score = 0;
            for (int j = 0; j < 5; j++) {
                if (answers[i][j] == key[j]) {
                    score++;
                }
            }
            scores[i] = score;
            if (score > highest) {
                highest = score;
            }
        }

        // Display scores
        System.out.println("Scores of each participant:");
        for (int i = 0; i < N; i++) {
            System.out.println("Participant " + (i + 1) + ": " + scores[i] + " marks");
        }

        System.out.println("Highest Score: " + highest);
        System.out.println("Top Scorer(s):");
        for (int i = 0; i < N; i++) {
            if (scores[i] == highest) {
                System.out.println("Participant " + (i + 1));
            }
        }
    }
}
