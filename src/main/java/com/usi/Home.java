package com.usi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class Home {
    @RequestMapping(value = "/visual-earthquakes", method = RequestMethod.GET)
    public String showVisualEarthquakes(){
        return "visual-earthquakes";
    }
}
