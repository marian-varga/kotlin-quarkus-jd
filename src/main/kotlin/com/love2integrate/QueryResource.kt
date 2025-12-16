package com.love2integrate

import jakarta.ws.rs.GET
import jakarta.ws.rs.Path
import jakarta.ws.rs.Produces
import jakarta.ws.rs.core.MediaType

@Path("/test")
class QueryResource(val myRepository: MyRepository) {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    fun hello(): String {
        val list = myRepository.findAll()?.toList()
        return "Found " + list?.size + " records"
    }
}