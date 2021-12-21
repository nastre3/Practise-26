package exeptions;

public class UnCheckedEx {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 0;

        try {
            if (n2 == 0) { // порождаем собственное исключение
                throw new DivisionByZeroEx("На ноль не делят (до высшей математики)");
            }
            System.out.println(n1/n2);
        } catch (DivisionByZeroEx e) {
            System.err.println("Ошибочка вышла");
        } finally {
            System.out.println("Конец, glhf");
        }

    }
}
