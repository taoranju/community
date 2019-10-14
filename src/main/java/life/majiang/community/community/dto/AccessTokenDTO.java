package life.majiang.community.community.dto;

import lombok.Data;

/**
 * @ProjectName: community
 * @Package: life.majiang.community.community.dto
 * @ClassName: AccessTokenDTO
 * @Author: 陶然居
 * @Description:
 * @Date: 2019/10/7 19:59
 * @Version: 1.0
 */
@Data
public class AccessTokenDTO {

    private String client_id;
    private String client_secret;
    private String code;
    private String redirect_uri;
    private String state;

}
