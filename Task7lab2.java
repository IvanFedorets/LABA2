public class Task7lab2 {
    public static void main(String[] args) {
        // Задання параметрів
        double a = -3.45;
        double b = 2.34;
        double c = 1.45;
        double d = 0.83;

        // Обчислення |a/b|
        double absFraction = Math.abs(a / b);

        // Обчислення sqrt(|a/b|)
        double sqrtValue = Math.sqrt(absFraction);

        // Обчислення 4 * cosh(sqrt(|a/b|))
        double coshValue = 4 * Math.cosh(sqrtValue);

        // Обчислення 3 * arccos(d)
        double arccosValue = 3 * Math.acos(d);

        // Сума cosh і arccos
        double sumValue = coshValue + arccosValue;

        // Піднесення до степеня c
        double y = Math.pow(sumValue, c);

        // Виведення результату
        System.out.println("Результат обчислення y для завдання 7: " + y);
    }
}

