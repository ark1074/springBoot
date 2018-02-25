package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/index1")
    public String index1(){
        return "Greetings from Spring Boot";
    }

    @RequestMapping("/index2")
    public String index2(){
        return "Greetings from Spring Boot - index2";
    }

}
