package fantastic_stories_app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @GetMapping("/")
    public String getIndex() {
        return "index";
    }

    @RequestMapping("/backToMainPage")
    public ModelAndView backToMainPage() {
        return new ModelAndView("redirect:/");
    }

}
