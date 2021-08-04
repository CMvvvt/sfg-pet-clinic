package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author cmchenming13@gmail.com
 * @date 2021/8/4 19:31
 */

@Controller
public class IndexController {

    @RequestMapping({"","/","index","index.html"})
    public String index() {
        return "index";
    }
}
