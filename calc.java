public class Calc {

    public static void main(String[] args) {
        ParsedArgs parsed = parseArguments(args);
        int result = calculate(parsed.operation, parsed.num1, parsed.num2);
        showResult(parsed.operation, result);
    }

    static class ParsedArgs {
        String operation;
        int num1;
        int num2;
        ParsedArgs(String operation, int num1, int num2) {
            this.operation = operation;
            this.num1 = num1;
            this.num2 = num2;
        }
    }

    public static ParsedArgs parseArguments(String[] args) {
        if (args.length != 3) {
            throw new IllegalArgumentException("Número incorrecto de argumentos");
        }
        String operation = args[0];
        int num1 = Integer.parseInt(args[1]);
        int num2 = Integer.parseInt(args[2]);
        return new ParsedArgs(operation, num1, num2);
    }

    public static int calculate(String operation, int num1, int num2) {
        switch (operation) {
            case "multiplica":
                return multiplica(num1, num2);
            case "modulo":
                return modulo(num1, num2);
            default:
                throw new IllegalArgumentException("Operación no soportada");
        }
    }

    public static int multiplica(int num1, int num2) {
        return num1 * num2;
    }

    public static void showResult(String operation, int result) {
        System.out.println("El resultado de la operación \"" + operation + "\" es: " + result);
    }
    public static int modulo(int num1, int num2) {
        return num1 % num2;
    }
}