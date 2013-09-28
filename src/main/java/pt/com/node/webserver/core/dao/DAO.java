package pt.com.node.webserver.core.dao;

import com.github.jmkgreen.morphia.Datastore;
import com.github.jmkgreen.morphia.Morphia;
import com.github.jmkgreen.morphia.dao.BasicDAO;
import com.mongodb.Mongo;

/**
 * Created with IntelliJ IDEA.
 * User: knoker
 * Date: 9/28/13
 * Time: 9:41 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class DAO extends BasicDAO<T,K>{

    protected DAO(Class<T> entityClass, Mongo mongo, Morphia morphia, String dbName) {
        super(entityClass, mongo, morphia, dbName);
    }

    protected DAO(Class<T> entityClass, Datastore ds) {
        super(entityClass, ds);
    }

    protected DAO(Datastore ds) {
        super(ds);
    }

    protected DAO(Mongo mongo, Morphia morphia, String dbName) {

    }

    public DAO(){
        Core.getDB().getMongo();
        Core.getDB().getMorphia();
        Core.getDB().getDBName();
        super(mongo, morphia, dbName);
    }
}
