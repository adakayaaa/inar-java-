package week_06.assigments;

public class Question_06_15 {
    public static void main(String[] args) {
        System.out.println("Taxable" + "     " + "Single" + "     " + "Married Joint" + "     " + "Married" + "     " + "Head of");
        System.out.println("Income" + "       " + "          " + "or Qualifying" + "     " + "Separate" + "    " + "a House");
        System.out.println("                       " + "Widow(er)");
        System.out.println("-------------------------------------------------------------");

        for (int taxableIncome = 50000; taxableIncome <= 60000; taxableIncome += 50) {
            System.out.printf("%-12d%-11.0f%-18.0f%-12.0f%-12.0f\n", taxableIncome,
                    computeTax(1, taxableIncome),
                    computeTax(2, taxableIncome),
                    computeTax(3, taxableIncome),
                    computeTax(4, taxableIncome));
        }

    }

    public static double computeTax(int status, double taxableIncome) {
        double tax = 0;
        if (status == 1) {
            if (taxableIncome <= 8350)
                tax = taxableIncome * 0.10;
            else if (taxableIncome <= 33950)
                tax = 8350 * 0.10 + (taxableIncome - 8350) * 0.15;
            else if (taxableIncome <= 82250)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (taxableIncome - 33950) * 0.25;

        } else if (status == 2) {
            if (taxableIncome <= 16700)
                tax = taxableIncome * 0.10;
            else if (taxableIncome <= 67900)
                tax = 16700 * 0.10 + (taxableIncome - 16700) * 0.15;


        } else if (status == 3) {
            if (taxableIncome <= 8350)
                tax = taxableIncome * 0.10;
            else if (taxableIncome <= 33950)
                tax = 8350 * 0.10 + (taxableIncome - 8350) * 0.15;
            else if (taxableIncome <= 68525)
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (taxableIncome - 33950) * 0.25;


        } else if (status == 4) {
            if (taxableIncome <= 11950)
                tax = taxableIncome * 0.10;
            else if (taxableIncome <= 45500)
                tax = 11950 * 0.10 + (taxableIncome - 11950) * 0.15;
            else if (taxableIncome <= 117450)
                tax = 11950 * 0.10 + (45500 - 11950) * 0.15 + (taxableIncome - 45500) * 0.25;

        }
        return tax;
    }
}

