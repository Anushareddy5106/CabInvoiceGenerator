import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import cabinvoice.CabInvoiceGenerator;
import cabinvoice.Ride;

public class CabInvoiceTest {

    @Test
    public void testCalculateFare() {

        CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
        double fare = cabInvoiceGenerator.calculateFare(5, 15);
        assertEquals(65.0, fare);
    }

    @Test
    public void testMinimumFare() {
        CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
        double fare = cabInvoiceGenerator.calculateFare(0.2, 2);
        assertEquals(5.0, fare);
    }

    @Test
    public void testCalculateTotalFare() {
        CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
        Ride[] rides = {
                new Ride(2.0, 5),
                new Ride(1.0, 1)
        };
        double totalfare = cabInvoiceGenerator.calculateTotalFare(rides);
        assertEquals(36.0, totalfare);
    }

    @Test
    public void testCalculateAverageFare() {
        CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();
        Ride[] rides = {
                new Ride(2.0, 5),
                new Ride(1.0, 1),
                new Ride(1.0, 2),
        };
        double averageFare = cabInvoiceGenerator.calculateAverageFare(rides);
        assertEquals(16.0, averageFare);
    }

}
