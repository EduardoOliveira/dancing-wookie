package pt.com.node.webserver.core;

/**
 * Created with IntelliJ IDEA.
 * User: knoker
 * Date: 9/28/13
 * Time: 9:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class Core {
    private static Core instance = null;

    private Core(){

    }

    public static Core getInstance(){
        return (instance==null?(insance=new Core()):instance);
    }

}