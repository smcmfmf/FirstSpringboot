package kr.ac.kopo.smcmfmf.first_springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/test"})
public class Example03Controller {
    public Example03Controller() {
    }

    @GetMapping({"/exam04"})
    public String requestMethod() {
        return "requestTest";
    }
}
