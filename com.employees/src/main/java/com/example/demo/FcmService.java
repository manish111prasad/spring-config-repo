package com.example.demo;

import org.springframework.stereotype.Service;

import com.google.firebase.FirebaseApp;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingException;
import com.google.firebase.messaging.Message;

@Service
public class FcmService {
	private final FirebaseMessaging fcm;

	public FcmService(FirebaseApp app) {
		this.fcm = FirebaseMessaging.getInstance(app);
	}

	public String sendPush(String token, String title, String body) throws FirebaseMessagingException {

		// build the Notification via its builder (no public)
		com.google.firebase.messaging.Notification notif = com.google.firebase.messaging.Notification.builder()
				.setTitle(title).setBody(body).build();

		// attach it to your Message
		Message msg = Message.builder().setToken(token).setNotification(notif).build();

		return fcm.send(msg);
	}
}
