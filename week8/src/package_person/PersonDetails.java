package package_person;

public class PersonDetails {

    public static void main (String []args){

        Person firstPerson;
        Person secondPerson;

        firstPerson = new Person();
        secondPerson = new Person();

        firstPerson.name = "Cathy";
        firstPerson.gender = 'F';
        firstPerson.age = 23;
        firstPerson.car = "Volkswagen Bug";
        firstPerson.violations = false;
        firstPerson.creditScore = 690;

        secondPerson.name = "Kendall";
        secondPerson.gender = 'M';
        secondPerson.age = 32;
        secondPerson.car = "Mustang";
        secondPerson.violations = true;
        secondPerson.creditScore = 670;

        double monthlyRate = 0;
        double adjustedRate= 0;

//        System.out.println(firstPerson.name);
//        System.out.println(firstPerson.gender);
//        System.out.println(firstPerson.age);
//        System.out.println(firstPerson.car);
//        System.out.println(firstPerson.violations);
//        System.out.println(firstPerson.creditScore);
//        System.out.println();
//        System.out.println(secondPerson.name);
//        System.out.println(secondPerson.gender);
//        System.out.println(secondPerson.age);
//        System.out.println(secondPerson.car);
//        System.out.println(secondPerson.violations);
//        System.out.println(secondPerson.creditScore);

        firstPerson.display();
        System.out.println("Preliminary Rate for "+firstPerson.name+": " +firstPerson.getRate(monthlyRate)+" dollars");
        System.out.println("Adjustments: "+firstPerson.assumeGender(adjustedRate)+" dollars");
        System.out.print("Here is your total monthly premium: ");
        System.out.println(firstPerson.assumeGender(adjustedRate)+firstPerson.getRate(monthlyRate));

        System.out.println();
        secondPerson.display();
        System.out.println("Preliminary Rate for "+secondPerson.name+": " +secondPerson.getRate(monthlyRate)+" dollars");
        System.out.println("Adjustments: "+secondPerson.assumeGender(adjustedRate)+" dollars");
        System.out.print("Here is your total monthly premium: ");
        System.out.println(secondPerson.assumeGender(adjustedRate)+secondPerson.getRate(monthlyRate));
    }
}
