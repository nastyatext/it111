public class litersGallConverter {

    public static void main (String[]args) {

        double gal, lit;
        int cyclesCounter = 1;
        for (gal = 1; gal <= 98; gal = gal+4) {
            lit = gal * 3.785;
            String gallonName = gal > 1 ? "Gallons" : "Gallon";
            System.out.printf("%.2f Liters = %.2f %s \n", lit, gal, gallonName);

            if (cyclesCounter == 5){
                System.out.println();
                cyclesCounter = 0;
            }

            cyclesCounter++;
        }

        System.out.println(" We are done!!!");
    }

}
