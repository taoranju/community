package life.majiang.community.community.controller;

import life.majiang.community.community.mapper.QuestionMapper;
import life.majiang.community.community.model.Question;
import life.majiang.community.community.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

/**
 * @ProjectName: community
 * @Package: life.majiang.community.community.controller
 * @ClassName: PublishController
 * @Author: 陶然居
 * @Description:
 * @Date: 2019/10/9 22:33
 * @Version: 1.0
 */

@Controller
public class PublishController {

    @Autowired
    private QuestionMapper questionMapper;

    @GetMapping("/publish")
    public String publish() {
        return "publish";
    }

    @PostMapping("/publish")
    public String doPublish(@RequestParam(value = "title",required = false) String title,
                            @RequestParam(value = "description",required = false) String description,
                            @RequestParam(value = "tag",required = false) String tag,
                            HttpServletRequest request,
                            Model model
                            ) {

        //保存输入信息，页面展示
        model.addAttribute("title",title);
        model.addAttribute("description",description);
        model.addAttribute("tag",tag);

        //校验逻辑，一般前端处理
        if(title == null || title == "") {
            model.addAttribute("error","标题不能为空");
            return "publish";
        }
        if(description == null || description == "") {
            model.addAttribute("error","问题补充不能为空");
            return "publish";
        }
        if(tag == null || tag == "") {
            model.addAttribute("error","标签不能为空");
            return "publish";
        }

        //判断用户是否登录
        User user = (User) request.getSession().getAttribute("user");

        //添加报错信息
        if (user == null) {
            model.addAttribute("error","用户未登录");
            return "publish";
        }

        System.out.println(user);
        Question question = new Question();
        question.setTitle(title);
        question.setDescription(description);
        question.setTag(tag);
        question.setCreator(user.getId());
        question.setGmtCreate(System.currentTimeMillis());
        question.setGmtModified(question.getGmtCreate());

        questionMapper.create(question);

        return "redirect:/";
    }
}
