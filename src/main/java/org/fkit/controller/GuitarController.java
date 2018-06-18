package org.fkit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import org.fkit.model.Guitar;
import org.fkit.model.GuitarSpec;
import org.fkit.service.GuitarService;

@Controller
public class GuitarController {
	@Autowired
	GuitarService guitarService;
    @RequestMapping(value = "/search")
    public String guitar() {
        return "search";
    }
    @RequestMapping(value = "/NewFile")
    public String newfile() {
        return "NewFile";
    }
    @RequestMapping(value = "/show")
    public String show(GuitarSpec guitarSpec, Model model) {
        System.out.println(guitarSpec);
        List<Guitar> guitarList = guitarService.getGuitars(guitarSpec);
        model.addAttribute("guitarList", guitarList);
        return "show";
    }
}