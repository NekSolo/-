import java.util.Arrays;
import java.util.Scanner;


public class Main {
    static boolean arab;
    static String in;
    static int a, b, c;
    static String[] array;

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        in = scanner.nextLine();

        arab = in.matches("\\d(.*)");
        array = in.split("[\\+\\*-/]");

        if (array.length != 2) {
            throw new Exception(" Не верно!!");
        }

        if (arab) {
            a = Integer.parseInt(array[0]);
            b = Integer.parseInt(array[1]);
            arithmetic();
            System.out.println(c);


        } else {
            a = ArabToRim.rimToArab(array[0]);
            b = ArabToRim.rimToArab(array[1]);
            //System.out.println(a + "  " + b);
            arithmetic();
            System.out.println(ArabToRim.arabToRim(c));

        }


        //System.out.println(array[0]);
    }

    static void arithmetic() throws Exception {


        if (a <= 0 | a > 10 | b == 0 | b > 10) {
            throw new Exception();
        }

        if (0 < in.indexOf(42, 1)) {
            c = a * b;
            //System.out.println("* = " + c);
        }
        if (0 < in.indexOf(43, 1)) {
            c = a + b;
            //System.out.println("+ = " + c);
        }
        if (0 < in.indexOf(45, 1)) {
            c = a - b;
            //System.out.println("- = " + c);
        }
        if (0 < in.indexOf(47, 1)) {
            c = a / b;
            //System.out.println("/ = " + c);
        }
    }


    }
