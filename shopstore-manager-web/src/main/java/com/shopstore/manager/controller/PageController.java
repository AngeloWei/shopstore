package com.shopstore.manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class PageController {

    @RequestMapping(value = "/page/{pageName}" )
    public String getPage(@PathVariable("pageName") String pageName) {
            return pageName;
    }
}
