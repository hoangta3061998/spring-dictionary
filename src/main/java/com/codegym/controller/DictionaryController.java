package com.codegym.controller;


import com.codegym.service.DictionaryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping({"/dictionary"})
public class DictionaryController {
    private DictionaryService dictionaryService = new DictionaryService();

    public DictionaryController() {
    }

    @GetMapping({"/search"})
    public String search(@RequestParam String key, Model model) {
        String result = dictionaryService.search(key);
        model.addAttribute("key", key);
        model.addAttribute("result", result);
        return "/dictionary/search";
    }
    @GetMapping({"/index"})
    public String index(){
        return "/dictionary/index";
    }
}
