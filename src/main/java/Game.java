import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Game {

    List<Player> players = new ArrayList<Player>();

    public void register(Player player) {
        players.add(player);
    }

    public Player findPlayer(String name) {
        for (Player player : players) {
            if (player.getName().equals(name)) {
                return player;
            }
        }
        return null;
    }

    public int round (String playerName1, String playerName2) {
        Player player1 = findPlayer(playerName1);
        Player player2 = findPlayer(playerName2);
        if (player1 == null) {
            throw new NotRegisteredException(playerName1);
        }
        if (player2 == null) {
            throw new NotRegisteredException(playerName2);
        }
        if (player1.getStrength() >  player2.getStrength()) {
            return 1;
        }
        else if (player1.getStrength() <  player2.getStrength()) {
            return 2;
        }
        else {
            return 0;
        }
    }
}
