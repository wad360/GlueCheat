package com.wight.plugin.notification.channel;

import com.wight.plugin.notification.Notification;

public interface Channel {

    void processMessage(Notification notification);
}
