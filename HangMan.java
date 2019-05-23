import java.util.Scanner;

public class HangMan {

    private static String[] words = {"mupp", "muppar", "mupparna", "troll", "smurf", "sprit" , "fotboll", "bulle", "dator", "ko", "bio", "vatten", };



    private static String word = words[(int) (Math.random() * words.length)];
    private static String asterisk = new String(new char[word.length()]).replace("\0", "*");
    private static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("============================");
        System.out.println("|      Välkommen till      |");
        System.out.println("|   ☠ The HangingMan ☠    |");
        System.out.println("============================");
        System.out.println("|                          |");
        System.out.println("|   Let the game begin     |");
        System.out.println("|__________________________|");
        System.out.println("|                          |");
        System.out.println("|      ╭∩╮（︶︿︶）╭∩╮      |");
        System.out.println("============================");
        while (count < 7 && asterisk.contains("*")) {
            System.out.println("Nu ska du gissa ordet");
            System.out.println("----------------------");
            System.out.println(asterisk);
            String guess = sc.next().toLowerCase();
            hang(guess);
        }
        sc.close();
    }

    public static void hang(String guess) {
        String newasterisk = "";
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == guess.charAt(0)) {
                newasterisk += guess.charAt(0);
            } else if (asterisk.charAt(i) != '*') {
                newasterisk += word.charAt(i);
            } else {
                newasterisk += "*";
            }
        }

        if (asterisk.equals(newasterisk)) {
            count++;
            hangmanImage();
        } else {
            asterisk = newasterisk;
        }
        if (asterisk.equals(word)) {
            System.out.println("Rätt svar! Du lyckades ♪┏(°.°)┛! ordet var " + word);
        }
    }

    public static void hangmanImage() {
        if (count == 1) {
            System.out.println("Fel, Försök igen ฅ^•ﻌ•^ฅ");
            System.out.println("         ____________");
            System.out.println("        |            |");
            System.out.println("        |            |");
            System.out.println("        |            |");
            System.out.println("        |            |");
            System.out.println("        |            |");
            System.out.println("         ____________");
            System.out.print("\n");
        }
        if (count == 2) {
            System.out.println("Fel, Försök igen ฅ^•ﻌ•^ฅ");
            System.out.println("         ____________");
            System.out.println("        |      |___  |");
            System.out.println("        |      (._.) |");
            System.out.println("        |            |");
            System.out.println("        |            |");
            System.out.println("        |            |");
            System.out.println("         ____________");
            System.out.print("\n");
        }
        if (count == 3) {
            System.out.println("Fel, Försök igen ฅ^•ﻌ•^ฅ");
            System.out.println("         ____________");
            System.out.println("        |      |___  |");
            System.out.println("        |      (._.) |");
            System.out.println("        |       <|  |");
            System.out.println("        |            |");
            System.out.println("        |            |");
            System.out.println("         ____________");
            System.out.print("\n");
        }
        if (count == 4) {
            System.out.println("Fel, Försök igen ฅ^•ﻌ•^ฅ");
            System.out.println("         ____________");
            System.out.println("        |      |___  |");
            System.out.println("        |      (._.) |");
            System.out.println("        |       <|>  |");
            System.out.println("        |            |");
            System.out.println("        |            |");
            System.out.println("         ____________");
            System.out.print("\n");

        }
        if (count == 5) {
            System.out.println("Fel, Försök igen ฅ^•ﻌ•^ฅ");
            System.out.println("         ____________");
            System.out.println("        |      |___  |");
            System.out.println("        |      (._.) |");
            System.out.println("        |       <|>  |");
            System.out.println("        |      _/\\_ |");
            System.out.println("        |            |");
            System.out.println("         ____________");
            System.out.print("\n");
        }
        if (count == 6) {
            System.out.println("Fel, Försök igen d[-_-]b");
            System.out.println("         ____________");
            System.out.println("        |      |___  |");
            System.out.println("        |      (=_=) |");
            System.out.println("        |       <|>  |");
            System.out.println("        |      _/\\_ |");
            System.out.println("        |            |");
            System.out.println("         ____________");
            System.out.print("\n");
        }
        if (count == 7) {
            System.out.println("GAME OVER!");
            System.out.println("         ____________");
            System.out.println("        |      |___  |");
            System.out.println("        |      (X_X) |");
            System.out.println("        |       <|>  |");
            System.out.println("        |      _/\\_  |");
            System.out.println("        |            |");
            System.out.println("         ____________");
            System.out.print("\n");
            System.out.println("GAME OVER! ordet var " + word);
        }
    }
}

