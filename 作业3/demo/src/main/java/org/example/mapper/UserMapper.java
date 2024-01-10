package org.example.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.example.dto.UserDataDTO;
import org.example.entity.User;
import org.example.vo.UserDataVO;
import java.util.List;

public interface UserMapper {
    @Select("SELECT * FROM user WHERE name = #{req.name}")
    List<UserDataVO> getUserList(@Param("req") UserDataDTO req);
//    List<UserDataVO> getUserList(@Param("req") UserDataDTO dto);//这行打开，上2行可以注释掉，同时也需要把（UserMapper.xml）中getUserList方法的注释打开

    @Insert("INSERT INTO `user` (name, age, email, avatar) VALUE (#{user.name}, #{user.age}, #{user.email}, #{user.avatar})")
    int insetUser(@Param("user") User user);
    //int insetUser(@Param("user") User user);//这行打开，上2行可以注释掉，同时也需要把（UserMapper.xml）中insetUser方法的注释打开

    int insetUsers(List<User> users);

    int updUser(@Param("user") User user);

    // @Delete("DELETE FROM ")
    int delUser(@Param("id") Integer id);

    UserDataVO getUserDetail(Integer id);
}
