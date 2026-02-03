import java.util.*;
public class MessageDecoderUser

 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter Encrypted Message: ");
        String encrypted = sc.nextLine();
        int shift = 7;
        String decrypted = "";

        // Step 1: Shift each character back by 7
        for (int i = 0; i < encrypted.length(); i++) {
            char ch = encrypted.charAt(i);
            char dec = (char)(ch - shift);
            if (dec < 'A') {
                dec += 26; // Wrap around from A to Z
            }
            decrypted += dec;
        }

        // Step 2: Replace "QQ" with space
        decrypted = decrypted.replace("QQ", " ");

        // Step 3: Display final result
        System.out.println("Original Message: " + decrypted.trim());
    }
}
