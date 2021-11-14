package htl.ahinf.tournament;

public class Lance extends Weapon{
    ////konstruktor Lance
    public Lance(String description, char type, String property) {
        super(description, type, property);
    }

    @Override
    public String toString() {
        return "Lance:\n" +
                "\t\tdescription= " + super.getDescription() + '\n' +
                "\t\ttype= " + super.getType() +'\n' +
                "\t\tproperty= " + super.getProperty() +
                ';';
    }
}
