import java.util.ArrayList;
import java.util.List;

public class LeagueManager {
    private List<Team> teams = new ArrayList<>();

    // Team Register
    public void registerTeam(String teamName){
        teams.add(new Team(teamName));
    }

    // Players register in Teams
    public boolean registerPlayer(String teamName, String playerName, String lastname, int number) {
        for (Team t : teams) {
            if (t.getName().equalsIgnoreCase(teamName)) {
                t.addPlayer(new Player(playerName, lastname, number ));
                return true;
            }
        }
        return false; // Team not found
    }

    public void listAll(){
        if(teams.isEmpty()){
            System.out.println("Teams not found!");
        }
        for(Team t : teams){
            System.out.println("Team: " + t.getName());
            if(t.getPlayers().isEmpty()){
                System.out.println("Players not found");
            }else {
                for(Player p : t.getPlayers()){
                    System.out.println("  - #" + p.getJerseyNumber() + " " + p.getLastname() + ", " + p.getName());
                }
            }
        }
    }
}
