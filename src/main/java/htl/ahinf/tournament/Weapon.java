package htl.ahinf.tournament;

public abstract class Weapon {
    private String description;

    public Weapon(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "description='" + description + '\'' +
                '}';
    }
}
