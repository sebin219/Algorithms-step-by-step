package step03_loop.p11021_a_plus_b_7;

import java.util.*;

public class Main_11021 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int i = 0; i < T;i++){
            int A = sc.nextInt();
            int B = sc.nextInt();

            System.out.printf("Case #%d: %d\n", i+1, A+B);
        }
    }
}
