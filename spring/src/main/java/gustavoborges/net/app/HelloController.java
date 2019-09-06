package gustavoborges.net.app;

import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

  @RequestMapping("/app")
  public Map<String, String> index() {
    return Collections.singletonMap("description", "Comunidade Devops na Campus");
  }

}