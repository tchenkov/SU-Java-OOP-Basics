package L04_Encapsulation_Exercises.P06_FootballTeamGenerator;

import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

class Team {
    private String name;
    private List<Player> players;
    
    Team(String name) {
        setName(name);
        this.players = new LinkedList<>();
    }
    
    private void setName(String name) {
        if (name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException(ErrorMessages.INVALID_NAME);
        }
        this.name = name;
    }
    
    void addPlayer(Player player){
        this.players.add(player);
    }
    
    void removePlayer(String playerName){
        Player player;
        try {
            player = this.players.stream()
                    .filter(p -> p.getName().equals(playerName))
                    .findFirst()
                    .get();
        } catch (NoSuchElementException nsee) {
            throw new NoSuchElementException(ErrorMessages.getInvalidPlayerTeam(playerName, this.name));
        }
    
        this.players.remove(player);
    }
    
    private long getRating(){
        return this.players.size() == 0 ? 0 :
                Math.round(this.players.stream().mapToLong(Player::getSkill).average().getAsDouble());
    }
    
    @Override
    public String toString() {
        return String.format("%s - %d", this.name, this.getRating());
    }
}
