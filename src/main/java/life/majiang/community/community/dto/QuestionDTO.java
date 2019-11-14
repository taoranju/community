package life.majiang.community.community.dto;

import life.majiang.community.community.model.User;
import lombok.Data;

/**
 * @ProjectName: community
 * @Package: life.majiang.community.community.dto
 * @ClassName: QuestionDTO
 * @Author: 陶然居
 * @Description:
 * @Date: 2019/10/14 20:46
 * @Version: 1.0
 */
@Data
public class QuestionDTO {

    private Long id;
    private String title;
    private String description;
    private String tag;
    private Long gmtCreate;
    private Long gmtModified;
    private Integer creator;
    private Integer viewCount;
    private Integer commentCount;
    private Integer likeCount;
    private User user;
}
