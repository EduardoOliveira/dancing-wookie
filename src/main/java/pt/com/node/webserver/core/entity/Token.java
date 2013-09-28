package pt.com.node.webserver.core.entity;

/**
 * Created with IntelliJ IDEA.
 * User: knoker
 * Date: 9/28/13
 * Time: 7:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class Token {
    public long expiration;
    public String token;

    public Token(String token, long expiration){
        this.token= token;
        this.expiration = expiration;
    }
}
