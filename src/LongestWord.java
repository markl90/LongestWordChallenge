import java.util.Scanner;

public class LongestWord {
    
    public static String LongestWord(String input) {
        String [] words = input.replaceAll("[^a-zA-Z0-9 ]", "").split(" ");
        String longest = "";
        for(int i = 0; i<words.length; i++){
            String word = words[i];
            if(word.length() > longest.length()){
                longest = word;
            }
        }
        return longest;
    }

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()) {
            System.out.print(LongestWord(scanner.nextLine()));
        }
    }

}
