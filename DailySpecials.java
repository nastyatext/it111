import java.util.Scanner;

public class DailySpecials {

    public static void main(String[] args) {

        String dayOfTheWeek = null;

        Scanner input = new Scanner(System.in);

        boolean isWeekend = true;
        while (isWeekend) {
            System.out.println(
                    "Please enter a day of the week excluding weekends (Monday - Friday only)");
            dayOfTheWeek = input.next();
            isWeekend = dayOfTheWeek.equals("Saturday") || dayOfTheWeek.equals("Sunday");
        }

        String coffee = "";
        double price = 0.0;
        int ordersCount;
        switch (dayOfTheWeek) {
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
            default -> throw new RuntimeException("Unexpected dayOfTheWeek value: " + dayOfTheWeek);
        }

        System.out.printf("%s's coffee of the day %s is a price will be $%s\n", dayOfTheWeek, coffee,
                price);
        System.out.println("How many " + coffee + "s would you like to order?");
        ordersCount = input.nextInt();
        System.out.println(buildOrdersMessage(coffee, ordersCount));

        double discountPercent = calcDiscount(ordersCount);
        if (discountPercent > 0) {
            System.out.printf("Looks like you qualify for a group discount! Your regular price $%.2f."
                            + " But you will be charged only %.3f per one. \n", price,
                    price * (1 - discountPercent / 100));
            price = price * (1 - discountPercent / 100);
        }
        System.out.printf("Total: $%.2f dollars", ordersCount * price);

    }

    private static int calcDiscount(final int ordersCount) {
        int discountPercent = 0;
        if (ordersCount >= 5) {
            discountPercent = 10;
        }
        if (ordersCount >= 10) {
            discountPercent = 20;
        }
        return discountPercent;
    }

    private static String buildOrdersMessage(final String coffee, final int ordersCount) {
        if (ordersCount < 0) {
            throw new RuntimeException("The unexpected order count detected");
        }
        if (ordersCount == 0) {
            return "Looks like you don't like " + coffee + "s.";
        } else if (ordersCount == 1) {
            return "Looks like you will be ordering 1 " + coffee + ".";
        }
        return ordersCount + " " + coffee + "s have been ordered.";

    }

}