public class MyOperators2 {
    public static void main(String[]args) {

//        boolean tuna = true;
//        boolean bread = false;
//        if(tuna == true && bread == true) {
//            System.out.println("We are having a sandwich!");
//        } else {
//            System.out.println("We are not!");
//        }

        boolean tuna = false;
        boolean bread = true;
        if(tuna == true || bread == true) {
            System.out.println("We are having some food products");
        } else {
            System.out.println("We will not be eating any food products today!");
        }

        int age = 19;

        if (age >= 18) {
            System.out.println("Yippy skippy, we can order an adult beverage!");

        } else {
            System.out.println("We will have a diet coke");
        }

        float height = 4f;
        if(height < 4) {
            System.out.println("We will not be able to ride the roller coaster");
        } else {
            System.out.println("Have a grate time on the roller coaster");
        }
    }
}
