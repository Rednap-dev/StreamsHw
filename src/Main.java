import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\romeo-and-juliet.txt");    //"D:\\romeo-and-juliet.txt"
        FileReader fileReader = new FileReader(file);
        String wordWithMaxLength = "";
        String[] words = fileReader.toString().split("(_|\\s)+");
        while (fileReader.read() != -1) {
            Arrays.sort(words, Comparator.comparing(String::length, Comparator.reverseOrder()));
            wordWithMaxLength = words[0].length() > wordWithMaxLength.length() ? words[0] : wordWithMaxLength;
        }
        fileReader.close();
        System.out.println(wordWithMaxLength + '\n' + wordWithMaxLength.length() + " chars");
    }
}
