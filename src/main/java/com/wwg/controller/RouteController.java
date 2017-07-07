package com.wwg.controller;

import com.github.pagehelper.PageInfo;
import com.wwg.constant.ResultCode;
import com.wwg.dto.PageRequest;
import com.wwg.dto.ResultDto;
import com.wwg.dto.ResultDtoFactory;
import com.wwg.dto.RouteDto;
import com.wwg.entity.Route;
import com.wwg.service.RouteService;
import com.wwg.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wwg on 2017/4/23.
 */
@RestController
@RequestMapping("route")
public class RouteController {

    @Autowired
    private RouteService routeService;

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public ResultDto add(@RequestBody RouteDto dto){
        Route route = RouteDto.form(dto);
        if(route != null){
            routeService.insert(route);
            return ResultDtoFactory.toSuccess("suceess");
        } else {
            return ResultDtoFactory.toError(ResultCode.PARAMETER_ERROR);
        }
    }

    @RequestMapping(value = "deleteById", method = RequestMethod.POST)
    public ResultDto deleteById(@RequestBody RouteDto dto){
        Route route = RouteDto.form(dto);
        if(route != null){
            routeService.deleteById(route.getId());
            return ResultDtoFactory.toSuccess("success");
        } else {
            return ResultDtoFactory.toError(ResultCode.PARAMETER_ERROR);
        }
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    public ResultDto update(@RequestBody RouteDto dto){
        Route route = RouteDto.form(dto);
        if(route != null){
            routeService.update(route);
            return ResultDtoFactory.toSuccess("success");
        } else {
            return ResultDtoFactory.toError(ResultCode.PARAMETER_ERROR);
        }
    }

    @RequestMapping(value = "findById", method = RequestMethod.POST)
    public ResultDto findById(@RequestBody RouteDto dto){
        Route route = RouteDto.form(dto);
        if(route != null){
            long Id = route.getId();
            route = routeService.findById(Id);
            return ResultDtoFactory.toSuccess(route);
        } else {
            return ResultDtoFactory.toError(ResultCode.PARAMETER_ERROR);
        }
    }

    @RequestMapping(value = "findByStartPlaceId", method = RequestMethod.POST)
    public ResultDto findByStartPlaceId(@RequestBody RouteDto dto){
        Route route = RouteDto.form(dto);
        if(route != null){
            PageInfo<Route> routePageInfo =  routeService.findByStartPlaceId(route.getStartPlaceId(), dto.buildPage());
            return ResultDtoFactory.toSuccess(new PageRequest<Route>(routePageInfo));
        } else {
            return ResultDtoFactory.toError(ResultCode.PARAMETER_ERROR);
        }
    }

    @RequestMapping(value = "findByEndPlaceId", method = RequestMethod.POST)
    public ResultDto findByEndPlaceId(@RequestBody RouteDto dto){
        Route route = RouteDto.form(dto);
        if(route != null){
            PageInfo<Route> routePageInfo = routeService.findByEndPlaceId(route.getEndPlaceId(), dto.buildPage());
            return ResultDtoFactory.toSuccess(new PageRequest<Route>(routePageInfo));
        } else {
            return ResultDtoFactory.toError(ResultCode.PARAMETER_ERROR);
        }
    }

}
