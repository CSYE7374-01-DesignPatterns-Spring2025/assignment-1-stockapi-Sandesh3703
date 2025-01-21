package edu.neu.csye7374;

/**
 * 
 * @author Yesha
 * 
 */

public class Driver {
	public static void main(String[] args) {
		System.out.println("============Main Execution Start===================\n\n");

		// Creating stock objects
        TechStock techStock = new TechStock("TSLA", 800.00, "Tesla Inc. Stock");
        PharmaStock pharmaStock = new PharmaStock("PFE", 50.00, "Pfizer Inc. Stock");

        // Simulating 6 bids for each stock
        String[] techBids = { "810", "820", "780", "830", "850", "790" };
        String[] pharmaBids = { "52", "48", "55", "53", "50", "58" };

        System.out.println("\nTrading Tech Stock:");
        for (String bid : techBids) {
            techStock.setBid(bid);
        }

        System.out.println("\nTrading Pharma Stock:");
        for (String bid : pharmaBids) {
            pharmaStock.setBid(bid);
        }

        // Final stock states
        System.out.println("\nFinal Stock Details:");
        System.out.println(techStock);
        System.out.println(pharmaStock);
		 
		System.out.println("\n\n============Main Execution End===================");
	}

}
