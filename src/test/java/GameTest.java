import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GameTest {

    @Test

    public void testGameWhenFistPlayerWins() {
        Game game = new Game();
        Player player1 = new Player("Vova", 1,10);
        Player player2 = new Player("Kola", 2,9);
        game.register(player1);
        game.register(player2);
        int actual = game.round("Vova", "Kola");
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGameWhenSecondPlayerWins() {
        Game game = new Game();
        Player player1 = new Player("Vova", 1,10);
        Player player2 = new Player("Kola", 2,112);
        game.register(player1);
        game.register(player2);
        int actual = game.round("Vova", "Kola");
        int expected = 2;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testGameWhenDraw() {
        Game game = new Game();
        Player player1 = new Player("Vova", 1,10);
        Player player2 = new Player("Kola", 2,10);
        game.register(player1);
        game.register(player2);
        int actual = game.round("Vova", "Kola");
        int expected = 0;
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testGameWhenSecondPlayerNotRegister() {
        Game game = new Game();
        Player player1 = new Player("Vova", 1,10);
        game.register(player1);

        Assertions.assertThrows(NotRegisteredException.class, () -> game.round("Vova", "Kola"));
    }

    @Test
    public void testGameWhenFirstPlayerNotRegister() {
        Game game = new Game();
        Player player2 = new Player("Kola", 1,10);
        game.register(player2);
        Assertions.assertThrows(NotRegisteredException.class, () -> game.round("Vova", "Kola"));
    }

}
