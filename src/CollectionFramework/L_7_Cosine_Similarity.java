package CollectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class L_7_Cosine_Similarity {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        String D1 = S.nextLine();
        String D2 = S.nextLine();
        String Cat = D1 + " " + D2;
        Map<String, Integer> ST = new HashMap<>();
        String[] Token = Cat.split(" ");

        for (String string : Token) {
            ST.put(string, 0);
        }

        String[] DT1 = D1.split(" ");
        String[] DT2 = D2.split(" ");
        Map<String, Integer> ST1 = new HashMap<>();
        Map<String, Integer> ST2 = new HashMap<>();

        for (String string : DT1) { 
            ST1.put(string, ST1.getOrDefault(string, 0) + 1);
        }

        for (String string : DT2) { 
            ST2.put(string, ST2.getOrDefault(string, 0) + 1);
        }

        System.out.println(ST1);
        System.out.println(ST2);

        double dotProduct = 0.0;
        double normA = 0.0;
        double normB = 0.0;

        for (String key : ST.keySet()) {
            int freqA = ST1.getOrDefault(key, 0);
            int freqB = ST2.getOrDefault(key, 0);

            dotProduct += freqA * freqB;
            normA += Math.pow(freqA, 2);
            normB += Math.pow(freqB, 2);
        }

        double cosineSimilarity = dotProduct / (Math.sqrt(normA) * Math.sqrt(normB));
        System.out.println("Cosine Similarity: " + cosineSimilarity);

        S.close();
    }
}
