import java.util.Scanner;

/**
 * Nmeeting
 */
public class Nmeeting {
    public static int[] depulicate(int start[]) {
        int len = start.length;

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (start[i] == start[j]) {
                    start[j] = 0;
                    break;
                }
            }
        }
        return start;

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int start[] = new int[size];
        int end[] = new int[size];
        for (int i = 0; i < size; i++) {
            start[i] = s.nextInt();
            end[i] = s.nextInt();
        }
        int ar1[] = depulicate(start);
        int ar2[] = depulicate(end);
        int co = 0;

        for (int i = 0; i < size; i++) {

            if (ar1[i] == 0 || ar2[i] == 0) {
                co++;
            }

        }
        System.out.println(size - co);
    }
}