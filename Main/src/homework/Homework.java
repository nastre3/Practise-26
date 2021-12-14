package homework;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import static java.lang.Math.rint;

public class Homework {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Test");
        boolean isDirCreated = file.mkdir();
        System.out.println(isDirCreated); //true - директория создана

        File file2 = new File("C:\\Test\\Test1.txt");
        boolean isFileCreated = file2.createNewFile();
        System.out.println(isFileCreated); //true - файл создан

        long timeFileLastModification = file2.lastModified();
        System.out.println(timeFileLastModification); // возвращает в миллисекундах дату последнего изменения файла
        Date date = new Date(file2.lastModified()); // дата последнего изменения файла
        System.out.println(date);

        long timeCurrent = System.currentTimeMillis();
        System.out.println(timeCurrent); // текущее время системы в миллисекундах
        long dif = timeCurrent-timeFileLastModification;
        System.out.println(rint(dif/60000)); // переводит миллисекунды в минуты

    }
}
