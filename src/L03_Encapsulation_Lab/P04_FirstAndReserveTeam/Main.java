package L03_Encapsulation_Lab.P04_FirstAndReserveTeam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        int peopleCount = Integer.parseInt(br.readLine());
    
        List<Person> players = new LinkedList<>();
        Team team = new Team("Cherven Trakotr Binkos");
    
        for (int i = 0; i < peopleCount; i++) {
            String[] personInfo = br.readLine().split(" ");
    
            int age = Integer.parseInt(personInfo[2]);
    
            players.add(new Person(age));
        }
    
        
        for (Person player : players) {
            team.addPlayer(player);
        }
    
        System.out.println(String.format("First team have %d players", team.getFirstTeam().size()));
        System.out.println(String.format("Reserve team have %d players", team.getReserveTeam().size()));
    }
}
