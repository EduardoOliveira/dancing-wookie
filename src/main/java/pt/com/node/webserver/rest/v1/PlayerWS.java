package pt.com.node.webserver.rest.v1;


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

        //return Response.status(401).build();

//        return Response.status(Response.Status.OK).entity(obj).build();
        return Response.ok("").build();

    }
}
