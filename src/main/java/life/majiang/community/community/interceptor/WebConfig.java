package life.majiang.community.community.interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @ProjectName: community
 * @Package: life.majiang.community.community.interceptor
 * @ClassName: WebConfig
 * @Author: 陶然居
 * @Description:
 * @Date: 2019/10/20 20:06
 * @Version: 1.0
 */

/**
 * @EnableWebMvc : 使用该注解需要自己添加配置文件
 */
//@EnableWebMvc
@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Autowired
    private SessionInterceptor sessionInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(sessionInterceptor).addPathPatterns("/**");
    }
}
