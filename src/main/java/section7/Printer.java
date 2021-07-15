package section7;

public class Printer {
    private int tonerLevel;
    private int numberOfPrintedPages;
    private boolean duplexPrinter;

    public Printer(int tonerLevel, boolean duplexPrinter) {
        if(tonerLevel<=100 && this.tonerLevel>=0)
            this.tonerLevel = tonerLevel;
        else
            this.tonerLevel = -1;
        this.numberOfPrintedPages = 0;
        this.duplexPrinter = duplexPrinter;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNumberOfPrintedPages() {
        return numberOfPrintedPages;
    }

    public boolean isDuplexPrinter() {
        return duplexPrinter;
    }

    public int fillToner(int tonerAmount){
        if(this.tonerLevel>=0 && this.tonerLevel<=100)
            if(this.tonerLevel+tonerAmount>100)
                return -1;
            else {
                this.tonerLevel = this.tonerLevel + tonerAmount;
                return this.tonerLevel;
            }
        else
            return -1;
    }

    public int printPages(int pages){
        System.out.println("Printer is printing pages...");
        if(this.duplexPrinter)
            if(pages%2 == 0)
                this.numberOfPrintedPages = this.numberOfPrintedPages + pages/2;
            else
                this.numberOfPrintedPages = this.numberOfPrintedPages + pages/2 + 1;
        else
            this.numberOfPrintedPages = this.numberOfPrintedPages + pages;

        return this.numberOfPrintedPages;
    }


}
