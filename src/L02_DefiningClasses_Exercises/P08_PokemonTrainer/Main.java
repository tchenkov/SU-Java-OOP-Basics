package L02_DefiningClasses_Exercises.P08_PokemonTrainer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static final int HEALTH_AMOUNT_TO_REMOVE = 10;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        Map<String, Trainer> trainers = new LinkedHashMap<>();
        getTrainersAndPokemons(trainers, br);
        
        startTournament(trainers, br);
    
        Map<String, Trainer> sortedTrainers = getSortTrainers(trainers);
        
        printTrainersAndPokemons(sortedTrainers);
        
    }
    
    private static Map<String, Trainer> getSortTrainers(Map<String, Trainer> trainers) {
        Map<String, Trainer> sortedTrainers = new LinkedHashMap<>();
        trainers.entrySet().stream()
                .sorted((t1, t2) -> Integer.compare(t2.getValue().getBadgesCount(), t1.getValue().getBadgesCount()))
                .forEach(t -> sortedTrainers.put(t.getKey(), t.getValue()));
         return sortedTrainers;
    }
    
    private static void printTrainersAndPokemons(Map<String, Trainer> trainers) {
        for (Trainer trainer : trainers.values()) {
            System.out.println(trainer);
        }
    }
    
    private static void startTournament(Map<String, Trainer> trainers, BufferedReader br) throws IOException {
        if (trainers.size() == 0){
            return;
        }
        String element = br.readLine();
        if (element.isEmpty()){
            return;
        }
        
        while (!element.equals("End")){
            for (String trainerName : trainers.keySet()) {
                if (trainers.get(trainerName).hasPokemonWithElement(element)){
                    trainers.get(trainerName).addBadge();
                }
                else {
                    trainers.get(trainerName).removeHealth(HEALTH_AMOUNT_TO_REMOVE);
                }
            }
    
            element = br.readLine();
        }
    }
    
    private static void getTrainersAndPokemons(Map<String, Trainer> trainers, BufferedReader br) throws IOException {
        String command = br.readLine();
        if (command.isEmpty()){
            return;
        }
        
        while (!command.toLowerCase().equals("tournament")){
            String[] input = command.split("\\s+");
            
            String trainerName = input[0];
            String pokemonName = input[1];
            String pokemonElement = input[2];
            int pokemonHealth = (int) Double.parseDouble(input[3]);
    
            trainers.putIfAbsent(trainerName, new Trainer(trainerName));
            if (pokemonHealth > 0){
                Pokemon pokemon = new Pokemon(pokemonName, pokemonElement, pokemonHealth);
                trainers.get(trainerName).getPokemons().add(pokemon);
            }
    
            command = br.readLine();
        }
    }
}
