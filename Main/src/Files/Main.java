package Files;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
        File file = new File("C:\\Users\\Anastasia\\IdeaProjects\\Practise-26\\Main\\src\\Files\\Test2.txt");
        boolean isCreated = file.createNewFile();
        boolean isExists = file.exists();
        System.out.println(isExists);
        System.out.println(isCreated);


        File file = new File("Main/src/Files/Test2.txt");
        boolean isExist = file.exists();
        System.out.println(isExist);
*/
        // проверка, что директория есть
        File file = new File("Main/src/Files");
        boolean isDir = file.isDirectory();
        System.out.println(isDir);

        // создание директории
        File file2 = new File("Main/src/Files/Test3");
        boolean isMake = file2.mkdir();
        System.out.println(isMake);

        // удаление директории (только пустой)
        boolean isDelete = file2.delete();
        System.out.println(isDelete);

        // удаление непустой директории невозможно
        File file3 = new File("Main/src/TestDir");
        boolean isDelete2 = file3.delete();
        System.out.println(isDelete2);

        // получение названий файлов в директории
        String[] files = file3.list();
        for (String fileName: files) {
            System.out.println(fileName);
        }

        // Размер файлов в байтах
        long length = 0L;
        for (String fileName: files) {
            System.out.println(fileName.length());
            length += fileName.length();
        }

        // Размер каталога в мегабайтах
        System.out.println(length / 1024 / 1024 + " MB");
    }
}
