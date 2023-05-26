package Pokemons.types;

import Pokemons.Pokemon;
import behaviours.IAttackable;

public class Normal extends Pokemon implements IAttackable {
    public Normal(String name, int hp, String type) {
        super(name, hp, type);
    }

    @Override
    public void baseAttack(Pokemon pokemon) {
        int health = (pokemon.getHp() - 10);
        pokemon.setHp(health);
    }

    @Override
    public void normalAttack(Pokemon pokemon) {

    }

    @Override
    public void superAttack(Pokemon pokemon) {

    }
}
