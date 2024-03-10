package plugin.enemydown.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import plugin.enemydown.mapper.data.PlayerScore;

import java.util.List;

public interface PlayerScoreMapper {

    @Select("select * from player_score")
    List<PlayerScore> selectList();

    @Insert("insert into player_score (player_name, score, difficulty, registered_dt) values (#{playerName}, #{score}, #{difficulty}, now());")
    int insert(PlayerScore playerScore);
}
