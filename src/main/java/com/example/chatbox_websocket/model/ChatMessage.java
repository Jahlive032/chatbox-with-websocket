package com.example.chatbox_websocket.model;

import lombok.Getter;
import lombok.Setter;

import java.awt.*;


public class ChatMessage {

    @Getter
    @Setter
    private String content;

    @Getter
    @Setter
    private String sender;

    @Getter
    @Setter
    private MessageType type;

    @Getter
    @Setter
    private String time;

    public enum MessageType {
        CHAT, // Lorsque l'utilisateur envoie un message
        JOIN, // Lorsque l'utilisateur rejoint un chat
        LEAVE // Lorsque l'utilisateur quitte un chat
    }
}
