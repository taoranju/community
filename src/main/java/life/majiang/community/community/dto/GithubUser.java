package life.majiang.community.community.dto;

import lombok.Data;

/**
 * @ProjectName: community
 * @Package: life.majiang.community.community.dto
 * @ClassName: GithubUser
 * @Author: 陶然居
 * @Description:
 * @Date: 2019/10/7 20:28
 * @Version: 1.0
 */
@Data
public class GithubUser {

    private String login;
    private Long id;
    private String bio;
    private String avatar_url;

}
