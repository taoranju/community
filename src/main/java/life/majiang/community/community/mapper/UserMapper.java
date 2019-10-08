package life.majiang.community.community.mapper;

import life.majiang.community.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ProjectName: community
 * @Package: life.majiang.community.mapper
 * @ClassName: UserMapper
 * @Author: 陶然居
 * @Description:
 * @Date: 2019/10/8 20:59
 * @Version: 1.0
 */

@Mapper
public interface UserMapper {

    @Insert("insert into user (name,account_id,token,gmt_create,gmt_modified) values (#{name},#{accountId},#{token},#{gmtCreate},#{gmtModified})")
    void insert(User user);
}
