package com.teamproject.student.utils;

import java.util.Scanner;

public class InputHelper {
    private static final Scanner scanner = new Scanner(System.in);

    // Read integer safely
    public static int readInt(String prompt) {
        System.out.print(prompt);
        return Integer.parseInt(scanner.nextLine().trim()); // read, trim, parse, and return
    }

    // Read string safely
    public static String readString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine().trim(); // read, trim, and return
    }
}
