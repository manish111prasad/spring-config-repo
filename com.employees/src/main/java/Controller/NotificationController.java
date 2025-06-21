package Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.FcmService;

import Model.NotifyRequest;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/notify")
public class NotificationController {
  private final FcmService fcm;

  public NotificationController(FcmService fcm) {
    this.fcm = fcm;
  }
  
  

  @PostMapping
  public ResponseEntity<String> notify(@RequestBody NotifyRequest req) {
	  log.info("Inside Controller");
    try {
      String id = fcm.sendPush(req.getToken(), req.getTitle(), req.getBody());
      return ResponseEntity.ok("Sent: " + id);
    } catch (Exception e) {
      return ResponseEntity.status(500).body(e.getMessage());
    }
  }
}

