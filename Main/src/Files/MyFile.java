package Files;

import java.io.File;

public class MyFile {
    public static void main(String[] args) {
        // Cпособы создания
        File file = new File("C:\\Test", "Test.txt"); // первым параметром путь к директории и вторым параметром имя файла в этой директории
        File file2 = new File("C:\\Test\\Test2.txt"); // весь путь к файлу

        File directory = new File("C:\\Test"); // хранит в себе директорию
        File file3 = new File(directory, "Test.txt"); // объект передать в конструктор первым параметром, а вторым — имя файла, который хранится в этой директории.

        File file4 = new File("C:\\Test", "Test.txt");

        // Команды
        System.out.println(file4.getAbsolutePath()); // получаем абсолютный путь файла, начиная с корня системы.
        System.out.println(file.canRead()); // доступен ли файл для чтения/записи.
        System.out.println(file.exists()); // проверяет, существует ли файл на диске.
        System.out.println(file.getName()); // возвращает имя файла/каталога.
        System.out.println(file.getParent()); // возвращает имя каталога, в котором находится.
        System.out.println(file.getPath()); // возвращает путь к файлу/каталогу.
        System.out.println(file.lastModified()); // возвращает дату последнего изменения файла в миллисекундах, поэтому используем либо класс Date, либо Calendar.
        System.out.println(file.isFile()); // проверяет, является ли объект файлом.
        System.out.println(file.isDirectory()); // проверяет, является ли объект каталогом.

        File file5 = new File("C:\\Test\\1");
        boolean isCreated = file5.mkdir(); // Создаст новую директорию по тому адресу, который мы укажем в конструкторе. Метод возвращает boolean по результату.
        boolean isDeleted = file.delete(); // Удаляет файл. Также можно удалить пустой каталог, если каталог не пустой, нужно сначала удалить все файлы.

        long length = file.length();
        System.out.println(length); // Получаем размер файла в байтах.

        /*
        File file6 = new File("C:\\Test\\Test1.txt");
        boolean isCreated2 = file6.createNewFile(); // Создает новый файл
        System.out.println(isCreated2); //true
         */

        String[] files = file.list(); // Получаем массив с именами файлов.
    }
}
