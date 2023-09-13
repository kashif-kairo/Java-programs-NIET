package InnerClass;
// write a java code to check the given ch is vowel or not using lambda expression
import java.util.function.Predicate;

public class LambdaFun4 {
    public static void main(String[] args) {
        // Character to check
        char ch = 'e';

        // Using a lambda expression to check if the character is a vowel
        Predicate<Character> isVowel = c -> {
            char lowercaseChar = Character.toLowerCase(c);
            return lowercaseChar == 'a' || lowercaseChar == 'e' || lowercaseChar == 'i' || lowercaseChar == 'o' || lowercaseChar == 'u';
        };

        // Checking if the character is a vowel
        boolean result = isVowel.test(ch);

        if (result) {
            System.out.println(ch + " is a vowel.");
        } else {
            System.out.println(ch + " is not a vowel.");
        }
    }
}

