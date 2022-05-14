package com.mycompany.dvdstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author k.milet
 */
@Controller
public class AboutUsController {

    @GetMapping("/about-us")
    public String displayFullDetails() {
        System.out.println("Tentative d'affichage de l'a-propos.");
        return "about-us";
    }
}
