package exeptionsTasks;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Anastasia\\IdeaProjects\\Practise-26\\Main\\src\\exeptionsTasks\\test1.txt");
        file.createNewFile();
        try (FileReader fr1 = new FileReader("C:\\Users\\Anastasia\\IdeaProjects\\Practise-26\\Main\\src\\exeptionsTasks\\test1.txt")) {
            try (FileReader fr2 = new FileReader("test2.txt")) {
            } catch (IOException e) {
                System.out.print("test2");
            }
            System.out.print("+");
        } catch (FileNotFoundException e) {
            System.out.print("test1");
        }
        file.delete();
    }

    /*
    public static void method1() {
        try {
            System.out.print("Try ");
            throw new Exception();
        } catch (Exception e) {
            System.out.print("Catch ");
            return;
        } finally {
            System.out.print("Finally ");
        }
    }
     */
}