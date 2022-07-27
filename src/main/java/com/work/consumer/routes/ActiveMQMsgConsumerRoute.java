package com.work.consumer.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class ActiveMQMsgConsumerRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("activemq:my-queue")
                .to("log:received-message-from-active-mq");
    }
}


