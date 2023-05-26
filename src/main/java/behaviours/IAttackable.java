package behaviours;

import Pokemons.Pokemon;

public interface IAttackable {

    void baseAttack(Pokemon pokemon);
    void normalAttack(Pokemon pokemon);
    void superAttack(Pokemon pokemon);
}
