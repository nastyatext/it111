package package_person_homework;

public class PersonHomework {

    String name;
    int age;
    int carAge;
    boolean violations;
    double creditScore;

    public void display() {
        System.out.println("Customer name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Car(age): " + carAge);
        System.out.println("Violations: " + violations);
        System.out.println("CreditScore: " + creditScore);
    }

    public double getRate(double monthlyRate) {
        if (violations == true && creditScore <= 700) {
            monthlyRate = 500.00;
        } else {
            monthlyRate = 150.00;
        }
        return monthlyRate;
    }

    public double assumeAge(double adjustedRate) {
        if(age >= 25 && carAge >= 2019) {
            adjustedRate = 200;
        } else {
            adjustedRate = 0;
        }
        return adjustedRate;
    }











}
