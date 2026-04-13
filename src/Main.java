public class Main {

    public static void main(String[] args) {

        Company blueSoft = new Company(
                "BlueSoft",
                40000,
                22000,
                5000,
                3000,
                2000
        );

        Company redTech = new Company(
                "RedTech",
                35000,
                24000,
                6000,
                2500,
                3000
        );

        // Print summaries 
        FinancialReport.Report(blueSoft); //static functions
        FinancialReport.Report(redTech); 
     

        // Compare profit 
        if (blueSoft.calculateProfit() > redTech.calculateProfit()) {
            System.out.println("BlueSoft is more profitable than RedTech.");
        } else if (redTech.calculateProfit() > blueSoft.calculateProfit()) {
            System.out.println("RedTech is more profitable than BlueSoft.");
        } else {
            System.out.println("Both companies have the same profit.");
        }

        System.out.println();

    
        if (!blueSoft.canOperate()) {
            System.out.println("BlueSoft has gone bankrupt. GAME OVER.");
        } else {
            System.out.println("BlueSoft can continue operating. NEXT TURN.");
        }

        if (!redTech.canOperate()) {
            System.out.println("RedTech has gone bankrupt. GAME OVER.");
        } else {
            System.out.println("RedTech can continue operating. NEXT TURN.");
        }
    }
}
