package com.gp.controller;

import com.gp.domain.SampleDTO;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Log4j
@Controller
public class HelloController {

    @RequestMapping("/")
    public String home(SampleDTO dto){

      log.info("" + dto);
        return "index";
    }
}
