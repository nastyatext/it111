public class MyModulus {
    public static void main(String[] args) {
        int number1, number2, number3;
        number1 = 2576;
        number2 = 2;
        number3 = number1 % number2;

        if (number3 == 0) {
            System.out.println(number1 + " is an even number");
        } else {
            System.out.println(number1 + " is an ODD number");
        }

//        double tax,priceOtItem, taxOfItem, totalPrice;
//        tax = .10;
//        priceOtItem = 100.00;
//        taxOfItem = priceOtItem * tax;
//        totalPrice = priceOtItem + taxOfItem;
//
//        System.out.println("Prise of item $" +priceOtItem+ " dollars");
//        System.out.println("Tax $" +taxOfItem+ " dollars");
//        System.out.println("Prise including tax $" +totalPrice+ " dollars");

         double priceOfItem = 100;
         priceOfItem *= 1.10;

         System.out.println("totalprice of item is " +priceOfItem+ " dollars");
         System.out.print("Total prise is: ");
         System.out.printf("$%.2f", priceOfItem);
         System.out.print(" dollars");



    }
}
