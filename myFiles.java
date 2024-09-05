// Lucas 9/5/24

import java.io.*;

public class myFiles {
    public static void main(String[] args) {

        System.out.println("Hello and welcome");

        String[] names = {"John", "Carl", "Jerry"};
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write("Writing to a file.");
            writer.write("\nHere is another line.");

            for (String name : names) {
                writer.write(name);
            }

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            System.out.println(reader.readLine());
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}