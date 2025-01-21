package edu.neu.csye7374;
// StockAPI Superclass
public abstract class StockAPI implements Tradable {
    protected String ID;
    protected double price;
    protected String description;

    // Constructor
    public StockAPI(String ID, double price, String description) {
        this.ID = ID;
        this.price = price;
        this.description = description;
    }

    // Getters and Setters
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // toString method for meaningful representation
    @Override
    public String toString() {
        return String.format("Stock[ID='%s', Price=%.2f, Description='%s']", ID, price, description);
    }
}
