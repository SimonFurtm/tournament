package htl.ahinf.tournament;

public class Scarce extends Person{
    private int training;

    public Scarce(String name, int phoneNr, int training) {
        super(name, phoneNr);
        this.training = training;
    }

    @Override
    public String toString() {
        return "Scarce{" +
                "training=" + training +
                '}';
    }

    public int getTraining() {
        return training;
    }
}
