package Task3;

public class ArithmeticTest {
    public static void main(String[] args) {

      if (args.length != 3) {
            System.out.println("Usage: java ArithmeticTest <integer1> <operator> <integer2>");
            return;
        }

        int num1;
        try{
            num1=Integer.parseInt(args[0]);
        }catch(NumberFormatException e){
            System.out.println("wrong input: "+ args[0]);
            return;
        }

        int num2;
        try{
            num2=Integer.parseInt(args[2]);
        }catch(NumberFormatException e){
            System.out.println("wrong input: "+ args[2]);
            return;
        }

        String operator=args[1];
        if (!(operator.equals("+") || operator.equals("-") ||
              operator.equals("*") || operator.equals("/"))) {
            System.out.println("Wrong Operator: " + operator);
            return;
        }

        double result;

        switch(operator){
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 == 0) {
                    System.out.println("Error: Division by zero");
                    return;
                }
                result = (double) num1 / num2;
                break;
            default:
                return;
        }

         System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
    }
}
