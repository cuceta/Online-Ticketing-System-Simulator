package com.example.websocket;

public class WebSocketMessageSender {
    public static void main(String[] args) throws InterruptedException {
        // Simulate periodic messages being sent
        for (int i = 1; i <= 5; i++) {
            ResultWebSocket.sendMessage("Update " + i);
            Thread.sleep(2000);  // Wait 2 seconds between updates
        }
    }
}
