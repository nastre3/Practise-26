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
         */

        File file = new File("Main/src/Files/Test2.txt");
        boolean isExist = file.exists();
        System.out.println(isExist);

    }
}
