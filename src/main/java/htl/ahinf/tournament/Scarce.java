package htl.ahinf.tournament;

public class Scarce extends Person{
    private int training;

    //konstruktor Scarce
    public Scarce(String name, String phoneNr, int training) {
        super(name, phoneNr);
        this.training = training;
    }

    @Override
    public String toString() {
        return "Lehrling:\n" +
                "\t\tname = " +  super.getName()+ '\n' +
                "\t\tphoneNr = " +  super.getPhoneNr()+ '\n' +
                "\t\ttraining = " + training;
    }

    public int getTraining() {
        return training;
    }
}
