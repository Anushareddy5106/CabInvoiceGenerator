package cabinvoice;

public class CabInvoiceGenerator {
    static final double COST_PER_MINUTE = 1.0;
    static final double COST_PER_KM = 10.0;
    static final double MINIMUM_FARE = 5.0;

    public double calculateFare(double distance, double time) {
        double totalFare = distance * COST_PER_KM + time * COST_PER_MINUTE;
        return Math.max(totalFare, MINIMUM_FARE);
    }

    public double calculateTotalFare(Ride[] rides) {
        double totalFare = 0;
        for (Ride ride : rides) {
            totalFare += calculateFare(ride.distance, ride.time);
        }
        return totalFare;
    }

    public double calculateAverageFare(Ride[] rides) {
        double averageFare = 0;
        double totalRides = rides.length;
        double totalFare = calculateTotalFare(rides);

        averageFare = totalFare / totalRides;

        return averageFare;
    }

}