package life.majiang.community.community.exception;

/**
 * @ProjectName: community
 * @Package: life.majiang.community.community.exception
 * @ClassName: CustomizeErrorCode
 * @Author: 陶然居
 * @Description:
 * @Date: 2019/11/10 15:24
 * @Version: 1.0
 */
public enum  CustomizeErrorCode implements ICustomizeErrorCode {

    QUESTION_NOT_FOUND(2001,"你要找的问题不存在");

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    private Integer code;
    private String message;

    CustomizeErrorCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
