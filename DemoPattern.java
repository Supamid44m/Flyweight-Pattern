public class DemoPattern {
    private static final String[] positions = { "Point Guard", "Shooting Guard", "Small Forward", "Power Forward", "Center" };

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Player player = PlayerFactory.getPlayer(positions[i]);
            player.setPosition(positions[i]);
            player.showPosition();
        }

        
    }
}
