public class Company {

    private String name;
    private double revenue;
    private double salaries;
    private double rent;
    private double tools;
    private double marketing;

    public Company(String name,
                   double revenue,
                   double salaries,
                   double rent,
                   double tools,
                   double marketing) {

        if (revenue < 0 || salaries < 0 || rent < 0 || tools < 0 || marketing < 0) {
            throw new IllegalArgumentException("Financial values cannot be negative");
        }

        this.name = name;
        this.revenue = revenue;
        this.salaries = salaries;
        this.rent = rent;
        this.tools = tools;
        this.marketing = marketing;
    }

    public double calculateTotalCost() {
        return salaries + rent + tools + marketing;
    }

    public double calculateProfit() {
        return revenue - calculateTotalCost();
    }

    public boolean isProfitable() {
        return calculateProfit() > 0;
    }

    public boolean canOperate() {
        return revenue >= calculateTotalCost();
    }

    public void printSummary() {
        System.out.println("=== COMPANY SUMMARY ===");
        System.out.println("Name: " + name);
        System.out.println("Revenue: " + revenue);
        System.out.println("Total Cost: " + calculateTotalCost());
        System.out.println("Profit: " + calculateProfit());
        System.out.println("Profitable: " + isProfitable());
        System.out.println("Can operate: " + canOperate());
        System.out.println();
    }

    public String getName() {
        return name;
    }

    public double getRevenue() {
        return revenue;
    }
}