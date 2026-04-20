public class FinancialReport {
    public static void Report (Company company) {
         System.out.println("=== COMPANY SUMMARY ===");
        System.out.println("Name: " + company.getName());
        System.out.println("Revenue: " + company.getRevenue());
        System.out.println("Total Cost: " + company.calculateTotalCost());
        System.out.println("Profit: " + company.calculateProfit());
        System.out.println("Profitable: " + company.isProfitable());
        System.out.println("Can operate: " + company.canOperate());
        System.out.println();
    } 
}

    