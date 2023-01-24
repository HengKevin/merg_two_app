//package com.samples.flironecamera;
//
//public class SlackMessageSender {
//    public static void sendMessage(String webhookUrl, String message) {
//        WebhookClient client = new WebhoolClient(webhookUrl);
//        Payload payload = Payload.builder()
//                    .text(message)
//                    .build();
//        WebhookResponse response = client.send(payload);
//        if (!response.isOk()) {
//            System.err.println("Error sending message to Slack: " + response.getError());
//        }
//    }
//}
