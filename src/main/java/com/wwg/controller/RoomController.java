package com.wwg.controller;

import com.github.pagehelper.PageInfo;
import com.wwg.constant.ResultCode;
import com.wwg.dto.PageRequest;
import com.wwg.dto.ResultDto;
import com.wwg.dto.ResultDtoFactory;
import com.wwg.dto.RoomDto;
import com.wwg.entity.Room;
import com.wwg.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wwg on 2017/4/21 0021.
 */
@RestController
@RequestMapping(value = "room")
public class RoomController {

    @Autowired
    private RoomService roomService;

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public ResultDto add(@RequestBody RoomDto dto){
        Room room = RoomDto.form(dto);
        if(room != null){
            roomService.insert(room);
            return ResultDtoFactory.toSuccess("success");
        } else {
            return ResultDtoFactory.toError(ResultCode.PARAMETER_ERROR);
        }
    }

    @RequestMapping(value = "deleteById", method = RequestMethod.POST)
    public ResultDto deleteById(@RequestBody RoomDto dto){
        Room room = RoomDto.form(dto);
        if(room != null){
            roomService.deleteById(room.getId());
            return ResultDtoFactory.toSuccess("success");
        } else {
            return ResultDtoFactory.toError(ResultCode.PARAMETER_ERROR);
        }
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    public ResultDto update(@RequestBody RoomDto dto){
        Room room = RoomDto.form(dto);
        if(room != null){
            roomService.update(room);
            return ResultDtoFactory.toSuccess("success");
        } else {
            return ResultDtoFactory.toError(ResultCode.PARAMETER_ERROR);
        }
    }

    @RequestMapping(value = "findAll", method = RequestMethod.POST)
    public ResultDto findAll(@RequestBody RoomDto dto){
        PageInfo<Room> roomPageInfo = roomService.findAll(dto.buildPage());
        if(roomPageInfo != null){
            return ResultDtoFactory.toSuccess(new PageRequest<Room>(roomPageInfo));
        } else {
            return ResultDtoFactory.toError(ResultCode.PARAMETER_ERROR);
        }
    }

    @RequestMapping(value = "findByCruiseId", method = RequestMethod.POST)
    public ResultDto findByCruiseId(@RequestBody RoomDto dto){
        Room room = RoomDto.form(dto);
        if(room != null){
            PageInfo<Room> roomPageInfo = roomService.findByCruiseId(room.getCruiseId(), dto.buildPage());
            if(roomPageInfo != null){
                return ResultDtoFactory.toSuccess(new PageRequest<Room>(roomPageInfo));
            } else {
                return ResultDtoFactory.toError(ResultCode.ARTICLE_NOT_EXIST);
            }
        } else {
            return ResultDtoFactory.toError(ResultCode.PARAMETER_ERROR);
        }
    }

}
