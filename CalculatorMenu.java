import java.util.Scanner;

public class CalculatorMenu{
    private static void printMenu(){
        System.out.println("Trig Calculator - Only Takes in Degrees");
        System.out.println("Available trigonometric functions: sin, cos, tan, sec, csc, cot");
        System.out.println("Type a three letter function abreviation or q to quit");
    }

    private static double degreeInput(Scanner sc){
        while (true){
            System.out.println("Enter Angle in degrees: ");
            String input = sc.nextLine().trim();

            try {
                return Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a degree number only");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) { 
            printMenu();
            System.out.print("Function: ");
            String func = sc.nextLine().trim().toLowerCase();
            if (func.equals("q")){
                System.out.println("Quit Command Entered, Goodbye");
                break;
            }
            if(!(func.equals("sin")||func.equals("cos")||func.equals("tan")||func.equals("csc")||func.equals("sec")||func.equals("cot"))){
                System.out.println("Please enter the proper function name(see menu)");
                continue;
            }
            double degrees = degreeInput(sc);
            double result = TrigCalc.funcSolve(func, degrees);

            if (Double.isNaN(result)) {
                System.out.println("Result is undefined for that angle.");
            } else {
                System.out.printf("%s(%.2f°) = %.10f%n", func, degrees, result);
            }
        }
        sc.close();
    }
}