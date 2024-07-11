package second_semester.Z_Probepruefung2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DatenEinlesen {

    private void readFileAndCalculateSize(String woerterbuchfile) throws NumberFormatException, IOException {
        FileReader fr = new FileReader(woerterbuchfile);
        BufferedReader br = new BufferedReader(fr);
        int totalSize = 0;
        String line;

        while ((line = br.readLine()) != null) {
            System.out.println(line);
            if (!line.contains("DIR")) {
                String[] elements = line.split(" ");
                if (elements.length > 2) {
                    try {
                        int fileSize = Integer.parseInt(elements[2]);
                        totalSize += fileSize;
                    } catch (NumberFormatException e) {
                        System.err.println("Invalid number format in line: " + line);
                    }
                }
            }
        }
        br.close();

        System.out.println("\n"+"Total size: " + (double) totalSize / 1000000 + " MB");
    }

    public static void main(String[] args) throws NumberFormatException, IOException {

        String datei = "/home/woodz/Dev/Projects/Study-Java/src/second_semester/DatenStrukturen/Uebungen/text copy.txt";

        DatenEinlesen de = new DatenEinlesen();
        de.readFileAndCalculateSize(datei);

    }
}
