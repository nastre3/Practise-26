import static java.lang.Math.pow;

public class Mathematics {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        //возведение в степень (первый параметр число, второй параметр степень)
        double result = pow(a, b);
        System.out.println(result);//25.0

        System.out.println(Math.E);//2.718281828459045
        System.out.println(Math.PI);//3.141592653589793

        // команды
        int a2 = -5;
        System.out.println(Math.abs(a2));// Возвращает абсолютное значение

        int a3 = 4;
        System.out.println(Math.sqrt(a3));// Возвращает квадратный корень из числа.

        int a4 = 4;
        int b2 = 1;
        System.out.println(Math.max(a4, b2));// Возвращает наибольшее из двух чисел.
        System.out.println(Math.min(a4, b2));// Возвращает наименьшее из двух чисел.

        System.out.println(Math.pow(a, b));// Возводит число в степень.

        double random = Math.random(); // Возвращает число от 0.0 до 1.0.
        System.out.println(a + b * random);//Каждый раз разное

        // Округляет число в зависимости от целой части, если менее 0,5 (включительно),
        // то в меньшую сторону, если больше, то в большую.
        double a5 = 2.5;
        double b3 = 2.5000001;
        System.out.println(Math.rint(a5));//2.0
        System.out.println(Math.rint(b3));//3.0

        // То же, что и rint(), но этот метод округляет в большую сторону от 0,5 (включительно).
        double a6 = 2.4999;
        double b4 = 2.5;
        System.out.println(Math.round(a6));//2.0
        System.out.println(Math.round(b4));//3.0
    }
}
