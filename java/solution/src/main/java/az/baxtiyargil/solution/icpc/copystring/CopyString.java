package az.baxtiyargil.solution.icpc.copystring;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CopyString {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int testCases = scanner.nextInt();
        for (int t = 0; t < testCases; t++) {
            scanner.nextInt();
            int op = scanner.nextInt();
            scanner.nextLine();
            String rawString = scanner.nextLine();
            String idealString = scanner.nextLine();
            constructAndPrint(rawString, idealString, op);
        }
    }

    private static void constructAndPrint(String rawString, String idealString, int maxOp) {
        if (rawString.equals(idealString)) {
            System.out.println("0");
            return;
        }

        if (rawString.charAt(0) != idealString.charAt(0)) {
            System.out.println("-1");
            return;
        }

        List<String> results = new LinkedList<>();
        StringBuilder rawSb = new StringBuilder(rawString);
        int i = 0;
        for (; i < maxOp; i++) {
            if (rawSb.toString().equals(idealString)) {
                break;
            }

            StringBuilder alteredSb = new StringBuilder(rawSb.toString());
            for (int j = 1; j <= rawString.length() - 1; j++) {
                if ((alteredSb.toString().charAt(j) != idealString.charAt(j)) ||
                        (j + 1 < idealString.length()
                                && alteredSb.charAt(j - 1) == idealString.charAt(j + 1)
                                && alteredSb.charAt(j + 1) != idealString.charAt(j + 1))) {
                    rawSb.setCharAt(j, alteredSb.charAt(j - 1));
                }
            }
            results.add(rawSb.toString());
        }
        if (results.isEmpty() || !results.getLast().equals(idealString)) {
            System.out.println("-1");
        } else {
            System.out.println(i);
            results.forEach(System.out::println);
        }
    }

    private static void tests() {
        constructAndPrint("abcd", "aabd", 1);
        constructAndPrint("ab", "ab", 2);
        constructAndPrint("abcde", "abbcc", 3);
        constructAndPrint("egcnyeluw", "eegccyelw", 1);
        constructAndPrint("vzvylxxmsy", "vvvvvllxxx", 3);
        constructAndPrint("acba", "aaac", 6);
        constructAndPrint("acabb", "aaaca", 7);
        constructAndPrint("vfvpd", "vfvpp", 10);
    }
}