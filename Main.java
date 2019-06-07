package CalcMiles;

import java.util.*;
//https://gist.github.com/Alexander-kas/b159fa178b9763c1f4fe5a72da8142d7
public class Main {

    public static void main(String[] args) {

        Miles payroll = new Miles();
        payroll.setKm("What do you prefer? (Enter Km or Mile).");
        payroll.setCent(0.29);
        payroll.setTax(0.345);
        payroll.setExToMile(1.609344);
        payroll.setDrop(10);
        payroll.setHours(12);

        System.out.println(payroll.getKm());

//Your Scanner option for choosing, Kilometres or Miles

        Scanner ent = new Scanner(System.in);
        String kmi = ent.next();

//if = different between KM and Mile
//if the user choosed KM it will exchange for Miles.

        if (kmi.equalsIgnoreCase("km")) {
            System.out.println("Enter your Kilometres");
            int exKm = ent.nextInt();

//if choose km and enter the Kilometres it will * exToMile(1.609344)
            double res = exKm / payroll.getExToMile();

//if choose Miles it will do the simple calc.

            System.out.println("Your exchange Miles is " + res);
            double res2 = res * payroll.getCent();

//some add as waiting time and drop/pick

            System.out.println("How many hours of waiting time did you had? ");
            int waiTime = ent.nextInt();
            int resTime = waiTime * payroll.getHours();

            System.out.println("How many Drop & Pick up did you had? ");
            int drPi = ent.nextInt();
            int resDp = drPi * payroll.getDrop();
            float lastCalc = (float) (res2 + resTime + resDp);

            System.out.println("Your pay is $" + lastCalc);

            float mtax = (float) (payroll.getTax() * lastCalc);
            System.out.println("Tax is $" + mtax);

            float afterTax = (float) (lastCalc - mtax);
            System.out.println("Your payment after Tax is $" + afterTax);

            //this is the regular formula

        } else {
            System.out.println("Enter your Miles ");
            int mlx = ent.nextInt();

            //it is some add for the amount as Waiting time and drop/load

            System.out.println("How many hours of waiting time did you had? ");
            int waiTime = ent.nextInt();
            int resTime = waiTime * payroll.getHours();

            System.out.println("How many Drop & Pick up did you had? ");
            int drPi = ent.nextInt();
            int resDp = drPi * payroll.getDrop();
            float cet = (float) (mlx * payroll.getCent());

            //last calc include waiting time and drop/pickup

            double lastCalc = cet + resTime + resDp;
            System.out.println("Your pay is $" + lastCalc);
            double mtax = payroll.getTax() * lastCalc;

            System.out.println("Your tax is $" + mtax);
            float afterTax = (float) (lastCalc - mtax);

            System.out.println("Your payment after tax will $" + afterTax);
        }
    }
}

