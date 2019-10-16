package life.majiang.community.community.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: community
 * @Package: life.majiang.community.community.dto
 * @ClassName: PaginationDTO
 * @Author: 陶然居
 * @Description:
 * @Date: 2019/10/15 22:08
 * @Version: 1.0
 */
@Data
public class PaginationDTO {

    private List<QuestionDTO> questions;
    private Boolean showPrevious;
    private Boolean showFirstPage;
    private Boolean showNext;
    private Boolean showEndPage;
    private Integer page;
    /**
     * List需要初始化，否则回报空指针异常
     */
    private List<Integer> pages = new ArrayList<>();
    private Integer totalPage;

    public void setPagination(Integer totalCount, Integer page, Integer size) {
        if (totalCount % size == 0) {
            totalPage = totalCount/size;
        } else {
            totalPage = totalCount/size + 1;
        }

        this.page = page;

        pages.add(page);

        for (int i = 1; i <= 3; i++) {
            if (page - i > 0) {
                pages.add(0,page-i);
            }
            if (page + i <= totalPage) {
                pages.add(page+i);
            }
        }
        /**
         * 是否展示上一页
         */
        if (page == 1) {
            showPrevious = false;
        } else {
            showPrevious = true;
        }

        /**
         * 是否展示下一页
         */
        if (page == totalPage) {
            showNext = false;
        } else {
            showNext = true;
        }

        /**
         * 是否展示首页
         */
        if (pages.contains(1)) {
            showFirstPage = false;
        } else {
            showFirstPage = true;
        }

        /**
         * 是否展示最后一页
         */
        if (pages.contains(totalPage)) {
            showEndPage = false;
        } else {
            showEndPage = true;
        }
    }
}
