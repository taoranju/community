package life.majiang.community.community.dto;

/**
 * @ProjectName: community
 * @Package: life.majiang.community.community.dto
 * @ClassName: GithubUser
 * @Author: 陶然居
 * @Description:
 * @Date: 2019/10/7 20:28
 * @Version: 1.0
 */
public class GithubUser {

    private String login;
    private Long id;
    private String bio;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
