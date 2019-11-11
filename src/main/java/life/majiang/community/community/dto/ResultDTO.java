package life.majiang.community.community.dto;

import lombok.Data;

/**
 * @ProjectName: community
 * @Package: life.majiang.community.community.dto
 * @ClassName: ResultDTO
 * @Author: 陶然居
 * @Description:
 * @Date: 2019/11/11 23:41
 * @Version: 1.0
 */
@Data
public class ResultDTO {
    private Integer code;
    private String message;

    public static ResultDTO errorOf(Integer code, String message) {
        ResultDTO resultDTO = new ResultDTO();
        resultDTO.setCode(code);
        resultDTO.setMessage(message);
        return resultDTO;
    }
}
