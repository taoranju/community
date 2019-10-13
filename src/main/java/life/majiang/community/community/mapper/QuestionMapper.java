package life.majiang.community.community.mapper;

import life.majiang.community.community.model.Question;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ProjectName: community
 * @Package: life.majiang.community.community.mapper
 * @ClassName: QuestionMapper
 * @Author: 陶然居
 * @Description:
 * @Date: 2019/10/13 17:53
 * @Version: 1.0
 */

@Mapper
public interface QuestionMapper {

    @Insert("insert into question (title,description,gmt_create,gmt_modified,creator,tag) values (#{title},#{description},#{gmtCreate},#{gmtModified},#{creator},#{tag})")
    void create(Question question);
}
