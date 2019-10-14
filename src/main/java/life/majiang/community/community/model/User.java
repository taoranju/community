package life.majiang.community.community.model;

import lombok.Data;

/**
 * @ProjectName: community
 * @Package: life.majiang.community.model
 * @ClassName: User
 * @Author: 陶然居
 * @Description:
 * @Date: 2019/10/8 21:01
 * @Version: 1.0
 */
@Data
public class User {

    private Integer id;
    private String name;
    private String accountId;
    private String token;
    private Long gmtCreate;
    private Long gmtModified;
    private String avatarUrl;

}
