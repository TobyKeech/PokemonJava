package Pokemons.types;

import Pokemons.Pokemon;
import behaviours.IAttackable;
import behaviours.IDefendable;

public class Fire extends Pokemon implements IAttackable, IDefendable {
    public Fire(String name, int hp, String type) {
        super(name, hp, type);
    }


    @Override
    public void baseAttack(Pokemon pokemon) {
        int health = (pokemon.getHp() - 10);
        pokemon.setHp(health);
    }

    @Override
    public void normalAttack(Pokemon pokemon) {
        int health = (pokemon.getHp() - 25);
        pokemon.setHp(health);
    }

    @Override
    public void superAttack(Pokemon pokemon) {
        int health = (pokemon.getHp() - 50);
        pokemon.setHp(health);
    }

    @Override
    public void baseDefend(Pokemon pokemon) {
        int defencePower = 10;
        pokemon.setHp(getHp()+defencePower);
    }

    @Override
    public void normalDefend(Pokemon pokemon) {
        int defencePower = 20;
        pokemon.setHp(getHp()+defencePower);
    }

    @Override
    public void superDefend(Pokemon pokemon) {
        int defencePower = 50;
        pokemon.setHp(getHp()+defencePower);
    }
}
