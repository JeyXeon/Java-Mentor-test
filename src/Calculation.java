public class Calculation {
    public static String calculate(int value1, int value2, String operation) throws CustomExceptions.Calculate_exception {

        if (operation.equals("+")) {
            return Integer.toString(value1 + value2);
        }
        if (operation.equals("-")) {
            return Integer.toString(value1 - value2);
        }
        if (operation.equals("*")) {
            return Integer.toString(value1 * value2);
        }
        if (operation.equals("/")) {
            return Integer.toString(value1 / value2);
        } else {
            throw new CustomExceptions.Calculate_exception("Ошибка: непредусмотреная операция");
        }
    }

}
