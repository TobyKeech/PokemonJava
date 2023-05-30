package Pokemons.types;

import Pokemons.Pokemon;
import behaviours.IAttackable;
import behaviours.IDefendable;

public class Fairy extends Pokemon implements IAttackable, IDefendable {
    public Fairy(String name, int hp, String type) {
        super(name, hp, type);
    }

    @Override
    public void baseAttack(Pokemon pokemon) {
        String type = pokemon.getType();
        int damage = type.equals("fighting") ? 20 : 10;
        pokemon.setHp(pokemon.getHp() - damage);
    }

    @Override
    public void normalAttack(Pokemon pokemon) {
        String type = pokemon.getType();
        int damage = type.equals("fighting") ? 35 : 30;
        pokemon.setHp(pokemon.getHp() - damage);
    }

    @Override
    public void superAttack(Pokemon pokemon) {
        String type = pokemon.getType();
        int damage = type.equals("fighting") ? 40 : 35;
        pokemon.setHp(pokemon.getHp() - damage);
    }

    @Override
    public void baseDefend(Pokemon pokemon) {

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
