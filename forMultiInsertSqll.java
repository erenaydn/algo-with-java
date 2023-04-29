import java.io.*;

public class forMultiInsertSql {
    public static void main(String[] args) throws IOException {
        File inputFile = new File("inputFile.txt");
        File outputFile = new File("outputFile.txt");
        String differentPart;

        FileReader fileReader = new FileReader(inputFile);
        BufferedReader br = new BufferedReader(fileReader);
        FileWriter fileWriter = new FileWriter(outputFile);
        BufferedWriter wr = new BufferedWriter(fileWriter);

        while ((differentPart = br.readLine()) != null) {
            String kelime = "TEXT\n" +
                    "TEXT\n" +
                    "TEXT, " + differentPart + ", TEXT;\n\n";
            wr.write(kelime);
            System.out.println(differentPart);
        }
        br.close();
        wr.close();
    }

}