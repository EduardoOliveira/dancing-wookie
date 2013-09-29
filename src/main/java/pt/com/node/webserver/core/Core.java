package pt.com.node.webserver.core;

import com.github.jmkgreen.morphia.Morphia;
import com.mongodb.Mongo;

/**
 * Created with IntelliJ IDEA.
 * User: knoker
 * Date: 9/28/13
 * Time: 9:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class Core {
    private static Core instance = null;


    private static Mongo MONGO;
    private static Morphia MORPHIA;
    private static String DB_NAME;

    private Core(){

    }

    public static void init(String[] dbs){
        instance = new Core();
    }

    public static String getDBName() {
        return DB_NAME;
    }

    public static Morphia getMorphia() {
        return MORPHIA;
    }

    public static Mongo getMongo() {
        return MONGO;
    }
}