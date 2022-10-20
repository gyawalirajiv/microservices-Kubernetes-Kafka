package com.tutor.notificationservice.service;

import com.tutor.notificationservice.emailconfiguration.ApplicationConstant;
import com.tutor.notificationservice.entity.TutorEmail;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class NotificationSubscriber {
    private final Logger logger =
            LoggerFactory.getLogger(NotificationSubscriber.class);
    @Autowired
    TutorEmailNotificationService notificationService;

    @KafkaListener(topics = ApplicationConstant.TOPIC_NAME,groupId = ApplicationConstant.GROUP_ID)
    public void consume(@Payload TutorEmail email) {

        logger.info("Email to {} processing started.", email);//email.getTo()
        notificationService.sendEmail(email);
    }
}
