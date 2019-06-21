package com.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

/**
 * @author czg
 * @date 2019/2/23
 */
public class SpringJmsTemplateTest {

    public static void main(String args[]){
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("spring.xml");
        JmsTemplate jmsTemplate  = (JmsTemplate) app.getBean("ibmUserAndPasswordJmsTemplate");
        jmsTemplate.send(new MessageCreator() {
            @Override
            public Message createMessage(Session session) throws JMSException {
                TextMessage message = session.createTextMessage("Hello IBM MQ SPRING ");

                return message;
            }
        });

        System.out.println(jmsTemplate.receiveAndConvert().toString());
    }
}
