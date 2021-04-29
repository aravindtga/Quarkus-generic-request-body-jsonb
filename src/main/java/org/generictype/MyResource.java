package org.generictype;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import io.smallrye.mutiny.Uni;

@Path("/endpoint")
public class MyResource {

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.APPLICATION_JSON)
    public Uni<String> hello(DataItem<Item> content) {
        return Uni.createFrom().item(content.getContent().toString());
    }
}