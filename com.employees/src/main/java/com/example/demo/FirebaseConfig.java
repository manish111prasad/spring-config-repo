package com.example.demo;

import java.io.IOException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

@Configuration
public class FirebaseConfig {
	@Bean
	public FirebaseApp firebaseApp() throws IOException {
		ClassPathResource res = new ClassPathResource("serviceAccountKey.json");
		FirebaseOptions opts = FirebaseOptions.builder()
				.setCredentials(GoogleCredentials.fromStream(res.getInputStream())).build();
		return FirebaseApp.getApps().isEmpty() ? FirebaseApp.initializeApp(opts) : FirebaseApp.getInstance();
	}
}
