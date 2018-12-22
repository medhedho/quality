
package ecommerce.Web;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @Secured("ROLE_HERO")
    @RequestMapping("/hedi")
    public String hedi() {
        return "Hedi";
    }

    @RequestMapping("/helloworld")
    public TheHello helloworld(@RequestParam(value="name", defaultValue="World") String name) {
        return new TheHello(counter.incrementAndGet(), String.format(template, name));
    }

}
