package simulator;

import java.util.ArrayList;
import java.util.Collections;

public class Simulator {
    public static void main(String[] args) {
        System.out.println("Hello Simulation");

        Team Rashomon = new Team();

        Collections.addAll(
                Rashomon.players,
                new Player("Kappa, the Gate Keeper", 0, 0, 0, 5),
                new Player("Fudo Miyo, the defender", 0, 0, 0, 5),
                new Player("Miyasaki, the defender", 0, 0, 0, 5),
                new Player("Kurosawa, the defender", 0, 0, 0, 5),
                new Player("Mifune, the defender", 0, 0, 0, 5),
                new Player("Yojimbo, The attacker", 3, 3, 7, 1),
                new Player("Kenshin, The midfielder", 1, 1, 1, 1),
                new Player("Sasuke, The midfielder", 1, 1, 1, 1),
                new Player("Sakura, The midfielder", 1, 1, 1, 1),
                new Player("Naruto, Striker", 1, 1, 1, 1),
                new Player("Kenpachi Zaraki, the Attacker", 1, 1, 1, 1)
                );

        Team Yarnham = new Team();
            Collections.addAll(
                    Yarnham.players,
                    new Player("Mergo, the Gate Keeper", 0, 0, 0, 5),
                    new Player("Gerhardt, the attacker", 0, 0, 0, 5),
                    new Player("Eileen, the attacker", 0, 0, 0, 5),
                    new Player("Henryk, the attacker", 0, 0, 0, 5),
                    new Player("Alfred, the attacker", 0, 0, 0, 5),
                    new Player("Gascoigne, The midfielder", 3, 3, 7, 1),
                    new Player("Micolas, The midfielder", 1, 1, 1, 1),
                    new Player("Amelia, The midfielder", 1, 1, 1, 1),
                    new Player("Laurence, The defender", 1, 1, 1, 1),
                    new Player("Ludwig, The defender", 1, 1, 1, 1),
                    new Player("Maria, the defender", 1, 1, 1, 1)
                    );

        Team Disney = new Team();
            Collections.addAll(
                    Disney.players,
                    new Player("Donald, the Gate Keeper", 0, 0, 0, 5),
                    new Player("Scrooge, the attacker", 0, 0, 0, 5),
                    new Player("Mickey, the attacker", 0, 0, 0, 5),
                    new Player("Minnie, the attacker", 0, 0, 0, 5),
                    new Player("Goofy, the midfielder", 0, 0, 0, 5),
                    new Player("Pluto, the midfielder", 0, 0, 0, 5),
                    new Player("Aladdin, the midfielder", 0, 0, 0, 5),
                    new Player("Simba, the midfielder", 0, 0, 0, 5),
                    new Player("Mufasa, the midfielder", 0, 0, 0, 5),
                    new Player("Aladdin, the defender", 0, 0, 0, 5),
                    new Player("Abu, the defender", 0, 0, 0, 5),
                    new Player("Genie, the defender", 0, 0, 0, 5)
                    );

        Team Pokemon = new Team();
            Collections.addAll(
                    Pokemon.players,
                    new Player("Pikachu, the Gate Keeper", 0, 0, 0, 5),
                    new Player("Raichu, the attacker", 0, 0, 0, 5),
                    new Player("Bulbasaur, the attacker", 0, 0, 0, 5),
                    new Player("Charmander, the attacker", 0, 0, 0, 5),
                    new Player("Squirtle, the midfielder", 0, 0, 0, 5),
                    new Player("Chikorita, the midfielder", 0, 0, 0, 5),
                    new Player("Cyndaquil, the midfielder", 0, 0, 0, 5),
                    new Player("Totodile, the midfielder", 0, 0, 0, 5),
                    new Player("Snorlax, the defender", 0, 0, 0, 5),
                    new Player("Squirtle, the defender", 0, 0, 0, 5),
                    new Player("Mewtwo, the defender", 0, 0, 0, 5)
                    );

        Team Juventus = new Team();
            Collections.addAll(
                    Juventus.players,
                    new Player("Cristiano, the Gate Keeper", 0, 0, 0, 5),
                    new Player("Messi, the attacker", 0, 0, 0, 5),
                    new Player("Neymar, the attacker", 0, 0, 0, 5),
                    new Player("Kaka, the attacker", 0, 0, 0, 5),
                    new Player("Kroos, the midfielder", 0, 0, 0, 5),
                    new Player("Modric, the midfielder", 0, 0, 0, 5),
                    new Player("Benzema, the midfielder", 0, 0, 0, 5),
                    new Player("Raphael, the midfielder", 0, 0, 0, 5),
                    new Player("Bale, the defender", 0, 0, 0, 5),
                    new Player("Benzema, the defender", 0, 0, 0, 5),
                    new Player("Kane, the defender", 0, 0, 0, 5)
                    );
    }


}
