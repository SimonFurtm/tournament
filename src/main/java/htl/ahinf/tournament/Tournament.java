package htl.ahinf.tournament;

import java.util.ArrayList;

public class Tournament {
    private String tournamentName;
    private String host;
    private int participantsCount;
    private ArrayList<Knight> knights = new ArrayList<Knight>();

    public Tournament(String tournamentName, String host) {
        this.tournamentName = tournamentName;
        this.host = host;
    }

    public void tournamantInformation(){
        System.out.println(tournamentName + ":\n\tWelcome to the tournament of " + host + "!\n\tPlease sign up, if you want to participate.");
    }

    public void tournamentBreak(){
        System.out.println("------------------["+ tournamentName +" Break]------------------");

    }

    public void addParticipants(Knight knight){
        try {
            knights.add(knight);
            for (int i = 1; i < getKnights().size(); i++){
                if (knights.get(i-1) == knight){
                    throw new ArrayStoreException();
                }
            }
            participantsCount++;
            System.out.println(knight.getName() + " will participate in the " + tournamentName + " tournament.");

        }catch (ArrayStoreException e){
            System.out.println(knight.getName() + " participates already!");
        }
    }
    //Observer pattern
    public void listAllParticipants(){
        System.out.println();
        for (int i = 0; i < getKnights().size(); i++){
           //System.out.println(i + ": " + getKnights().get(i).getName());
           System.out.println("Participant " + i + ":\n" + getKnights().get(i).toString());
        }
    }

    public void participantWithWeaponType(char wType){
        int count=0;
        System.out.println();
        for (int i = 0; i < getKnights().size(); i++){
            if ( getKnights().get(i).getWeaponType() ==  wType){
                count++;
                System.out.println("Participant (weapon type " + wType + ") " + count + ":\n" + getKnights().get(i).toString());
            }
        }
    }

    public String getTournamentName() {
        return tournamentName;
    }

    public String getHost() {
        return host;
    }

    public int getParticipantsCount() {
        return participantsCount;
    }

    public ArrayList<Knight> getKnights() {
        return knights;
    }

}
