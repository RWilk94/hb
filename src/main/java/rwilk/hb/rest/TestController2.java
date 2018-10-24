package rwilk.hb.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController2 {

    @RequestMapping("/t")
    public String hello() {
        return "Hello Wereszczak";
    }
}
