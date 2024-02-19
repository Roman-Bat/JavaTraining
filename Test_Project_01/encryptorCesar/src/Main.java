import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите слово для шифрования на кириллице:");
        String word = scanner.nextLine();

        System.out.println("Введите смещение:");
        int shift = scanner.nextInt();

        String encryptedWord = encrypt(word, shift);
        System.out.println("Зашифрованное слово: " + encryptedWord);

        String deencryptedWord = deencrypt(encryptedWord, shift);
        System.out.println("Раcшифрованное слово: " + deencryptedWord);
    }

    public static String encrypt(String word, int shift) {
        StringBuilder encryptedWord = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            // Проверяем, является ли символ кириллической буквой
            if (Character.UnicodeBlock.of(currentChar) == Character.UnicodeBlock.CYRILLIC) {
                // Вычисляем новый символ с учетом смещения
                char newChar = (char) (((int) currentChar + shift - 'А') % ('а'-'А') + 'А');
                encryptedWord.append(newChar);
            } else {
                // Если символ не кириллическая буква, просто добавляем его в зашифрованное слово без изменений
                encryptedWord.append(currentChar);
            }
        }

        return encryptedWord.toString();

    }
    public static String deencrypt (String word, int shift){
        StringBuilder decryptedWord = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            // Проверяем, является ли символ кириллической буквой
            if (Character.UnicodeBlock.of(currentChar) == Character.UnicodeBlock.CYRILLIC) {
                // Вычисляем новый символ с учетом смещения
                char newChar = (char) (((int) currentChar - shift - 1040 + 32) % 32 + 1040);
                decryptedWord.append(newChar);
            } else {
                // Если символ не кириллическая буква, просто добавляем его в расшифрованное слово без изменений
                decryptedWord.append(currentChar);
            }
        }

        return decryptedWord.toString();
    }
}