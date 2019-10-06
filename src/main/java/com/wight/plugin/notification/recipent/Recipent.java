package com.wight.plugin.notification.recipent;

import com.wight.plugin.notification.Notification;
import com.wight.plugin.notification.channel.Channel;

public interface Recipent {
    Object getRecipent();
    void sendMessage(Notification notification);
}
