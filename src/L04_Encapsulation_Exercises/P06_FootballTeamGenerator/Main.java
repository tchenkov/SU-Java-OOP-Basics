package L04_Encapsulation_Exercises.P06_FootballTeamGenerator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        Map<String, Team> teams = new HashMap<>();
        
        while (true) {
            String input;
            if ("end".equalsIgnoreCase(input = br.readLine())) {
                break;
            }
            
            String[] command = input.split(";");
            String instruction = command[0];
            String teamName = command[1];
            
            switch (instruction) {
                case "Team":
                    teams.putIfAbsent(teamName, new Team(teamName));
                    break;
                case "Add":
                    addPlayer(command, teams);
                    break;
                case "Remove":
                    removePlayer(command, teams);
                    break;
                case "Rating":
                    showTeamRating(command, teams);
            }
        }
    }
    
    private static void showTeamRating(String[] command, Map<String, Team> teams) {
        try {
            String teamName = command[1];
            if (!teams.containsKey(teamName)) {
                throw new NoSuchElementException(ErrorMessages.getTeamDoesNotExist(teamName));
            }
    
            System.out.println(teams.get(teamName));
        } catch (NoSuchElementException nsee){
            System.out.println(nsee.getMessage());
        }
    }
    
    private static void removePlayer(String[] command, Map<String, Team> teams) {
        try {
            String teamName = command[1];
            if (!teams.containsKey(teamName)) {
                throw new NoSuchElementException(ErrorMessages.getTeamDoesNotExist(teamName));
            }
            
            Team team = teams.get(teamName);
            String playerName = command[2];
            team.removePlayer(playerName);
        } catch (NoSuchElementException iae){
            System.out.println(iae.getMessage());
        }
    }
    
    private static void addPlayer(String[] command, Map<String, Team> teams) {
        try {
            String teamName = command[1];
            if (!teams.containsKey(teamName)) {
                throw new NoSuchElementException(ErrorMessages.getTeamDoesNotExist(teamName));
            }
            
            Team team = teams.get(teamName);
            String playerName = command[2];
            int endurance = Integer.parseInt(command[3]);
            int sprint = Integer.parseInt(command[4]);
            int dribble = Integer.parseInt(command[5]);
            int passing = Integer.parseInt(command[6]);
            int shooting = Integer.parseInt(command[7]);
            
            Player player = new Player(playerName, endurance, sprint, dribble, passing, shooting);
            team.addPlayer(player);
        } catch (NoSuchElementException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
