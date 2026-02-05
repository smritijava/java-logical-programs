import java.util.Scanner;

class SortWordsAlphabetically {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine() + " ";  // Add space to process the last word

        String[] words = new String[50];  // assuming max 50 words
        int wordCount = 0;
        String word = "";

        // Extract words manually
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (ch != ' ') {
                word += ch;
            } else if (!word.equals("")) {
                words[wordCount] = word;
                wordCount++;
                word = "";
            }
        }

        // Sort the words using simple bubble sort
        for (int i = 0; i < wordCount - 1; i++) {
            for (int j = 0; j < wordCount - 1 - i; j++) {
                if (words[j].compareToIgnoreCase(words[j + 1]) > 0) {
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }

        // Display sorted words
        System.out.println("Words in alphabetical order:");
        for (int i = 0; i < wordCount; i++) {
            System.out.print(words[i] + " ");
        }
    }
}
