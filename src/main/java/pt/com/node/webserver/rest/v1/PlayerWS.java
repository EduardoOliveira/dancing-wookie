package pt.com.node.webserver.rest.v1;

import pt.com.node.webserver.core.dao.PlayerDAO;
import pt.com.node.webserver.core.security.Tokenizer;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("player")
public class PlayerWS {

    @POST
    @Path("login")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response login(@FormParam("email") String email,
                          @FormParam("password") String password){
        System.out.println("qweqwewqewqe");
        System.out.println(email);
        System.out.println(password);
        PlayerDAO player= PlayerDAO.authenticate(email, password);

        if(player != null){
           return Response.status(401).build();
        }
//        return Response.status(Response.Status.OK).entity(obj).build();
        return Response.ok(Tokenizer.generate(player,60)).build();
    }



}
