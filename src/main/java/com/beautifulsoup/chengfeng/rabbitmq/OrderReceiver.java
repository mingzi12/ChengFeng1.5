package com.beautifulsoup.chengfeng.rabbitmq;

import com.beautifulsoup.chengfeng.constant.ChengfengConstant;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RabbitListener(queues = ChengfengConstant.RabbitMQ.ORDER_QUEUE_NAME)
public class OrderReceiver {

    @RabbitHandler
    public void process(String message){
        log.warn("order receive: "+message);
    }
}
