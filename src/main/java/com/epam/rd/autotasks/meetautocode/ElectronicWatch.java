package com.epam.rd.autotasks.meetautocode;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        int hours = (seconds / 3600) % 24;
        int minutes = ((seconds - hours * 3600) / 60) % 60;
        seconds = (seconds - hours * 3600 - minutes * 60) % 60;
        System.out.printf("%d:%02d:%02d", hours, minutes, seconds);


    }
}
