package life.majiang.community.community.controller;

import life.majiang.community.community.dto.PaginationDTO;
import life.majiang.community.community.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

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

    @Autowired
    private QuestionService questionService;

//    @GetMapping("/")
//    public String index() {
//        return "index";
//    }

    @GetMapping("/")
    public String index(Model model,
                        @RequestParam(name = "page", defaultValue = "1") Integer page,
                        @RequestParam(name = "size", defaultValue = "6") Integer size) {

        PaginationDTO pagination = questionService.list(page, size);
        model.addAttribute("pagination",pagination);

        return "index";
    }
}
