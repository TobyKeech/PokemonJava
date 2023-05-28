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
        int damage = pokemon.getType().equals("water") ? 25 : 20;
        pokemon.setHp(pokemon.getHp() - damage);
    }

    @Override
    public void normalAttack(Pokemon pokemon) {
        int damage = pokemon.getType().equals("water") ? 40 : 30;
        pokemon.setHp(pokemon.getHp() - damage);
    }

    @Override
    public void superAttack(Pokemon pokemon) {
        int damage = pokemon.getType().equals("water") ? 50 : 40;
        pokemon.setHp(pokemon.getHp() - damage);
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
