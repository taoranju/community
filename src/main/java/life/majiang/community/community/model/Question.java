package life.majiang.community.community.model;

import lombok.Data;

/**
 * @ProjectName: community
 * @Package: life.majiang.community.community.model
 * @ClassName: Question
 * @Author: 陶然居
 * @Description:
 * @Date: 2019/10/13 18:01
 * @Version: 1.0
 */
@Data
public class Question {

    private Integer id;
    private String title;
    private String description;
    private String tag;
    private Long gmtCreate;
    private Long gmtModified;
    private Integer creator;
    private Integer viewCount;
    private Integer commentCount;
    private Integer likeCount;

}
