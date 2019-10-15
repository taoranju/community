package life.majiang.community.community.controller;

import life.majiang.community.community.dto.PaginationDTO;
import life.majiang.community.community.dto.QuestionDTO;
import life.majiang.community.community.mapper.QuestionMapper;
import life.majiang.community.community.mapper.UserMapper;
import life.majiang.community.community.model.Question;
import life.majiang.community.community.model.User;
import life.majiang.community.community.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

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
    private UserMapper userMapper;

    @Autowired
    private QuestionService questionService;

    @GetMapping("/hello")
    public String hello(@RequestParam(name = "name") String name, HttpServletRequest request) {
//        String queryString = request.getQueryString();
//        System.out.println(queryString);
//        String[] splits = queryString.split("&");
//        for (String split:splits) {
//            if(split.contains("name")) {
//                String[] split1 = split.split("=");
//                String result = split1[1];
//                System.out.println(result);
//            }
//        }
//        System.out.println(request.getParameter("name"));
//        Object name1 = request.getAttribute("name");
//        System.out.println(name1);
//        request.setAttribute("name","help");
//        System.out.println(request.getAttribute("name"));
        return "index";
    }

    @GetMapping("/")
    public String index(HttpServletRequest request, Model model,
                        @RequestParam(value = "page", defaultValue = "1") Integer page,
                        @RequestParam(value = "size", defaultValue = "5") Integer size) {

        Cookie[] cookies = request.getCookies();
        if (cookies != null && cookies.length != 0) {
            for (Cookie cookie:cookies) {
                if(cookie.getName().equals("token")) {
                    String token = cookie.getValue();
                    User user = userMapper.findByToken(token);
                    if(user != null) {
                        request.getSession().setAttribute("user",user);
                    }
                    break;
                }
            }
        }

        PaginationDTO pagination = questionService.list(page, size);
        model.addAttribute("questions",pagination);

        return "index";
    }
}
