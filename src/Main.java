import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scnr = new Scanner(System.in);
        int MPG;
        double TankCapacity;
        double PercentofTank;

        System.out.println("Enter​ ​your​ ​car's​ ​MPG​ ​rating​ ​(miles/gallon)​ ​as​ ​a​ ​positive​ ​integer:​");
        MPG = scnr.nextInt();
        if (MPG <= 0) {
            System.out.println("ERROR: ONLY POSITIVE INTEGERS ARE ACCEPTED FOR MPG!!!");
        } else {
            System.out.print("Enter​ ​your​ ​car's​ ​tank​ ​capacity​ ​(gallons)​ ​as​ ​a​ ​positive​ ​decimal​ ​number:​ ");
            TankCapacity = scnr.nextDouble();

            if (TankCapacity <= 0) {
                System.out.println("ERROR: ONLY POSITIVE DECIMAL NUMBERS ACCEPTED FOR TANK CAPACITY!!!");
            } else {
                System.out.println("Enter​ ​the​ ​percentage​ ​of​ ​the​ ​gas​ ​tank​ ​that​ ​is​ ​currently​ ​filled​ ​(from​ ​0-100%):​ ");
                PercentofTank = scnr.nextDouble();
                if (PercentofTank > 100 || PercentofTank < 0) {
                    System.out.print("ERROR: PERCENTAGE MUST BE A DECIMAL NUMBER IN RANGE OF 0-100 (INCLUSIVE)!!!");
                } else {
                    int rawRange = (int) (MPG * TankCapacity * (PercentofTank * .01));
                    if (rawRange <= 25) {
                        System.out.println("Attention! Your current estimated range is running low: " + rawRange + " miles left!!!");
                    } else if (rawRange > 25) {
                        System.out.println("Keep driving! Your current estimated range is: " + rawRange + " miles!");
                    }
                }
            }
        }
    }
}