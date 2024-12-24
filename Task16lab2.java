public class Task16lab2 {
    public static void main(String[] args) {
        // Задання параметрів
        double a = 0.58;
        double b = 0.34;
        double c = 1.25;
        double d = -1.89;

        // Обчислення 2 * (sin(a) / arccos(-2b))
        double sinValue = Math.sin(a);
        double arccosValue = Math.acos(-2 * b);
        double firstPart = 2 * (sinValue / arccosValue);

        // Обчислення sqrt(ln(c * |2d|))
        double logValue = Math.log(c * Math.abs(2 * d));
        double secondPart = Math.sqrt(logValue);

        // Підсумкове обчислення
        double y = firstPart - secondPart;

        // Виведення результату
        System.out.println("Результат обчислення y для завдання 16: " + y);
    }
}
