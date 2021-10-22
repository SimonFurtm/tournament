package htl.ahinf.tournament;

public class Lance extends Weapon{
    public Lance(String description, char type, String property) {
        super(description, type, property);
    }

    @Override
    public String toString() {
        return "Lance{" +
                "description='" + super.getDescription() + '\'' +
                ", type='" + super.getType() + '\'' +
                ", property='" + super.getProperty() + '\'' +
                '}';
    }
}
