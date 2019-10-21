package life.majiang.community.community.service;

import life.majiang.community.community.mapper.UserMapper;
import life.majiang.community.community.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ProjectName: community
 * @Package: life.majiang.community.community.service
 * @ClassName: UserService
 * @Author: 陶然居
 * @Description:
 * @Date: 2019/10/21 21:15
 * @Version: 1.0
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public void createOrUpdate(User user) {
        User dbUser = userMapper.findByAccountId(user.getAccountId());
        if (dbUser == null) {
            //insert
            user.setGmtCreate(System.currentTimeMillis());
            user.setGmtCreate(user.getGmtCreate());
            userMapper.insert(user);
        } else {
            //update
            dbUser.setGmtModified(System.currentTimeMillis());
            dbUser.setAvatarUrl(user.getAvatarUrl());
            dbUser.setName(user.getName());
            dbUser.setToken(user.getToken());
            userMapper.update(dbUser);
        }
    }
}
