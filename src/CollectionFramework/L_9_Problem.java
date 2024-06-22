package CollectionFramework;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class FileMatch {
    @SuppressWarnings("resource")
    public Map<Integer, String> Old1(String File_Name) throws IOException {
        FileReader F = new FileReader(File_Name);
        Scanner S = new Scanner(F);
        Map<Integer, String> M1 = new TreeMap<>();
        while (S.hasNextLine()) {
            String M = S.nextLine();
            String[] Token = M.split(" ");
            int AC = Integer.parseInt(Token[0]);
            M1.put(AC, Token[1]);
        }
        F.close();
        return M1;
    }

    @SuppressWarnings("resource")
    public Map<Integer, Double> Old2(String File_Name) throws IOException {
        FileReader F = new FileReader(File_Name);
        Scanner S = new Scanner(F);
        Map<Integer, Double> M2 = new TreeMap<>();
        while (S.hasNextLine()) {
            String M = S.nextLine();
            String[] Token = M.split(" ");
            int AC = Integer.parseInt(Token[0]);
            double Salary = Double.parseDouble(Token[2]);
            M2.put(AC, Salary);
        }
        F.close();
        return M2;
    }
}

class Tran {
    @SuppressWarnings("resource")
    public Map<Integer, Double> Calculation(String File_Name) throws IOException {
        FileReader F = new FileReader(File_Name);
        Map<Integer, Double> M3 = new TreeMap<>();
        Scanner S = new Scanner(F);
        while (S.hasNextLine()) {
            String M = S.nextLine();
            String[] Token = M.split(" ");
            int AC = Integer.parseInt(Token[0]);
            double Salary = Double.parseDouble(Token[1]);
            if (M3.containsKey(AC)) {
                M3.put(AC, M3.get(AC) + Salary);
            } else {
                M3.put(AC, Salary);
            }
        }
        F.close();
        return M3;
    }
}

class Result {
    public void Out() throws IOException {
        FileMatch O = new FileMatch();
        Map<Integer, String> M1 = O.Old1("Oldmast.txt");
        Map<Integer, Double> M2 = O.Old2("Oldmast.txt");
        Tran T = new Tran();
        Map<Integer, Double> M3 = T.Calculation("trans.txt");
        FileWriter F = new FileWriter("log.txt");
        for (Integer it : M3.keySet()) {
            if (M2.containsKey(it)) {
                M2.put(it, M2.get(it) + M3.get(it));
            } else {
                F.write("Unmatched Trasaction A/C: " + it + "\n");
            }
        }
        F.close();
        FileWriter G = new FileWriter("newmast.txt");
        for (Integer I : M1.keySet()) {
            G.write(I + " " + M1.get(I) + " " + M2.get(I) + "\n");
        }
        G.close();
    }

}

public class L_9_Problem {
    public static void main(String[] args) throws IOException {
        Result R = new Result();
        R.Out();
    }
}
