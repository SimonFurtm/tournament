package htl.ahinf.tournament;

public class Lance extends Weapon{
    private String piercing;

    public Lance(String description, char type, String piercing) {
        super(description, type);
        this.piercing = piercing;
    }

    @Override
    public String toString() {
        return "Lance{" +
                "description='" + super.getDescription() + '\'' +
                ", type='" + super.getType() + '\'' +
                "piercing='" + piercing + '\'' +
                '}';
    }

    public String getPiercing() {
        return piercing;
    }
}
