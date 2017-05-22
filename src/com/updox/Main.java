package updox;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to the prime ranger");
        int[] entries = new int[2];

        for (int i = 0; i < 2; i++) {
            try {
                System.out.println("Please enter an integer then press enter: ");
                entries[i] = Integer.parseInt(keyboard.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Argument must be an integer.");
                System.exit(1);
            }
        }

        PrimeNumberGenerator pNG = new PNGImplementation();
        pNG.setHighLow(entries[0], entries[1]);

        System.out.println("Primes between the range of " + pNG.getLowVal() + " and " + pNG.getHighVal() + " are:");

        List<Integer> primes = pNG.generate(pNG.getLowVal(), pNG.getHighVal());

        StringBuilder sb = new StringBuilder();
        for(int prime: primes){
            sb.append(prime + ", ");
        }

        int i = 0;
        while (i + 100 < sb.length() && (i = sb.lastIndexOf(" ", i + 100)) != -1) {
            sb.replace(i, i + 1, "\n");
        }

        System.out.println(sb.toString());
    }
}
