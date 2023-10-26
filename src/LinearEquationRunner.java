import java.util.Scanner;
public class LinearEquationRunner {

    public static void start() {

        String str = "---------- Linear Equation Machine ----------\n\n";
        str += "Press [Enter] to start";
        System.out.println(str);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        start();
        String start = scanner.nextLine();
        System.out.println(start);

        int x1;
        int y1;
        int x2;
        int y2;


        System.out.println("Enter Point 1 in (x, y) format: ");
        String point1 = scanner.nextLine();

        //isolates the integer for the x coordinate by removing other parts of the string with substring() method
        String tempx1 = point1.substring(1);
        tempx1 = tempx1.substring(0,tempx1.indexOf(','));
        x1 = Integer.parseInt(tempx1);

        //isolates the integer for the y coordinate by removing other parts of the string with substring() method
        String tempy1 = point1.substring(point1.indexOf(',')+2);
        tempy1 = tempy1.substring(0,tempy1.indexOf(')'));
        y1 = Integer.parseInt(tempy1);

        System.out.println("Enter Point 2 in (x, y) format: ");
        String point2 = scanner.nextLine();

        //isolates the integer for the x coordinate by removing other parts of the string with substring() method
        String tempx2 = point2.substring(1);
        tempx2 = tempx2.substring(0,tempx2.indexOf(','));
        x2 = Integer.parseInt(tempx2);

        //isolates the integer for the y coordinate by removing other parts of the string with substring() method
        String tempy2 = point2.substring(point2.indexOf(',')+2);
        tempy2 = tempy2.substring(0,tempy2.indexOf(')'));
        y2 = Integer.parseInt(tempy2);

        if (x1 == x2) {
            System.out.println("You have entered points for a vertical line at x = " + x1);
        } else {

            LinearEquation equation = new LinearEquation(x1, y1, x2, y2);
            System.out.println(equation.lineInfo());

            System.out.println();

            System.out.println("Enter an x value: ");
            double xValue = scanner.nextDouble();
            System.out.println(equation.coordinateForX(xValue));
        }
    }
}
