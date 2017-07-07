package com.wwg.controller;

import com.github.pagehelper.PageInfo;
import com.wwg.constant.ResultCode;
import com.wwg.dto.PageRequest;
import com.wwg.dto.ResultDto;
import com.wwg.dto.ResultDtoFactory;
import com.wwg.dto.UserDto;
import com.wwg.entity.User;
import com.wwg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wwg on 2017/4/18 0018.
 */
@RequestMapping("user")
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResultDto findByUsername(@RequestBody UserDto dto){
        User user = dto.form(dto);
        if(user != null){
            String username = user.getUsername();
            user = userService.findByUsername(username);
            if(user != null && user.getPassword().equals(dto.getPassword())){
                return ResultDtoFactory.toSuccess("success");
            } else if(user == null){
                return ResultDtoFactory.toError(ResultCode.MEMBER_NOT_EXIST);
            } else {
                return ResultDtoFactory.toError(ResultCode.PASSWORD_INCORRECT);
            }
        } else {
            return ResultDtoFactory.toError(ResultCode.PARAMETER_ERROR);
        }
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    public ResultDto update(@RequestBody UserDto dto){
        User user = UserDto.form(dto);
        if(user != null){
            userService.update(user);
            return ResultDtoFactory.toSuccess("success");
        } else {
            return ResultDtoFactory.toError(ResultCode.PARAMETER_ERROR);
        }
    }

    @RequestMapping(value = "findByUserNameLikely",method = RequestMethod.POST)
    public ResultDto findByUserNameLikely(@RequestBody UserDto dto){
        User user = UserDto.form(dto);
        if(user != null){
            PageInfo<User> userList = userService.findByUserNameLikely(user.getUsername(), dto.buildPage());
            return ResultDtoFactory.toSuccess(new PageRequest<User>(userList));
        } else {
            return ResultDtoFactory.toError(ResultCode.PARAMETER_ERROR);
        }
    }

    @RequestMapping(value = "deleteById", method = RequestMethod.POST)
    public ResultDto deleteById(@RequestBody UserDto dto){
        User user = UserDto.form(dto);
        if(user != null){
            userService.deleteById(user.getId());
            return ResultDtoFactory.toSuccess("success");
        } else {
            return ResultDtoFactory.toError(ResultCode.PARAMETER_ERROR);
        }
    }

    @RequestMapping(value = "changePassword", method = RequestMethod.POST)
    public ResultDto changePassword(@RequestBody UserDto dto){
        User user = UserDto.form(dto);
        if(user != null){
            userService.changePassword(user.getId(), user.getPassword());
            return ResultDtoFactory.toSuccess("success");
        } else {
            return ResultDtoFactory.toError(ResultCode.PARAMETER_ERROR);
        }
    }

}
