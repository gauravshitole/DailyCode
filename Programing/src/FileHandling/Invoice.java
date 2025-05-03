package FileHandling;

import java.io.Serializable;
import java.time.LocalDate;

public class Invoice implements Serializable {
    private  final int Id;
    private  final  String InvoiceName;
    private  final  int InvoiceAmt;
    private  final  LocalDate actualDate;
    private final LocalDate MatureDate;

    public Invoice(int id, String invoiceName, int invoiceAmt, LocalDate actualDate, LocalDate matureDate) {
        Id = id;
        InvoiceName = invoiceName;
        InvoiceAmt = invoiceAmt;
        this.actualDate = actualDate;
        MatureDate = matureDate;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "Id=" + Id +
                ", InvoiceName='" + InvoiceName + '\'' +
                ", InvoiceAmt=" + InvoiceAmt +
                ", actualDate=" + actualDate +
                ", MatureDate=" + MatureDate +
                '}';
    }
}
