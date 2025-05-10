import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Player> players = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addPlayer(Player p) {
        players.add(p);
    }

    public String getName() {
        return name;
    }

    public List<Player> getPlayers() {
        return players;
    }
}
