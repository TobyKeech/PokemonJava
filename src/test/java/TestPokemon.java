import Pokemons.types.*;
import behaviours.IAttackable;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestPokemon {

    Fire fire;
    Fairy fairy;

    Water water;

    Rock rock;

    Normal normal;

    @Before
    public void setUp(){
        fire = new Fire("Charazard", 160, "fire");
        fairy = new Fairy("Jigglypuff", 100, "fairy");
        rock = new Rock("Onix", 100, "rock");
        water = new Water("Sqirtle", 100, "water");
        normal = new Normal("Evie", 100, "normal");

    }

    @Test
    public void pokemonHasName(){
        assertEquals("Charazard", fire.getName());
    }

    @Test
    public void pokemomHasHp(){
        assertEquals(160, fire.getHp());
    }

    @Test
    public void pokemonHasType(){
        assertEquals("fairy", fairy.getType());
    }


    @Test
    public void pokemonCanAttack(){
        fire.normalAttack(water);
        assertEquals(50, water.getHp());
    }

    @Test
    public void pokemonbaseAttack(){
        fire.baseAttack(water);
        assertEquals(65, water.getHp());
    }

    @Test
    public void pokemonSuperAttackOnWeakType(){
        fire.superAttack(water);
        assertEquals(50, water.getHp());
    }

    @Test
    public void pokemonSuperAttack() {
        fire.superAttack(fairy);
        assertEquals(60, fairy.getHp());
    }

        @Test
    public void pokemonCanBaseDefend(){
        fairy.superAttack(fire);
        fire.baseDefend(fire);
        assertEquals(120, fire.getHp());
    }

    @Test
    public void pokemonCanNormalDefend(){
        fairy.superAttack(fire);
        fire.normalDefend(fire);
        assertEquals(130, fire.getHp());
    }

    @Test
    public void pokemonCanSuperDefend(){
        fairy.superAttack(fire);
        fire.superDefend(fire);
        assertEquals(160, fire.getHp());
    }


}
