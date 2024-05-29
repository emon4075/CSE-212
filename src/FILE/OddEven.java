package FILE;

import java.io.*;
import java.io.IOException;

public class OddEven {
    public static void main(String[] args) {
        File inFile = new File("E:/CSE-212/src/FILE/num.txt");
        File oddFile = new File("E:/CSE-212/src/FILE/odd.txt");
        File evenFile = new File("E:/CSE-212/src/FILE/even.txt");
        BufferedReader ins = null;
        FileWriter odd = null;
        FileWriter even = null;
        
        try {
            ins = new BufferedReader(new FileReader(inFile));
            odd = new FileWriter(oddFile);
            even = new FileWriter(evenFile);
            String intr = "";
            String filedata = "";
            while ((intr = ins.readLine()) != null) {
                filedata += intr + " ";
            }
            String delims = " ";
            String[] token = filedata.split(delims);
            int word;
            for (int i = 0; i < token.length; i++) {
                word = Integer.parseInt(token[i]);
                if (word % 2 == 0)
                    even.write(word + " ");
                else
                    odd.write(word + " ");
            }
        } catch (IOException e) {
            System.out.println(e);
            System.exit(-1);
        } finally {
            try {
                ins.close();
                odd.close();
                even.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}