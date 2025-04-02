package kr.ac.kopo.smcmfmf.first_springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Example01Controller {
    public Example01Controller() {
    }

    @RequestMapping(
            value = {"/exam01"},
            method = {RequestMethod.GET}
    )
    public String requestMethod() {
        return "viewPage01";
    }

    @RequestMapping(
            value = {"/exam03"},
            method = {RequestMethod.GET}
    )
    @ResponseBody
    public String get() {
        return "@RestController getMessage 연습";
    }
}