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
    private String message;

    public CustomizeException(ICustomizeErrorCode errorCode) {
        this.message = errorCode.getMessage();
    }

    public CustomizeException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
