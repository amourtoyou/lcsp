package com.yx.lcsp;

import com.yx.lcsp.service.MessageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LcspController {
    private static final Logger log = LoggerFactory.getLogger(LcspController.class);

    @Autowired
    private MessageService service;

    @PostMapping(value = "/lcsp")
    @CrossOrigin(methods = {RequestMethod.POST}, origins = "*")
    public String handleMessage(@RequestBody String jsonStr) {
        return service.handleMsg(jsonStr);
    }

}
