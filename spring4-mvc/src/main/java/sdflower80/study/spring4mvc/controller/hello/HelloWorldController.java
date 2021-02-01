package sdflower80.study.spring4mvc.controller.hello;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {

    private static final Logger logger = LogManager.getLogger(HelloWorldController.class.getName());

    @ResponseBody
    @GetMapping("/hello-world")
    public String helloWorld() {
        logger.info("test");
        return "Hello World";
    }
}
