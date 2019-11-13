package com.run.mapper;
import com.run.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


/**
 * @author edxuanlen
 */
@Mapper
public interface UserMapper {


//    @Select("select * from user where id = #{id}")
//    public User getUserById(String id);

    /**
     * @param username
     * @return User
     * return user
     */
    User getUserByUsername(String username);

//    public User insertUser(User user);
}

