package plugin.enemydown.command;

import org.bukkit.entity.Player;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import plugin.enemydown.Main;

class EnemyDownCommandTest {

    @Mock
    Main main;

    @Test
    void difficultyがeasyの時にeasyの文字列が返ること(){
    EnemyDownCommand sut = new EnemyDownCommand(main);
    Player player = Mockito.mock(Player.class);

    String actual = sut.getDifficulty(player, new String[]{"normal"});
        Assertions.assertEquals("easy", actual);
    }

}