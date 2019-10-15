package life.majiang.community.community.dto;

import lombok.Data;

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
    private boolean showPrevious;
    private boolean showFirstPage;
    private boolean showNext;
    private boolean showEndPage;
    private Integer page;
    private List<Integer> pages;

    public void setPagination(Integer totalCount, Integer page, Integer size) {

        int totalPage;
        if (totalCount % size == 0) {
            totalPage = totalCount/size;
        } else {
            totalPage = totalCount/size + 1;
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
