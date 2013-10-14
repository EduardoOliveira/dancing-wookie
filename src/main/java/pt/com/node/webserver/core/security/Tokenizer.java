package pt.com.node.webserver.core.security;

import pt.com.node.webserver.core.entity.Player;
import pt.com.node.webserver.core.entity.Token;

/**
 * Created with IntelliJ IDEA.
 * User: knoker
 * Date: 9/28/13
 * Time: 6:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class Tokenizer {
    private static long DEFAULT_DURATION = 60;

    public static Token generate(Player player){
        return Tokenizer.generate(player,DEFAULT_DURATION);
    }

    public static Token generate(Player player, long duration) {
        return  new Token(player.toString(),duration);
    }

}
