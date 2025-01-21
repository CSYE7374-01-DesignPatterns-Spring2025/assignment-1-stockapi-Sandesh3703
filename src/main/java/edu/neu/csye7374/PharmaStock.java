package edu.neu.csye7374;
// PharmaStock Subclass
public class PharmaStock extends StockAPI {
    private int performanceMetric;
    private int bidCount = 0;

    // Constructor
    public PharmaStock(String ID, double price, String description) {
        super(ID, price, description);
        this.performanceMetric = 0;
    }

    // Implement setBid method
    @Override
    public void setBid(String bid) {
        double bidValue = Double.parseDouble(bid);
        if (bidValue > price) {
            performanceMetric += 8;
            price = bidValue;
        } else {
            performanceMetric -= 4;
        }
        bidCount++;
        System.out.println("New bid placed: " + bid + " | New price: " + price + " | Performance Metric: " + getMetric());
    }

    // Implement getMetric method
    @Override
    public int getMetric() {
        return performanceMetric;
    }
}
