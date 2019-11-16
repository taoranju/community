package life.majiang.community.community.service;

import life.majiang.community.community.enums.CommentTypeEnum;
import life.majiang.community.community.exception.CustomizeErrorCode;
import life.majiang.community.community.exception.CustomizeException;
import life.majiang.community.community.mapper.CommentMapper;
import life.majiang.community.community.mapper.QuestionExtendMapper;
import life.majiang.community.community.mapper.QuestionMapper;
import life.majiang.community.community.model.Comment;
import life.majiang.community.community.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ProjectName: community
 * @Package: life.majiang.community.community.service
 * @ClassName: CommentService
 * @Author: 陶然居
 * @Description:
 * @Date: 2019/11/11 23:51
 * @Version: 1.0
 */
@Service
public class CommentService {

    @Autowired
    private CommentMapper commentMapper;
    @Autowired
    private QuestionMapper questionMapper;
    @Autowired
    private QuestionExtendMapper questionExtendMapper;

    @Transactional
    public void insert(Comment comment) {
        if (comment.getParentId() == null || comment.getParentId() == 0) {
            throw new CustomizeException(CustomizeErrorCode.TARGET_PARAM_NOT_FOUND);
        }

        if (comment.getType() == null || !CommentTypeEnum.isExist(comment.getType())) {
            throw new CustomizeException(CustomizeErrorCode.TYPE_PARAM_WRONG);
        }

        if (comment.getType().equals(CommentTypeEnum.COMMENT.getType())) {
            // 回复评论
            Comment dbComment = commentMapper.selectByPrimaryKey(comment.getId());
            if (dbComment == null) {
                throw new CustomizeException(CustomizeErrorCode.COMMENT_NOT_FOUNT);
            }
            commentMapper.insert(comment);
        } else {
            // 回复问题
            Question question = questionMapper.selectByPrimaryKey(comment.getParentId());
            if (question == null) {
                throw new CustomizeException(CustomizeErrorCode.QUESTION_NOT_FOUND);
            }
            commentMapper.insert(comment);
            question.setCommentCount(1);
            questionExtendMapper.incCommentCount(question);
        }
    }
}
