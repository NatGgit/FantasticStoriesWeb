package fantastic_stories_app.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class IndexController {

    @RequestMapping("/")
    public ModelAndView indexGet(Model model) {
        return new ModelAndView("index");
    }

}
