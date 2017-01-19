package com.turreta.apache.camel.demo;

import org.apache.camel.builder.RouteBuilder;

public class MyRouteBuilder extends RouteBuilder {
    @Override
    public void configure() throws Exception {
       // from("file:/C:/Users/sang018/Desktop/ksg/blog/First%20Encounter%20with%20Apache%20Camel/shared/in?move=./done")
         //       .to("file:/C:/Users/sang018/Desktop/ksg/blog/First%20Encounter%20with%20Apache%20Camel/shared/in/out");


        from("file:/C:/Users/sang018/Desktop/ksg/blog/First%20Encounter%20with%20Apache%20Camel/shared/in?noop=true")
                .to("file:/C:/Users/sang018/Desktop/ksg/blog/First%20Encounter%20with%20Apache%20Camel/shared/out");

    }
}
