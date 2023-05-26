import Pokemons.types.Fairy;
import Pokemons.types.Fire;
import Pokemons.types.Water;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestTrainer {

    Fairy fairy;
    Fire fire;

    Water water;

    Trainer trainer1;
    Trainer trainer2;

    @Before
    public void setUp(){
        trainer1 = new Trainer("Meg", 28);
        trainer2 = new Trainer("Toby", 26);
        fairy = new Fairy("Jigglypuff", 100, "fairy");
        fire = new Fire("Charazard", 160, "fire");
        water = new Water("Squirtle", 100, "water");
    }

    @Test
    public void noOfPokemonsStartsAtZero(){
        assertEquals(0, trainer1.getNoOfPokemons());
    }

    @Test
    public void canAddPokemon(){
        trainer1.addPokemon(fire);
        trainer1.addPokemon(fairy);
        assertEquals(2, trainer1.getNoOfPokemons());
    }
    @Test
    public void canRemovePokemon(){
        trainer1.addPokemon(fire);
        trainer1.addPokemon(fairy);
        trainer1.addPokemon(water);
        trainer1.removePokemon(fire);
        assertEquals(2, trainer1.getNoOfPokemons());
    }

    @Test
    public void canChoosePokemonT1(){
        assertEquals("Meg: Jigglypuff I choose you!", trainer1.choosePokemon(fairy));
    }
    @Test
    public void canChoosePokemonT2(){
        assertEquals("Toby: Charazard I choose you!", trainer2.choosePokemon(fire));
    }
}
