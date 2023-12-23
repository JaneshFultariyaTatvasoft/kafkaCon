package com.tatva.consumer;

import com.tatva.dto.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageListener {

    Logger log = LoggerFactory.getLogger(KafkaMessageListener.class);

    @KafkaListener(topics = "companyShare",groupId = "tatva-group")
    public void consumeEvents(User user) {
        log.info("consumer consume the events {} ", user.toString());
    }

    @KafkaListener(topics = "companyShareTransaction",groupId = "tatva-group-1")
    public void consumeEventsTransaction(User user) {
        log.info("consumer consume the events {} ", user.toString());
    }

    @KafkaListener(topics = "ipoListing",groupId = "tatva-group-2")
    public void consumeEventsIPOListing(User user) {
        log.info("consumer consume the events {} ", user.toString());
    }



}
