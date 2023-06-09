package package_person_homework;

public class PersonDetailsHomework {

    public static void main (String []args) {

        PersonHomework firstPerson;
        PersonHomework secondPerson;

        firstPerson = new PersonHomework();
        secondPerson = new PersonHomework();

        firstPerson.name = "Mary";
        firstPerson.age = 21;
        firstPerson.carAge = 2015;
        firstPerson.violations = false;
        firstPerson.creditScore = 730;

        secondPerson.name = "Stan";
        secondPerson.age = 26;
        secondPerson.carAge = 2023;
        secondPerson.violations = true;
        secondPerson.creditScore = 670;

        double monthlyRate = 0;
        double adjustedRate= 0;

        firstPerson.display();
        System.out.println("Preliminary Rate for "+firstPerson.name+": " +firstPerson.getRate(monthlyRate)+" dollars");
        System.out.println("Adjustments: "+firstPerson.assumeAge(adjustedRate)+" dollars");
        System.out.print("Here is "+firstPerson.name+"'s total monthly premium: ");
        System.out.println(firstPerson.assumeAge(adjustedRate)+firstPerson.getRate(monthlyRate)+" dollars");

        System.out.println();
        secondPerson.display();
        System.out.println("Preliminary Rate for "+secondPerson.name+": " +secondPerson.getRate(monthlyRate)+" dollars");
        System.out.println("Adjustments: "+secondPerson.assumeAge(adjustedRate)+" dollars");
        System.out.print("Here is "+secondPerson.name+"'s total monthly premium: ");
        System.out.println(secondPerson.assumeAge(adjustedRate)+secondPerson.getRate(monthlyRate)+" dollars");



    }
}
