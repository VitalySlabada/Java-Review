import java.util.ArrayList;



//T - type
public class Team<T extends Player>{

    private String name;


    public Team(String name) {
        this.name = name;
    }

    private ArrayList<T> members = new ArrayList<>();

    public String getName() {
        return name;
    }


    public boolean addPlayer (T player){

        if(members.contains(player)){
            System.out.println((player).getName() +  " Is already on a team");
            return false;

        }else{

            members.add(player);
            System.out.println((player).getName() + " picked for the team " + this.name);
            return true;
        }

    }

    public int numPlayers(){
        return this.members.size();
    }
}
