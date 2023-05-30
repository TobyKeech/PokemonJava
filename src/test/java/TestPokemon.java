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

    Grass grass;

    Normal normal;

    Poison poison;

    Fighting fighting;

    @Before
    public void setUp(){
        fire = new Fire("Charazard", 160, "fire");
        fairy = new Fairy("Jigglypuff", 100, "fairy");
        rock = new Rock("Onix", 100, "rock");
        water = new Water("Sqirtle", 100, "water");
        normal = new Normal("Evie", 100, "normal");
        grass = new Grass("Bulbasor", 100, "grass");
        poison = new Poison("Beedrill", 100, "poison");
        fighting = new Fighting("Machamp", 100, "fighting");



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
        assertEquals(60, water.getHp());
    }

    @Test
    public void pokemonbaseAttack(){
        fire.baseAttack(water);
        assertEquals(75, water.getHp());
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
        assertEquals(135, fire.getHp());
    }

    @Test
    public void pokemonCanNormalDefend(){
        fairy.superAttack(fire);
        fire.normalDefend(fire);
        assertEquals(145, fire.getHp());
    }

    @Test
    public void pokemonCanSuperDefend(){
        fairy.superAttack(fire);
        fire.superDefend(fire);
        assertEquals(175, fire.getHp());
    }

    @Test
    public void canAttackOnPokemon(){
        water.superAttack(grass);
        assertEquals(60, grass.getHp());
    }

    @Test
    public void fairyCanBeAttacked(){
        poison.baseAttack(fairy);
        assertEquals(80, fairy.getHp());
    }

    @Test
    public void fairyCanAttackedFighting(){
        fairy.normalAttack(fighting);
        assertEquals(65, fighting.getHp());
    }


}
