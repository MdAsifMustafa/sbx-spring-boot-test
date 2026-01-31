package io.github.asifmustafamd.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	 @Value("${spring.profiles.active:default}")
	    private String profile;

    @GetMapping("/hello")
    public String hello() {
    	  return "hello (" + profile + ")";
    }
}
