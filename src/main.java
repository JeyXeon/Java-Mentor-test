import java.util.Scanner;
public class main {
    public static void main(String[] args) throws CustomExceptions.Calculate_exception {

        System.out.println("Введите 2 целых числа c операцией между ними через пробел: ");
        Scanner scanner = new Scanner(System.in);
        String value1 = scanner.next();
        String operation = scanner.next();
        String value2 = scanner.next();

        if (Exist.exist(value1, Characters.arab) && Exist.exist(value2, Characters.arab)) {
            int new_value1 = Integer.parseInt(value1);
            int new_value2 = Integer.parseInt(value2);
            String final_result = Calculation.calculate(new_value1, new_value2, operation);
            System.out.println("Ответ: " + final_result);
            return;
        }
        if (Exist.exist(value1, Characters.rome) && Exist.exist(value2, Characters.rome)) {
            int new_value1 = Convert.romanToArabic(value1);
            int new_value2 = Convert.romanToArabic(value2);
            String result = Calculation.calculate(new_value1, new_value2, operation);
            String final_result = Convert.arabicToRoman(Integer.parseInt(result));
            System.out.println("Ответ: " + final_result);
            return;
        }
        else {
            throw new CustomExceptions.Calculate_exception("Ошибка: недопустимые значения для операции.");
        }
    }

}



