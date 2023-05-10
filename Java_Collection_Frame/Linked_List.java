import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Linked_List
 */
public class Linked_List {

    public static void main(String[] args) {

        // To creat the link list

        LinkedList<Integer> ls = new LinkedList<Integer>();
        LinkedList<String> name = new LinkedList<>();
        Scanner s = new Scanner(System.in);

        int size = s.nextInt();
        while (size != 0) {
            System.out.println("Enter the name:");
            name.add(s.next());
            System.out.println("Enter the Age:");
            ls.add(s.nextInt());
            size--;
        }

        Iterator ir = ls.iterator();
        System.out.println("eligble for Vote:");
        while (ir.hasNext()) {
            int num = (int) ir.next();
            if (num >= 18) {
                int ind = ls.indexOf(num);
                System.out.println("Name:" + name.get(ind));
                System.out.println(num);
            }

        }

    }
}