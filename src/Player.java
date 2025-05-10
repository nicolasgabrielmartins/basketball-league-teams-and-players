public class Player {
    String name;
    String lastname;
    int jerseyNumber;

    public Player(String name, String lastname, int jerseyNumber){
        this.name = name;
        this.lastname = lastname;
        this.jerseyNumber = jerseyNumber;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }
}
