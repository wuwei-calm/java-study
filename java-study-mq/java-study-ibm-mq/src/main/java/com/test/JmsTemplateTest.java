package com.test;


import com.ibm.mq.MQEnvironment;
import com.ibm.mq.jms.MQQueue;
import com.ibm.mq.jms.MQQueueConnectionFactory;
import org.springframework.jms.connection.CachingConnectionFactory;
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
public class JmsTemplateTest {

    public static void main(String args[]) throws Exception{
        MQQueueConnectionFactory mqf = new MQQueueConnectionFactory();
        mqf.setHostName("127.0.0.1");
        mqf.setPort(1414);
        mqf.setCCSID(1381);
        mqf.setQueueManager("QM1");
        mqf.setChannel("CHANNEL_SERVER");
        mqf.setTransportType(1);

        CachingConnectionFactory cachingConnectionFactory = new CachingConnectionFactory();
        cachingConnectionFactory.setTargetConnectionFactory(mqf);
        cachingConnectionFactory.setSessionCacheSize(10);

        MQQueue mqQueue = new MQQueue();
        mqQueue.setBaseQueueName("QM1_LOCAL");
        JmsTemplate jmsTemplate = new JmsTemplate();
        jmsTemplate.setDefaultDestination(mqQueue);
        jmsTemplate.setConnectionFactory(cachingConnectionFactory);
        jmsTemplate.setPubSubDomain(false);



        jmsTemplate.send(new MessageCreator() {
            @Override
            public Message createMessage(Session session) throws JMSException {
                TextMessage message = session.createTextMessage();
                message.setText("Hello Message");
                return message;
            }
        });
        System.out.println("Hello");
    }
}
