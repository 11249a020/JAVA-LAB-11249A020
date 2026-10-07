import java.io.*;

class FileOperations {
    public static void main(String[] args) throws IOException {

        // Open/Create the file
        FileWriter fw = new FileWriter("sample.txt");

        // Write data into the file
        fw.write("Hello, this is a Java file.");
        fw.write("\nThis is file operation program.");

        // Close the file
        fw.close();

        // Open the file for reading
        FileReader fr = new FileReader("sample.txt");

        // Read the file
        int ch;
        System.out.println("File Contents:");

        while ((ch = fr.read()) != -1) {
            System.out.print((char) ch);
        }

        // Close the file
        fr.close();
    }
}