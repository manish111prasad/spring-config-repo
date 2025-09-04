package com.example.demomini.controller;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.boot.info.BuildProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class BuildInfoController {
  private final BuildProperties build;

  public BuildInfoController(ObjectProvider<BuildProperties> provider) {
    this.build = provider.getIfAvailable();
  }

  @GetMapping("/build")
  public Map<String, Object> buildInfo() {
    if (build == null) {
      return Map.of("info", "build-info not generated yet. Run 'mvn spring-boot:build-info' or build with Jenkins.");
    }
    return Map.of(
        "name", build.getName(),
        "version", build.getVersion(),
        "time", build.getTime().toString()
    );
  }
}
