package ie.atu.lab1week3;

import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/calculate")
    public String calculate(@RequestParam int x, @RequestParam int y,@RequestParam String type){
        int ans=0;

        switch(type){
            case "add":
                ans= x+y;
                break;
            case "subtract":
                ans= x-y;
                break;
            case "multiply":
                ans= x*y;
                break;
            case "divide":
                if (y==0){
                 String error = "zero error";
                 return error;
                }
                ans = x/y;
                break;
            default :
                ans=0;
        }

        return "if you "+ type + " " + x + " and " + y + " the answer is " + ans;
    }
}