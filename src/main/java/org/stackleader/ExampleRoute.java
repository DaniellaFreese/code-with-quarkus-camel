/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.stackleader;

import org.apache.camel.builder.RouteBuilder;

/**
 *
 * @author dfreese
 */
public class ExampleRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("direct:test")
            .setBody(exchange -> "hello from route")
            .log("logging output: " + "${body}"); 
    }
    
}
