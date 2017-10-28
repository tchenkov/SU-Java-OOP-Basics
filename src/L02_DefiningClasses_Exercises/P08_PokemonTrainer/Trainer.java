package L02_DefiningClasses_Exercises.P08_PokemonTrainer;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Trainer {
    private String name;
    private int badgesCount = 0;
    private List<Pokemon> pokemons;
    
    public Trainer(String name) {
        this.name = name;
        this.pokemons = new ArrayList<>();
    }
    
    public int getBadgesCount() {
        return badgesCount;
    }
    
    public List<Pokemon> getPokemons() {
        return pokemons;
    }
    
    private void removePokemon(String pokemonName) {
        this.pokemons.remove(pokemonName);
    }
    
    public boolean hasPokemonWithElement(String element){
        for (Pokemon pokemon : this.pokemons) {
            if (pokemon.getElement().equals(element)){
                return true;
            }
        }
        return false;
    }
    
    public void addBadge(){
        this.badgesCount++;
    }
    
    public void removeHealth(int healthAmount) {
        for (int i = 0; i < this.pokemons.size(); i++) {
            this.pokemons.get(i).setHealth(this.pokemons.get(i).getHealth() - healthAmount);
        }
        this.pokemons = pokemons.stream()
                .filter(p -> p.getHealth() > 0)
                .collect(Collectors.toList());
    }
    
    @Override
    public String toString() {
        return String.format("%s %d %d",
                this.name, this.badgesCount, this.pokemons.size());
    }
}
