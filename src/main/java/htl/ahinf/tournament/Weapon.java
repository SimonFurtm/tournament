package htl.ahinf.tournament;

public abstract class Weapon {
    private String description;
    private char type;
    private String property;

    public Weapon(String description, char type, String property) {
        this.description = description;
        this.type = type;
        this.property = property;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "description='" + description + '\'' +
                ", type='" + type + '\'' +
                ", property='" + property + '\'' +
                '}';
    }

    public String getDescription() {
        return description;
    }

    public char getType() {
        return type;
    }

    public String getProperty() {
        return property;
    }
}
