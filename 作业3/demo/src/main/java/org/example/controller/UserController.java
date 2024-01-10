package org.example.controller;

import org.example.dto.UserDataDTO;
import org.example.entity.User;
import org.example.service.IUserService;
import org.example.vo.UserDataVO;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("api")
public class UserController {

    //@Autowired 或者用 @Resource
    @Resource
    private IUserService userService;

    /**
     * 获取用户列表
     *
     * @param requestDto 请求参数
     * @return {@link List<UserDataVO>}
     */
    @GetMapping("/user")
    public List<UserDataVO> getUserList(UserDataDTO requestDto) {
        return userService.getUserList(requestDto);
    }

    /**
     * 插入单条用户信息
     *
     * @param user 请求参数
     * @return
     */
    @PostMapping("user")
    public Boolean insertUser(@RequestBody User user) {
        return userService.insetUser(user);
    }

    /**
     * 插入多条用户信息
     *
     * @param users 请求参数
     * @return
     */
    @PostMapping("users")
    public Boolean insertUsers(@RequestBody List<User> users) {
        // 处理插入逻辑
        return userService.insetUsers(users);
    }

    /**
     * 修改用户信息
     *
     * @param user 请求参数
     * @return
     */
    @PutMapping("user")
    public Boolean updUser(@RequestBody User user) {
        return userService.updUser(user);
    }

    /**
     * 删除单条用户信息
     *
     * @param id 请求参数
     * @return
     */
    @DeleteMapping("/user/{id}")
    public int delUser(@PathVariable Integer id) {
        System.out.println("删除id="+id+"的数据");
        return userService.delUser(id);
    }

    /**
     * 获取用户详情信息
     *
     * @param id 请求参数
     * @return
     */
    @GetMapping("/user/{id}")
    public UserDataVO getUserDetail(@PathVariable Integer id) {
        return userService.getUserDetail(id);
    }
}
