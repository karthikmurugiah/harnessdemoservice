package org.example.harnessdemoservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/harness")
public class Controller {

    @GetMapping
    public String home() {
        log.debug("Tracing..");
        return "Done!";
    }
}

