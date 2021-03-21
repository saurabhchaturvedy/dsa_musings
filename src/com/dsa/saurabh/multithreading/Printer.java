package com.dsa.saurabh.multithreading;

public class Printer implements Runnable {

    private final int step;
    private final State state;
    private int currentValue;
    private final int maxValue;
    private final PrinterType currentPrinterType;
    private final PrinterType nextPrinterType;

    public Printer(int step, State state, int currentValue, int maxValue, PrinterType currentPrinterType, PrinterType nextPrinterType) {
        this.step = step;
        this.state = state;
        this.currentValue = currentValue;
        this.maxValue = maxValue;
        this.currentPrinterType = currentPrinterType;
        this.nextPrinterType = nextPrinterType;
    }

    @Override
    public void run() {
        while(currentValue<=maxValue)
        {
            synchronized(state)
            {
                while(this.currentPrinterType!=state.getNextPrinterType())
                {
                    try {
                        state.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(this.currentPrinterType.toString()+" : "+currentValue);
                currentValue+=step;
                state.setNextPrinterType(this.nextPrinterType);
                state.notifyAll();
            }
        }
    }
}
