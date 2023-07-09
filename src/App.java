import java.util.Scanner;

public class App {

    static int sum(int a, int b)
    {
        int result = a + b;
        System.out.println("Result of addition: " + result);
        return a + b;
    }

    static int subtract(int a, int b)
    {
        int result = a - b;
        System.out.println("Result of subtraction: " + result);
        return result;
    }

    static int multiply(int a, int b)
    {
        int result = a * b;
        System.out.println("Result of multiplication: " + result);
        return result;
    }
    static int divide(int a, int b)
    {
        if(b == 0)
        {
            System.out.println("Second number must be different then 0.");
            return -1;
        }
            int result = a / b;
        System.out.println("Result of division: " + result);
        return result;
    }

    static int exponent(int a, int b)
    {
        int result = 1;
        for(int i = 1; i <= b; i++)
        {
            result *= a;
        }
        
        return result;
    }

    static String rectangleAreaCirc(int a, int b)
    {
        System.out.println("Circumference = " + (2 * (a + b)));
        System.out.println("Area = " + a * b);
        return "Circumference = " + (2 * (a + b)) + "Area =  " + (a * b);
    }

    static int mod(int a, int b)
    {
        int result = a % b;
        System.out.println("Result of modulo calculation = " + result);
        return result;
    }


    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu = "1-) Addition\n"
        +"2-) Subtraction\n"
        +"3-) Multiplication\n"
        +"4-) Division\n"
        +"5-) Exponent Calculation\n"
        +"6-) Modulo Calculation\n"
        +"7-) Rectangle circumference and area calculation\n"
        +"0-)Exit";
        int result = 0;
        while(true) {
            System.out.println(menu);
            System.out.print("Select transaction: ");
            select = scan.nextInt();
            if(select == 0)
            {
                break;
            }
            System.out.print("Enter first number: ");
            int a = scan.nextInt();
            System.out.print("Enter second number: ");
            int b = scan.nextInt();
            switch(select)
            {
                case 1:
                    sum(a, b);
                    break;
                case 2:
                    subtract(a, b);
                    break;
                case 3:
                    multiply(a, b);
                    break;
                case 4:
                    divide(a, b);
                    break;
                case 5:
                    System.out.println("Exponent calculation result = " + exponent(a, b));
                    break;
                case 6:
                    mod(a, b);
                    break;
                case 7:
                    rectangleAreaCirc(a, b);
                    break;
                default:
                    System.out.println("Invalid transaction selection. Please re-enter");
            }
        } 
        System.out.println("Bye bye!");
    }
}
