import java.time.temporal.Temporal;

public class TeamTest {

    public static void main(String[] args) {

     FootbalPlayer joe = new FootbalPlayer("Joe");
     BaseballPlayer pat = new BaseballPlayer("Pat");
     SoccerPlayer beckham = new SoccerPlayer("Beckham");


    Team<FootbalPlayer> liverpool = new Team("Liverpool");

    Team<Player> brokenTeam = new Team<>("this won't work");

liverpool.addPlayer(joe);
//liverpool.addPlayer(pat);
//liverpool.addPlayer(beckham);

        System.out.println(liverpool.numPlayers());





    }
}
