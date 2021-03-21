package com.dsa.saurabh.multithreading;

public class App {

    public static void main(String[] args) {
        final State state = new State(PrinterType.ODD);
        final Printer oddPrinter = new Printer(2, state, 1, 50, PrinterType.ODD, PrinterType.EVEN);
        final Printer evenPrinter = new Printer(2, state, 2, 50, PrinterType.EVEN, PrinterType.ODD);

        final Thread oddThread = new Thread(oddPrinter);
        final Thread evenThread = new Thread(evenPrinter);

        oddThread.start();
        evenThread.start();
    }
}
