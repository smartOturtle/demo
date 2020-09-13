package testTele;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/hello")
public class ExampleResource {
    private final Client client = ClientBuilder.newClient();
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        Response resp = client.target("http://frontend").path("").request().get();
        return resp.getEntity().toString();
    }
}