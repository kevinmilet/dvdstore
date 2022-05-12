package com.mycompany.dvdstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author k.milet
 */
@Controller
public class AboutUsController {

    @RequestMapping("/about-us")
    public String displayFullDetails() {
        System.out.println("Tentative d'affichage de l'a-propos.");
        return "about-us";
    }
}
