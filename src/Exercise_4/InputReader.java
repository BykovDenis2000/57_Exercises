package Exercise_4;

import java.io.InputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Scanner;

public class InputReader implements AutoCloseable {
    private Scanner sc;
    public InputReader() {
        this(System.in);
    }

    InputReader(InputStream inputStream) {
        sc = new Scanner(inputStream);
    }

    InputReader(Readable readable) {
        sc = new Scanner(readable);
    }

    public String readString(String prompt){
        System.out.println(prompt);
        return sc.nextLine();
    }

    @Override
    public void close() throws Exception {
        sc.close();
    }

    public static void main(String[] args) {
        StringWriter stringWriter = new StringWriter();
        stringWriter.write("test");

        new InputReader(new StringReader("text")).readString("Testing");
    }
}
