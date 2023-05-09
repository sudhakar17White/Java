import java.util.Scanner;

class product_array {

    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the size:");
        int size = s.nextInt();

        int ar[] = new int[size];

        for (int i = 0; i < size; i++) {
            ar[i] = s.nextInt();

        }
        int val = 1;
        System.out.println("OUTPUT :");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i != j) {
                    val = val * ar[j];
                    System.out.print(ar[j] + "*");
                }

            }
            System.out.print("=" + val + "\n");
            val = 1;

        }

    }

}