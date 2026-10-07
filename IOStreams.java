import java.io.*;

class IOStreams {
    public static void main(String[] args) throws IOException {

        // File Output Stream - writing data
        FileOutputStream fos = new FileOutputStream("sample.txt");

        String data = "Hello, Java IO Streams!";
        byte[] bytes = data.getBytes();

        fos.write(bytes);
        fos.close();

        System.out.println("Data written successfully.");

        // File Input Stream - reading data
        FileInputStream fis = new FileInputStream("sample.txt");

        int ch;

        System.out.println("Data read from file:");

        while ((ch = fis.read()) != -1) {
            System.out.print((char) ch);
        }

        fis.close();
    }
}
