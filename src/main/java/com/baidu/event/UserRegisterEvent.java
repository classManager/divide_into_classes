package com.baidu.event;

import org.springframework.context.ApplicationEvent;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 定义用户注册事件
 * ApplicationEvent是由Spring提供的所有Event类的基类，为了简单起见，
 * 注册事件只传递了name（可以复杂的对象，但注意要了解清楚序列化机制）。
 * Created by lt on 17/05/10.
 */
public class UserRegisterEvent extends ApplicationEvent {

    public UserRegisterEvent(Object name) {
        super(name);
        ExecutorService e = Executors.newFixedThreadPool(1);
        String[] str = "a,b,c".split(",");
    }
}
