package life.majiang.community.community.interceptor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @ProjectName: community
 * @Package: life.majiang.community.community.interceptor
 * @ClassName: WebMvcConfigurer
 * @Author: 陶然居
 * @Description:
 * @Date: 2019/10/9 21:35
 * @Version: 1.0
 */
@Configuration
public class MyConfig implements WebMvcConfigurer {
    @Bean
    public WebMvcConfigurer webMvcConfigurer() {

        WebMvcConfigurer adapter = new WebMvcConfigurer() {
            /**
             * 注册拦截器
             * @param registry
             */
            @Override
            public void addInterceptors(InterceptorRegistry registry) {
                //springboot已经做好了静态资源映射
                registry.addInterceptor(new MyInterceptor()).addPathPatterns("/**");
            }
        };
        return adapter;
    }

}
