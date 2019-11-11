package life.majiang.community.community.exception;

/**
 * @ProjectName: community
 * @Package: life.majiang.community.community.exception
 * @ClassName: CustomizeException
 * @Author: 陶然居
 * @Description:
 * @Date: 2019/11/10 15:08
 * @Version: 1.0
 */
public class CustomizeException extends RuntimeException {
    private Integer code;
    private String message;

    public CustomizeException(ICustomizeErrorCode errorCode) {
        this.code = errorCode.getCode();
        this.message = errorCode.getMessage();
    }

    @Override
    public String getMessage() {
        return message;
    }

    public Integer getCode() {
        return code;
    }
}
