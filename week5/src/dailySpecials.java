import java.util.Scanner;

public class dailySpecials {
    public static void main(String[] args) {


        String specials;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a day of the week excluding weekends (Monday - Friday only)");
        specials = input.next();
        boolean saturday = specials.equals("Saturday");
        boolean sunday = specials.equals("Sunday");
        if (saturday || sunday) {
            System.out.println("Please enter a weekday, not weekend");
            specials = input.next();

        }

        String coffee="";
        double price=0.0;
        int numbers;
        switch (specials) {
            case "Monday" -> {
                coffee = "Latte";
                price = 4.95;

            }
            case "Tuesday" -> {
                coffee = "Frappe";
                price = 5.95;
            }
            case "Wednesday" -> {
                coffee = "Cappuccino";
                price = 4.35;
            }
            case "Thursday" -> {
                coffee = "Regular Joe";
                price = 2.95;
            }
            case "Friday" -> {
                coffee = "Green Tea Latte";
                price = 6.95;
            }
        }

        System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price will be " + price + "$");
        System.out.println("How many "+coffee+"s would you like to order?");
        numbers = input.nextInt();
        if (numbers == 0) {
            System.out.println("Looks like you don't like " + coffee + "s");
        } else if (numbers == 1) {
            System.out.println("Looks like you will be ordering 1 " + coffee);
        } else {
            System.out.println(numbers + " "+coffee+"s have been ordered totalling");
            System.out.printf("$ %.2f dollars", numbers * price);
        }


    }


}