package exeptions;

import java.io.*;

class ConvertEx extends Exception {
    ConvertEx(String message) {
        super(message);
    }
}

public class IOExceptionExample {
    /* Никаких throws и связанных с ним падений */
    public static void main(String[] args) {
       /* можно указывать все что угодно,
          если не получится, программа вежливо расскажет,
          что именно пошло не так
        */
        try {
            copyFileUsingStream("C:\\Users\\Anastasia\\IdeaProjects\\Practise-26\\Main\\src\\exeptions\\utf-8.txt",
                    "utf-8",
                    "C:\\Users\\Anastasia\\IdeaProjects\\Practise-26\\Main\\src\\exeptions\\win1251.txt",
                    "windows-1251");
            System.out.println("Перекодировка прошла удачно!");
        } catch (ConvertEx e) {
            // e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }


    // если исключения не выбрасываются, то возвращает boolean, иначе - void
    private static void copyFileUsingStream(String sourceFilename, String sourceEnc,
                                            String destFilename, String descEnc) throws ConvertEx {

        try (Reader fis = new InputStreamReader(new FileInputStream(sourceFilename), sourceEnc);
             Writer fos = new OutputStreamWriter(new FileOutputStream(destFilename), descEnc)) {
            /* все открылось, можно копировать */

            char[] buffer = new char[1024];
            int length;
            while ((length = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, length);
            }
        } catch (FileNotFoundException ex) {
            throw new ConvertEx("Не удалось открыть файл " + ex.getMessage());
        } catch (UnsupportedEncodingException ex) {
            throw new ConvertEx("Указана неизвестная кодировка " + ex.getMessage());
        } catch (IOException ex) {
            throw new ConvertEx("Возникла ошибка при копировании");
        }
    }
}
