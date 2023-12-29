import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import cabinvoice.CabInvoiceGenerator;

public class CabInvoiceTest {

    @Test
    public void testCalculateFare() {

        CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
        double fare = cabInvoiceGenerator.calculateFare(5, 15);
        assertEquals(65.0, fare);
    }

    @Test
    public void testMinimumFare() {
        CabInvoiceGenerator cabInvoiceGEnerator = new CabInvoiceGenerator();
        double fare = cabInvoiceGEnerator.calculateFare(0.2, 2);
        assertEquals(5.0, fare);
    }
}
