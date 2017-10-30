package L03_Encapsulation_Lab.P04_FirstAndReserveTeam;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Team {
    private String name;
    private List<Person> firstTeam;
    private List<Person> reserveTeam;
    
    Team(String name) {
        this.name = name;
        this.firstTeam = new LinkedList<>();
        this.reserveTeam = new LinkedList<>();
    }
    
    void addPlayer (Person player){
        if (player.getAge() < 40){
            this.firstTeam.add(player);
        }
        else {
            this.reserveTeam.add(player);
        }
    }
    
    List<Person> getFirstTeam() {
        return Collections.unmodifiableList(this.firstTeam);
    }
    
    List<Person> getReserveTeam() {
        return Collections.unmodifiableList(this.reserveTeam);
    }
}
