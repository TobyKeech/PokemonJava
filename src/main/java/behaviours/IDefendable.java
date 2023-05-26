package behaviours;

import Pokemons.Pokemon;

public interface IDefendable {

    void baseDefend(Pokemon pokemon);
    void normalDefend(Pokemon pokemon);
    void superDefend(Pokemon pokemon);
}
