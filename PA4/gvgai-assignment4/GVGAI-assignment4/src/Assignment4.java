import java.lang.annotation.Repeatable;
import java.sql.Time;
import java.util.Random;
import core.competition.CompetitionParameters;
import java.util.Date;
import java.text.SimpleDateFormat;
import core.ArcadeMachine;

/**
 * Created with IntelliJ IDEA.
 * User: Diego
 * Date: 04/10/13
 * Time: 16:29
 * This is a Java port from Tom Schaul's VGDL - https://github.com/schaul/py-vgdl
 */
public class Assignment4
{

    public static void main(String[] args)
    {
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(d));
        //Reinforcement learning controllers:
    	String rlController = "controllers.learningmodel.Agent";
        
        //Only freeway game
        String game = "examples/gridphysics/freeway.txt";
        String level = "examples/gridphysics/freeway_lvl";

        //Other settings
        boolean visuals = false;
        int seed = new Random().nextInt();

        //Game and level to play
        
        // Monte-Carlo RL training
        CompetitionParameters.ACTION_TIME = 1000000;
        //ArcadeMachine.runOneGame(game, level, visuals, rlController, null, seed, false);
        //String level2 = gamesPath + games[gameIdx] + "_lvl" + 1 +".txt";
        for(int i=0; i<50; i++){
            String levelfile = level + "0.txt";
            ArcadeMachine.runOneGame(game, levelfile, visuals, rlController, null, seed, false);
        }
        
    }
}