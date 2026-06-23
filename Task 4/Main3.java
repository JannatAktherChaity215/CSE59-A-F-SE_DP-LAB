
// Small interfaces
interface Printer {
    void printDocument();
}

interface Scanner {
    void scanDocument();
}

interface Fax {
    void faxDocument();
}


// Multi-function device
class MultiFunctionCopier implements Printer, Scanner, Fax {

    public void printDocument() {
        System.out.println("Printing...");
    }

    public void scanDocument() {
        System.out.println("Scanning...");
    }

    public void faxDocument() {
        System.out.println("Faxing...");
    }
}


// Basic printer only
class BasicPrinter implements Printer {

    public void printDocument() {
        System.out.println("Printing...");
    }
}


// MAIN CLASS
public class Main {
    public static void main(String[] args) {

        Printer p1 = new BasicPrinter();
        p1.printDocument();

        System.out.println("----");

        MultiFunctionCopier mfc = new MultiFunctionCopier();
        mfc.printDocument();
        mfc.scanDocument();
        mfc.faxDocument();
    }
}
