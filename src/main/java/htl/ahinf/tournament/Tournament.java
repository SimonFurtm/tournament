package htl.ahinf.tournament;

import java.util.ArrayList;

public class Tournament {
    private String tournamentName;
    private String host;
    private int participantsCount;
    private String list;
    private ArrayList<Knight> participants = new ArrayList<Knight>();

    //konstruktor Tournament
    public Tournament(String tournamentName, String host) {
        this.tournamentName = tournamentName;
        this.host = host;

    }
    //gibt informationen über das turnier aus
    public void tournamantInformation(){
        System.out.println(tournamentName + ":\n\tWelcome to the tournament hosted by " + host + "!\n\tPlease sign up, if you want to participate.");
    }
    //pause im turnier (console)
    public void tournamentBreak(){
        System.out.println("------------------["+ tournamentName +" Break]------------------");

    }
    //fügt ritter zu teilnehmerliste hinzu
    public void addParticipants(Knight knight) throws KnightAlreadyExists {
            for (int i = 0; i < getParticipants().size(); i++){
                if (participants.get(i) == knight){ //wenn ritter bereits hinzugefügt worden ist
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
    public String listAllParticipants(){
        list = "\n";
        for (int i = 0; i < getParticipants().size(); i++){
           //System.out.println(i + ": " + getKnights().get(i).getName());
           list += "Participant " + (i+1) + ":\n\t" + getParticipants().get(i).toString();
           System.out.println("Participant " + (i+1) + ":\n" + getParticipants().get(i).toString());
        }
        return list;
    }

    public void participantWithWeaponType(char wType){
        System.out.println();
        for (int i = 0; i < getParticipants().size(); i++){
            if ( getParticipants().get(i).getWeaponType() ==  wType){
                System.out.println("Participant (weapon type " + wType + ") " + (i+1) + ":\n" + getParticipants().get(i).toString());
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

    public String getList() {
        return list;
    }
}
