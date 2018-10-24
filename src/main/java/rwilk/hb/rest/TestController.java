package rwilk.hb.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/1")
    public String hello() {
        return "Hello World";
    }

    @RequestMapping("/2")
    public String hello2() {
        return "Hello World 2";
    }

}
