package istio.demo.app2;

import istio.demo.App2Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController implements App2Service {
    @GetMapping
    public String test(@RequestParam(name="t", required = false) String t) {
        return "app2: " + t;
    }
}
