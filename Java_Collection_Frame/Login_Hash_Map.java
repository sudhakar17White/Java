import java.util.HashMap;
import java.util.Scanner;

/**
 * Login_Hash_Map
 */
public class Login_Hash_Map {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        HashMap<String, String> reg = new HashMap<>();

        String text;
        do {
            System.out.println("Menu---(Fun name)\n1.New registoration(regs)\n2.Display the Hash Map(disp)\n3.Login With user&pass(login)\n4.Change password(changepass)");

            text = s.nextLine();

            switch (text) {
                case "regs":
                    System.out.println("Enter the UserName and Password:");
                    reg.put(s.nextLine(), s.nextLine());
                    break;
                case "disp":
                    System.out.println(reg);
                    break;
                case "login":
                    System.out.println("Enter the userName:");
                    String name = s.nextLine();
                    System.out.println("Enter the password:");
                    String pass = s.nextLine();
                    if (reg.containsKey(name) == reg.containsValue(pass)) {
                        System.out.println("Login sucessfully");
                    } else {

                        System.out.println("user or pass worng !");
                    }
                    break;
                case "changepass":
                    System.out.println("Enter the UserName:");
                    String n = s.nextLine();
                    System.out.println("Enter the new pass:");
                    reg.replace(n, s.nextLine());
                    System.out.println("Change Sussesfully..");
                    break;

            }

        } while (!text.equals("exit"));

    }

}