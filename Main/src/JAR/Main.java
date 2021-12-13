package JAR;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("Main/src/TestDir");
        String[] files = file.list();
        System.out.println(files.length); // выводит кол-во файлов в папке
    }
}
