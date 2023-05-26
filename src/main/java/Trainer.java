import Pokemons.Pokemon;
import behaviours.IAttackable;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;

public class Trainer {

    private String name;
    private int age;
    private ArrayList<Pokemon>pokeball;

    public Trainer(String name, int age) {
        this.name = name;
        this.age = age;
        pokeball = new ArrayList<>();
    }

    public int getNoOfPokemons(){
       return pokeball.size();
    }

    public void addPokemon(Pokemon pokemon){
        pokeball.add(pokemon);
    }

    public void removePokemon(Pokemon pokemon){
        pokeball.remove(pokemon);
    }

    public String choosePokemon(Pokemon pokemon){
         System.out.println(pokemon.getName() + " I choose you!");
         return this.name + ": "  + pokemon.getName() + " I choose you!";
    }

}
