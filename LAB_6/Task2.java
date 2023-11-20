public class Task2 {

    public static String lowercaseWords(String input) {
        StringBuilder result = new StringBuilder();
        String[] words = input.split("\\s"); // Розділити рядок на слова за пробілами

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String lowercaseWord = word.toLowerCase(); // Перетворити слово на маленькі літери

            if (i == 0) {
                // Перше слово без пробілу перед ним
                result.append(lowercaseWord);
            } else {
                // Інші слова з пробілом перед ними
                result.append(" ").append(lowercaseWord);
            }
        }

        return result.toString();
    }


    static void printResults(String input) {
        try {
            System.out.println("new string = " + lowercaseWords(input));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION!" + e.getMessage());
        }
    }


    public static void main(String[] args) {

        String input = "The user with     The nickname koala757677 This month wrote 3 times more " +
                "comments than the user with the nickname croco181dile920 4 months ago";

        System.out.println("old string = " + input);

        printResults(input);

    }












}
