import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {

    @Test
    void shouldNotifyAPlayer() {
        Master dm = new Master("Rafael", "Ataque");
        Player player = new Player("Pureza");
        player.dungeonMaster(dm);
        dm.rollAction();
        assertEquals("Pureza foi solicitado pelo Dungeon Master Rafael à realizar a rolagem para a ação de Ataque.", Player.getNotifyRoll());
    }

    @Test
    void shouldNotifyPlayers() {
        Master dm = new Master("Rafael", "Ataque");
        Player player1 = new Player("Pureza");
        Player player2 = new Player("Felipe");
        player1.dungeonMaster(dm);
        player2.dungeonMaster(dm);
        dm.rollAction();
        assertEquals("Pureza foi solicitado pelo Dungeon Master Rafael à realizar a rolagem para a ação de Ataque.", Player1.getNotifyRoll());
        assertEquals("Felipe foi solicitado pelo Dungeon Master Rafael à realizar a rolagem para a ação de Ataque.", Player2.getNotifyRoll());
    }

    @Test
    void shouldNotNotifyAPlayer() {
        Master dm = new Master("Rafael", "Ataque");
        Player player = new Player("Pureza");
        dm.rollAction();
        assertEquals(null, Player.getNotifyRoll());
    }

    @Test
    void shouldNotifyPlayerMasterA() {
        Master dmA = new Master("Rafael", "Ataque");
        Master dmB = new Master("Isabella", "Ataque");
        Player player1 = new Player("Pureza");
        Player player2 = new Player("Felipe");
        player1.dungeonMaster(dmB);
        player2.dungeonMaster(dmB);
        dmA.rollAction();
        assertEquals("Pureza foi solicitado pelo Dungeon Master Rafael à realizar a rolagem para a ação de Ataque.", Player1.getNotifyRoll());
        assertEquals(null, Player2.getNotifyRoll());
    }
}
