package edu.neu.csye7374;
// Tradable Interface
public interface Tradable {
    /**
     * Place a bid to buy a stock.
     * 
     * @param bid
     */
    void setBid(String bid);

    /**
     * Return a metric indicating the measure of positive performance of this stock.
     * A large positive index means consider buying, and a large negative index means consider selling.
     * 
     * @return performance metric as an integer
     */
    int getMetric();
}