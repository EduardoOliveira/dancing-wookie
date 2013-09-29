package pt.com.node.webserver.core.dao;


import com.github.jmkgreen.morphia.dao.BasicDAO;
import pt.com.node.webserver.core.Core;
import pt.com.node.webserver.core.entity.Entity;

/**
 * Created with IntelliJ IDEA.
 * User: knoker
 * Date: 9/28/13
 * Time: 9:41 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class DAO extends BasicDAO<Entity,String>{

    public DAO(){
        super(Core.getMongo(), Core.getMorphia(), Core.getDBName());
    }
}
