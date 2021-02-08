package sdflower80.study.spring4mvc.controller.hello;

import org.springframework.web.bind.annotation.*;

@RestController
public class FooPathController {

    @GetMapping("/foos/{id}")
    public String findFoo(
            @PathVariable
            Long id,
            @RequestParam(value = "mode", required = false)
            String mode
    ) {
        return "foo_" + id + ", mode=" + mode;
    }

    @GetMapping("/foos/by-name/{name}")
    public String findFooByName(
            @PathVariable
            String name
    ) {
        return "foo_" + name;
    }

    @GetMapping("/foos/by-no-grade/{no}/{grade}")
    public String findFooByNoAndGrade(
            @PathVariable
            Long no,
            @PathVariable
            String grade
    ) {
        return "foo_" + no + "_" + grade;
    }
}
