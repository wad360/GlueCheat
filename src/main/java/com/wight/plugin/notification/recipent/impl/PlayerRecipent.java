package com.wight.plugin.notification.recipent.impl;

import com.wight.plugin.notification.Notification;
import com.wight.plugin.notification.recipent.Recipent;
import org.bukkit.entity.Player;

public class PlayerRecipent implements Recipent {


    @Override
    public Object getRecipent() {
        return null;
    }

    @Override
    public void sendMessage(Notification notification) {
        Player player = (Player)getRecipent();
        player.sendMessage(notification.);

    }
}
