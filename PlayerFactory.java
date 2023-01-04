import java.util.HashMap;
public class PlayerFactory {
    private static HashMap<String, Player> players = new HashMap<>();
    
    
    public static Player getPlayer(String position) {
        Player player = players.get(position);

        if (player == null) {
            player = new Player(position);
            players.put(position, player);
        }

        return player;
    }

}
