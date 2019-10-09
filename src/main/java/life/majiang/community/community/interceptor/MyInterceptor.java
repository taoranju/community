package life.majiang.community.community.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ProjectName: community
 * @Package: life.majiang.community.community.interceptor
 * @ClassName: MyInterceptor
 * @Author: 陶然居
 * @Description:
 * @Date: 2019/10/9 21:31
 * @Version: 1.0
 */

public class MyInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String queryString = request.getQueryString();
        System.out.println(queryString);
        request.setAttribute("name","help");
        System.out.println(request.getParameter("name"));
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
