package org.example.service;

import org.example.dto.UserDataDTO;
import org.example.entity.User;
import org.example.vo.UserDataVO;

import java.util.List;

public interface IUserService {

   /** 获取用户列表 */
   List<UserDataVO> getUserList(UserDataDTO dto);

   Boolean insetUser(User user);

   Boolean insetUsers(List<User> users);

   Boolean updUser(User user);

   int delUser(Integer id);

   UserDataVO getUserDetail(Integer id);

}
