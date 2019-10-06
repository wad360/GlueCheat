package com.wight.plugin.notification;

import com.wight.plugin.notification.channel.Channel;
public class Notification {


    public final String getContent(){
        return "";
    }

    public Notification(com.wight.plugin.notification.channel.Channel channel, Type type){
        channel.processMessage(this);
    }



    public enum Type {
        ASYNC,
        DEFAULT;

    }

    public enum Channel {
        PUBLIC,
        PLAYER,
        ADMINISTRATOR,
        CONSOLE;




    }

}

