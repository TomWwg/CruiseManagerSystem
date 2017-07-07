package com.wwg.controller;

import com.github.pagehelper.PageInfo;
import com.wwg.constant.ResultCode;
import com.wwg.dto.*;
import com.wwg.entity.Cruise;
import com.wwg.service.CruiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by wwg on 2017/4/19 0019.
 */
@RequestMapping("cruise")
@RestController
public class CruiseController {

    @Autowired
    private CruiseService cruiseService;

    @RequestMapping(value = "findById", method = RequestMethod.POST)
    public ResultDto findById(@RequestBody CruiseDto dto){
        Cruise cruise = CruiseDto.form(dto);
        if(cruise != null){
            long id = cruise.getId();
            cruise = cruiseService.findById(id);
            if(cruise != null){
                return ResultDtoFactory.toSuccess(cruise);
            } else {
                return ResultDtoFactory.toError(ResultCode.ARTICLE_NOT_EXIST);
            }
        } else {
            return ResultDtoFactory.toError(ResultCode.PARAMETER_ERROR);
        }
    }

    @RequestMapping(value = "findAll", method = RequestMethod.POST)
    public ResultDto findAll(@RequestBody PageDto dto){
        PageInfo<Cruise> cruiseList = cruiseService.findAll(dto.buildPage());
        if(cruiseList == null){
            return ResultDtoFactory.toError(ResultCode.ARTICLE_NOT_EXIST);
        }
        return ResultDtoFactory.toSuccess(new PageRequest<Cruise>(cruiseList));
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public ResultDto add(@RequestBody CruiseDto dto){
        Cruise cruise = CruiseDto.form(dto);
        System.out.print(cruise);
        if(cruise != null){
            cruiseService.insert(cruise);
            return ResultDtoFactory.toSuccess("success");
        } else {
            return ResultDtoFactory.toError(ResultCode.PARAMETER_ERROR);
        }
    }

    @RequestMapping(value = "deleteById", method = RequestMethod.POST)
    public ResultDto deleteById(@RequestBody CruiseDto dto){
        Cruise cruise = CruiseDto.form(dto);
        if(cruise != null){
            cruiseService.deleteById(cruise.getId());
            return ResultDtoFactory.toSuccess("success");
        } else {
            return ResultDtoFactory.toError(ResultCode.PARAMETER_ERROR);
        }
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    public ResultDto update(@RequestBody CruiseDto dto){
        Cruise cruise = CruiseDto.form(dto);
        if(cruise != null){
            cruiseService.update(cruise);
            return ResultDtoFactory.toSuccess("success");
        } else{
            return ResultDtoFactory.toError(ResultCode.PARAMETER_ERROR);
        }
    }

    @RequestMapping(value = "findByCruiseName", method = RequestMethod.POST)
    public ResultDto findByCruiseName(@RequestBody CruiseDto dto){
        Cruise cruise = CruiseDto.form(dto);
        if(cruise != null){
            PageInfo<Cruise> cruiseList = cruiseService.findByCruiseName(cruise.getCruiseName(), dto.buildPage());
            return ResultDtoFactory.toSuccess(new PageRequest<Cruise>(cruiseList));
        } else {
            return ResultDtoFactory.toError(ResultCode.PARAMETER_ERROR);
        }
    }

    @RequestMapping(value = "findAllCruise", method = RequestMethod.POST)
    public ResultDto findAllCruise(){
        List<Cruise> cruiseList = cruiseService.findAllCruise();
        if(cruiseList == null){
            return ResultDtoFactory.toError(ResultCode.ARTICLE_NOT_EXIST);
        }
        return ResultDtoFactory.toSuccess(cruiseList);
    }

}
