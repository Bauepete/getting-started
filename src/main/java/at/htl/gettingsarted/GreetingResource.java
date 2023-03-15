package at.htl.gettingsarted;

import at.htl.gettingsarted.entity.Person;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN}) // supports both media types and decides based on accept header
    public Person hello() {
        return new Person("John", "Doe");
    }
}