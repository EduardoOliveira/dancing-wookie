package pt.com.node.webserver.core.dao;


import org.bson.types.ObjectId;
import pt.com.node.webserver.core.entity.Player;

public class PlayerDAO extends DAO<Player,ObjectId> {



    public static Player authenticate(String email, String password) {

        if(email.equals("eu")&&password.equals("bla")){
            return new Player();
        }else{
            return null;
        }

    }
}
