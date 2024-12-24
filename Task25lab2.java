public class Task25lab2 {
    public static void main(String[] args) {
        // Задання параметрів
        double a = 2.98;
        double b = 5.55;
        double c = 0.045;
        double d = 0.129;

        // Обчислення a^b / cosh(|b|)
        double coshValue = Math.cosh(Math.abs(b));
        double firstPart = Math.pow(a, b) / coshValue;

        // Обчислення 4 * (lg(c) / root(d, 5))
        double logValue = Math.log10(c);
        double rootValue = Math.pow(d, 1.0 / 5.0);
        double secondPart = 4 * (logValue / rootValue);

        // Підсумкове обчислення
        double y = firstPart + secondPart;

        // Виведення результату
        System.out.println("Результат обчислення y для завдання 25: " + y);
    }
}