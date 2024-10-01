package ie.atu.lab1week3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/person")
public  class Week3 {

    @GetMapping("/message")
    public String getMessage(){

        return "Some Message";
    }
    @GetMapping("/details")
    public String getDetails(){

        return "Some other Message";
    }
@GetMapping("/hello")
    public String hello(){
        return "hello";
    }
    @GetMapping("/greet/{name}")
    public String greetByName(@PathVariable String name) {
        return "Hi " + name;
    }
}