package htl.ahinf.tournament;

public abstract class Person {

    private final String name;
    private final String phoneNr;

    public Person(String name, String phoneNr) {
        this.name = name;
        this.phoneNr = phoneNr;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", phoneNr=" + phoneNr +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getPhoneNr() {
        return phoneNr;
    }
}
