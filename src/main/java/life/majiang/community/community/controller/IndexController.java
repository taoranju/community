package life.majiang.community.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ProjectName: community
 * @Package: life.majiang.community.community.controller
 * @ClassName: HelloController
 * @Author: 陶然居
 * @Description:
 * @Date: 2019/10/6 22:31
 * @Version: 1.0
 */

@Controller
public class IndexController {

    @GetMapping("/hello")
    public String hello(@RequestParam(name = "name") String name, Model model) {
        model.addAttribute("name",name);
        return "index";
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }
}
