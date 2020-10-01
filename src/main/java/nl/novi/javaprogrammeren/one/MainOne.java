package nl.novi.javaprogrammeren.one;

public class MainOne {

    public static void main(String[] args) {

        Person sjaak = new Person("Nick");
        sjaak.setAge(11);
        sjaak.celebrateBirthDay();
        System.out.println("" + sjaak.getName() + " is " + sjaak.getAge() + " jaar oud.");

    }
}
