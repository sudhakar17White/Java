import java.util.*;

class Array_pair_Divisibiltiy {

    static int com(int a, int b, int k) {
        int tot = (a + b) / k;
        // System.out.println("a: " + a + "b: " + b + " " + tot);
        if (k == tot) {
            return 0;
        }
        return tot;
    }

    public static void main(String args[]) {
        System.out.println("Enter the Size :");
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int half = size / 2;
        // System.out.println(half);
        int ar[] = new int[size];
        System.out.println("Enter the Array Values:");
        for (int i = 0; i < size; i++) {
            ar[i] = s.nextInt();
        }
        System.out.println("Enter the K Value:");
        int k = s.nextInt();

        if (size % 2 == 0) {
            int ch = 0;
            int st = 0;
            int inx = 0;
            int en = size - 1;
            int an[] = new int[half];
            for (int i = 0; i < half; i++) {
                int ans = com(ar[st], ar[en], k);
                an[inx] = ans;
                st++;
                en--;
                inx++;

            }

            for (int i = 0; i < inx; i++) {
                if (an[0] == an[i]) {
                    // System.out.print(an[0] + " " + an[i]);
                    ch = ch + 1;
                }
            }
            // System.out.println(ch);
            if (ch == half) {

                System.out.println("True");
            } else {
                System.out.println("False");

            }
        } else {
            System.out.println("False");

        }

    }
}