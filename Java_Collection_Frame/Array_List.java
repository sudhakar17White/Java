import java.util.ArrayList;
import java.util.Scanner;

public class Array_List {

    public static void main(String[] args) {

        ArrayList ar = new ArrayList();
        Scanner s = new Scanner(System.in);
        String input, value;
        do {
            System.out.println(
                    "1.Add Element to the List(add)\n2.Del Element in The list(del)\n3.display the List(disp)\n4.Index Value(index)\n5.Elemet contains or Not(serach)");
            System.out.println("Enter Option:");
            input = s.nextLine();
            switch (input) {
                case "add":
                    value = s.nextLine();
                    ar.add(value);
                    break;

                case "del":
                    value = s.nextLine();
                    ar.remove(value);

                    break;
                case "disp":
                    System.out.println(ar);
                    break;
                case "index":
                    System.out.println("Enter the Index:");
                    value = s.nextLine();
                    System.out.println(ar.indexOf(value));
                    break;
                case "serach":
                    System.out.println("Enter the Serach Element:");
                    value = s.nextLine();
                    System.out.println(ar.contains(value));
                    break;

            }

        } while (!input.equals("exit"));

    }
}