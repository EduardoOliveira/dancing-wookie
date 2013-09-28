package pt.com.node.webserver.core.dao;


import com.github.jmkgreen.morphia.dao.BasicDAO;
import org.bson.types.ObjectId;
import pt.com.node.webserver.core.entity.Player;

public class PlayerDAO extends BasicDAO<Player,ObjectId> {



    public static PlayerDAO authenticate(String email, String password) {

        if(email.equals("eu")&&password.equals("bla")){
            return new PlayerDAO();
        }else{
            return null;
        }

    }
}
