import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Выберите задачу (1-20) или 0 для выхода:");
            int task = scanner.nextInt();
            switch (task) {
                case 1: findMax(); break; // Функция для нахождения максимума
                case 2: divideNumbers(); break; // Калькулятор деления
                case 3: convertStringToInt(); break; // Конвертер строк в числа
                case 4: checkAge(); break; // Проверка возраста
                case 5: findSquareRoot(); break; // Нахождение корня
                case 6: calculateFactorial(); break; // Факториал
                case 7: checkArrayForZeros(); break; // Проверка массива на нули
                case 8: powerCalculator(); break; // Калькулятор возведения в степень
                case 9: trimString(); break; // Обрезка строки
                case 10: findElementInArray(); break; // Поиск элемента в массиве
                case 11: convertToBinary(); break; // Конвертация в двоичную систему
                case 12: checkDivisibility(); break; // Проверка делимости
                case 13: getElementAtIndex(); break; // Чтение элемента списка
                case 14: checkPasswordStrength(); break; // Парольная проверка
                case 15: checkDateFormat(); break; // Проверка даты
                case 16: concatenateStrings(); break; // Конкатенация строк
                case 17: remainder(); break; // Остаток от деления
                case 18: squareRoot(); break; // Квадратный корень
                case 19: celsiusToFahrenheit(); break; // Конвертер температуры
                case 20: checkStringEmpty(); break; // Проверка строки на пустоту
                case 0: return; // Выход из программы
                default: System.out.println("Некорректный выбор. Пожалуйста, выберите снова."); // Некорректный ввод
            }
        }
    }

    // 1. Функция для нахождения максимума
    static void findMax() {
        System.out.print("Введите два целых числа: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a == b) {
            throw new IllegalArgumentException("Числа равны!");
        }
        System.out.println("Максимальное число: " + Math.max(a, b));
    }

    // 2. Калькулятор деления
    static void divideNumbers() {
        System.out.print("Введите два числа (делимое и делитель): ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (b == 0) {
            throw new ArithmeticException("Недопустимо деление на ноль!");
        }
        System.out.println("Результат деления: " + (double) a / b);
    }

    // 3. Конвертер строк в числа
    static void convertStringToInt() {
        System.out.print("Введите строку для конвертации в число: ");
        String input = scanner.next();
        try {
            int number = Integer.parseInt(input);
            System.out.println("Конвертированное число: " + number);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Невозможно конвертировать строку в число!");
        }
    }

    // 4. Проверка возраста
    static void checkAge() {
        System.out.print("Введите возраст: ");
        int age = scanner.nextInt();
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("Возраст должен быть от 0 до 150!");
        }
        System.out.println("Возраст валиден.");
    }

    // 5. Нахождение корня
    static void findSquareRoot() {
        System.out.print("Введите число: ");
        double number = scanner.nextDouble();
        if (number < 0) {
            throw new IllegalArgumentException("Невозможно вычислить корень из отрицательного числа!");
        }
        System.out.println("Квадратный корень: " + Math.sqrt(number));
    }

    // 6. Факториал
    static void calculateFactorial() {
        System.out.print("Введите целое число: ");
        int n = scanner.nextInt();
        if (n < 0) {
            throw new IllegalArgumentException("Невозможно вычислить факториал отрицательного числа!");
        }
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Факториал " + n + ": " + fact);
    }

    // 7. Проверка массива на нули
    static void checkArrayForZeros() {
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        for (int num : array) {
            if (num == 0) {
                throw new IllegalArgumentException("Массив содержит нули!");
            }
        }
        System.out.println("Массив не содержит нулей.");
    }

    // 8. Калькулятор возведения в степень
    static void powerCalculator() {
        System.out.print("Введите основание и степень: ");
        double base = scanner.nextDouble();
        int exponent = scanner.nextInt();
        if (exponent < 0) {
            throw new IllegalArgumentException("Степень не может быть отрицательной!");
        }
        System.out.println("Результат: " + Math.pow(base, exponent));
    }

    // 9. Обрезка строки
    static void trimString() {
        System.out.print("Введите строку: ");
        String str = scanner.next();
        System.out.print("Введите количество символов для обрезки: ");
        int length = scanner.nextInt();
        if (length > str.length()) {
            throw new IllegalArgumentException("Длина обрезки превышает длину строки!");
        }
        System.out.println("Обрезанная строка: " + str.substring(0, length));
    }

    // 10. Поиск элемента в массиве
    static void findElementInArray() {
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print("Введите элемент для поиска: ");
        int element = scanner.nextInt();
        boolean found = false;
        for (int num : array) {
            if (num == element) {
                found = true;
                break;
            }
        }
        if (!found) {
            throw new IllegalArgumentException("Элемент не найден!");
        }
        System.out.println("Элемент найден.");
    }

    // 11. Конвертация в двоичную систему
    static void convertToBinary() {
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();
        if (number < 0) {
            throw new IllegalArgumentException("Невозможно конвертировать отрицательное число!");
        }
        System.out.println("Двоичное представление: " + Integer.toBinaryString(number));
    }

    // 12. Проверка делимости
    static void checkDivisibility() {
        System.out.print("Введите два числа: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (b == 0) {
            throw new ArithmeticException("Недопустимо деление на ноль!");
        }
        System.out.println(a + " делится на " + b + ": " + (a % b == 0));
    }

    // 13. Чтение элемента списка
    static void getElementAtIndex() {
        List<Integer> list = new ArrayList<>();
        System.out.print("Введите размер списка: ");
        int size = scanner.nextInt();
        System.out.println("Введите элементы списка:");
        for (int i = 0; i < size; i++) {
            list.add(scanner.nextInt());
        }
        System.out.print("Введите индекс элемента: ");
        int index = scanner.nextInt();
        if (index < 0 || index >= list.size()) {
            throw new IndexOutOfBoundsException("Индекс выходит за пределы списка!");
        }
        System.out.println("Элемент по индексу " + index + ": " + list.get(index));
    }

    // 14. Парольная проверка
    static void checkPasswordStrength() {
        System.out.print("Введите пароль: ");
        String password = scanner.next();
        if (password.length() < 8) {
            throw new WeakPasswordException("Пароль должен содержать не менее 8 символов!");
        }
        System.out.println("Пароль достаточной сложности.");
    }

    // 15. Проверка даты
    static void checkDateFormat() {
        System.out.print("Введите дату в формате dd.MM.yyyy: ");
        String date = scanner.next();
        try {
            new SimpleDateFormat("dd.MM.yyyy").parse(date);
            System.out.println("Дата корректная.");
        } catch (ParseException e) {
            throw new IllegalArgumentException("Некорректная дата!");
        }
    }

    // 16. Конкатенация строк
    static void concatenateStrings() {
        System.out.print("Введите первую строку: ");
        String str1 = scanner.next();
        System.out.print("Введите вторую строку: ");
        String str2 = scanner.next();
        if (str1 == null || str2 == null) {
            throw new NullPointerException("Одна из строк равна null!");
        }
        System.out.println("Объединенная строка: " + str1 + str2);
    }

    // 17. Остаток от деления
    static void remainder() {
        System.out.print("Введите два числа: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (b == 0) {
            throw new ArithmeticException("Недопустимо деление на ноль!");
        }
        System.out.println("Остаток от деления: " + (a % b));
    }

    // 18. Квадратный корень
    static void squareRoot() {
        System.out.print("Введите число: ");
        double number = scanner.nextDouble();
        if (number < 0) {
            throw new IllegalArgumentException("Невозможно вычислить квадратный корень отрицательного числа!");
        }
        System.out.println("Квадратный корень: " + Math.sqrt(number));
    }

    // 19. Конвертер температуры
    static void celsiusToFahrenheit() {
        System.out.print("Введите температуру в Цельсии: ");
        double celsius = scanner.nextDouble();
        if (celsius < -273.15) {
            throw new IllegalArgumentException("Температура не может быть ниже абсолютного нуля!");
        }
        double fahrenheit = celsius * 9/5 + 32;
        System.out.println("Температура в Фаренгейтах: " + fahrenheit);
    }

    // 20. Проверка строки на пустоту
    static void checkStringEmpty() {
        System.out.print("Введите строку: ");
        String str = scanner.next();
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Строка пустая или равна null!");
        }
        System.out.println("Строка не пустая.");
    }

    // Кастомное исключение для слабого пароля
    public static class WeakPasswordException extends RuntimeException {
        public WeakPasswordException(String message) {
            super(message);
        }
    }
}
