package htl.ahinf.tournament;

import java.util.ArrayList;

public class Tournament {
    private String tournamentName;
    private String host;
    private int participantsCount;
    private ArrayList<Knight> participants = new ArrayList<Knight>();

    public Tournament(String tournamentName, String host) {
        this.tournamentName = tournamentName;
        this.host = host;

    }

    public void tournamantInformation(){
        System.out.println(tournamentName + ":\n\tWelcome to the tournament hosted by " + host + "!\n\tPlease sign up, if you want to participate.");
    }

    public void tournamentBreak(){
        System.out.println("------------------["+ tournamentName +" Break]------------------");

    }

    public void addParticipants(Knight knight) throws KnightAlreadyExists {
            for (int i = 0; i < getParticipants().size(); i++){
                if (participants.get(i) == knight){
                    throw new KnightAlreadyExists(participants.get(i).getName());
                }
            }
            participants.add(knight);
            participantsCount++;
            System.out.println(knight.getName() + " will participate in the " + tournamentName + " tournament.");

        /*}catch (ArrayStoreException e){
            System.out.println(knight.getName() + " participates already!");
        }*/
    }

    public void removeParticipant(Knight knight){
        participants.remove(knight);
        System.out.println(knight.getName() + " no longer participates in the " + tournamentName + " tournament.");
    }

    //Observer pattern
    public void listAllParticipants(){
        System.out.println();
        for (int i = 0; i < getParticipants().size(); i++){
           //System.out.println(i + ": " + getKnights().get(i).getName());
           System.out.println("Participant " + i + ":\n" + getParticipants().get(i).toString());
        }
    }

    public void participantWithWeaponType(char wType){
        System.out.println();
        for (int i = 0; i < getParticipants().size(); i++){
            if ( getParticipants().get(i).getWeaponType() ==  wType){
                System.out.println("Participant (weapon type " + wType + ") " + i + ":\n" + getParticipants().get(i).toString());
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

    public ArrayList<Knight> getParticipants() {
        return participants;
    }

}
