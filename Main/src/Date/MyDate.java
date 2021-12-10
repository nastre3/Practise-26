package Date;

import java.util.Date;

public class MyDate {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date); // текущее время

        Date date2 = new Date(11111111111L); // время в миллисекундах
        System.out.println(date2); // Timestamp - количество миллисекунд, прошедших с 1 января 1970 года, 00:00 по Гринвичу

        long time = System.currentTimeMillis();
        System.out.println(time); // текущее время системы в миллисекундах
    }
}
