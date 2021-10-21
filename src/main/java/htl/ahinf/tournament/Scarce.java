package htl.ahinf.tournament;

public class Scarce extends Person{
    private int training;

    public Scarce(String name, String phoneNr, int training) {
        super(name, phoneNr);
        this.training = training;
    }

    @Override
    public String toString() {
        return "Scarce{" +
                "name='" +  super.getName()+ '\'' +
                "phoneNr='" +  super.getPhoneNr()+ '\'' +
                "training=" + training +
                '}';
    }

    public int getTraining() {
        return training;
    }
}
