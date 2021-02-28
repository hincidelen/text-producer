package com.sqills.assignment;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * A simple resource showing the last price.
 */
@Path("/send")
public class TextController {

    @Inject
    TextProducer priceProducer;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String last(@QueryParam("text") String text) {
        priceProducer.sendText(text);
        return "OK";
    }
}
