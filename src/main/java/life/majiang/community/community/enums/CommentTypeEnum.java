package life.majiang.community.community.enums;

/**
 * @ProjectName: community
 * @Package: life.majiang.community.community.enums
 * @ClassName: CommentTypeEnum
 * @Author: 陶然居
 * @Description:
 * @Date: 2019/11/11 23:48
 * @Version: 1.0
 */
public enum CommentTypeEnum {
    QUESTION(1),
    COMMENT(2);
    private Integer type;

    public Integer getType() {
        return type;
    }

    CommentTypeEnum(Integer type) {
        this.type = type;
    }
}
