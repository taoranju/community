package life.majiang.community.community.dto;

import lombok.Data;

/**
 * @ProjectName: community
 * @Package: life.majiang.community.community.dto
 * @ClassName: CommentDTO
 * @Author: 陶然居
 * @Description:
 * @Date: 2019/11/11 23:13
 * @Version: 1.0
 */
@Data
public class CommentDTO {
    private Long parentId;
    private String content;
    private Integer type;
}
