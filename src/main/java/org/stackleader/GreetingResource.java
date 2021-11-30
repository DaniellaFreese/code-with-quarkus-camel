package org.stackleader;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import org.apache.camel.ProducerTemplate;

@Path("/hello")
public class GreetingResource {

    @Inject
    ProducerTemplate producer;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/helloRoute")
    public String helloRoute() {
        String requestBody = producer.requestBody("direct:test", "danny", String.class);
        return requestBody;
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello RESTEasy";
    }
}
