import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.print("Необходимо ввести путь к файлу: ");
        String path = in.nextLine();

        String str;
        String readTxt = "";

        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        if ((str = bufferedReader.readLine()) != null) {
            readTxt = readTxt + str;
        }

        String simvols = "Всего символов в тексте: " + readTxt.length();
        String probel = "Всего символов в тексте без пробелов: " + readTxt.replaceAll(" ", "").length();
        String slova = "Всего слов в тексте: " + readTxt.split(" ").length;

        System.out.println(simvols);
        System.out.println(probel);
        System.out.println(slova);

        FileWriter fileWriter = new FileWriter("output.txt");
        fileWriter.write(simvols);
        fileWriter.write("\n" + probel);
        fileWriter.write("\n" + slova);
        fileWriter.flush();
    }
}