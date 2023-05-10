import java.util.Scanner;
import Array_List;
import Linked_List;
import Login_Hash_Map;

/**
 * Collection_frame
 */
public class Collection_frame {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String op = s.nextLine();

        if (op.equals("arraylist")) {
            Array_List as = new Array_List();
            as.main(args);
        } else if (op.equals("linklist")) {
            Linked_List ls = new Linked_List();
            ls.main(args);
        } else if (op.equals("hashmap")) {
            Login_Hash_Map lmp = new Login_Hash_Map();
            lmp.main(args);
        }

    }
}