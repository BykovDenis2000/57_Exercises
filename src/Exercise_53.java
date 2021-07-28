import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise_53 {
    public static void main(String[] args) throws IOException {
        mainMenu();
    }

    public static void mainMenu() throws IOException {
        int sw = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Введите:\n1 - добавить запись\n2 - удалить запись\n3 - вывести записи\n4 - выход");
            sw = sc.nextInt();
            switch (sw){
                case 1:
                    addNote();
                    break;
                case 2:
                    deleteNote();
                    break;
                case 3:
                    printToDoList();
                    break;
                case 4:
                    break;
            }
        } while (sw != 4);
    }

    public static void addNote() throws IOException {
        String filename = "todo.txt";
        File file = new File(filename);
        if (!file.exists()){
            file.createNewFile();
        }
        FileWriter writer = new FileWriter(file,true);
        System.out.println("Введите запись:");
        Scanner noteScanner = new Scanner(System.in);
        String note = noteScanner.nextLine();

        int lineCount = lineCounter(filename);

        if (lineCount != 0){
            writer.append("\n").write(note);
        } else {
            writer.write(note);
        }
        writer.close();

    }
    public static int lineCounter(String filename) throws IOException {
        FileReader fileReader = new FileReader(filename);
        LineNumberReader lineNumberReader = new LineNumberReader(fileReader);
        int lineNumber = 0;
        while (lineNumberReader.readLine() != null) {
            lineNumber++;
        }
        fileReader.close();
        lineNumberReader.close();
        return lineNumber;
    }

    public static void printToDoList() throws IOException {

        ArrayList<String> list = txtToArrayList("todo.txt");
        System.out.println("=========TODO LIST=========");
        for(int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ". " + list.get(i));
        }
        System.out.println("============================");
    }
    public static void deleteNote() throws IOException {
        ArrayList<String> list = txtToArrayList("todo.txt");
        System.out.println("Введите номер записи для удаления:");
        Scanner sc = new Scanner(System.in);
        int deleteNum = sc.nextInt();
        list.remove(deleteNum - 1);

        FileWriter fileWriter = new FileWriter("todo.txt", false);
        for (int i = 0; i < list.size(); i++){
            if(i != 0) {
                fileWriter.append("\n").write(list.get(i));
            } else {
                fileWriter.write(list.get(i));
            }
        }
        fileWriter.close();
    }
    public static ArrayList<String> txtToArrayList(String filename) throws IOException {
        FileReader fileReader = new FileReader(filename);
        ArrayList<String> list = new ArrayList<>();
        Scanner fileScan = new Scanner(fileReader);
        while (fileScan.hasNextLine()) {
            list.add(fileScan.nextLine());
        }
        fileReader.close();
        return list;
    }
}
