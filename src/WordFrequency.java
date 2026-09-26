//WAP in Java to accept a sentence and find the frequency of each word.

import java.util.Scanner;

class WordFrequency
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- INPUT ---");
        System.out.print(" - Enter the sentence: ");
        String sentence = sc.nextLine();

        String[] words = sentence.split(" ");

        System.out.println("\n--- OUTPUT ---");
        for(int i = 0; i < words.length; i++)
        {
            String word = words[i];
            if(word.equals("")) continue;

            int frequency = 0;
            for(int j = 0; j < words.length; j++)
            {
                if(!words[j].equalsIgnoreCase(word)) continue;
                words[j] = "";
                frequency++;
            }

            System.out.println(" -> " + word + " x" + frequency);
        }
    }
}