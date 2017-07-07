package com.wwg.controller;

import com.github.pagehelper.PageInfo;
import com.wwg.constant.ResultCode;
import com.wwg.dto.PageRequest;
import com.wwg.dto.PlaceDto;
import com.wwg.dto.ResultDto;
import com.wwg.dto.ResultDtoFactory;
import com.wwg.entity.Place;
import com.wwg.service.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by admin on 2017/4/21.
 */
@RestController
@RequestMapping(value = "place")
public class PlaceController {

    @Autowired
    private PlaceService placeService;

    @RequestMapping(value = "findAll", method = RequestMethod.POST)
    public ResultDto findAll(@RequestBody PlaceDto dto){
        PageInfo<Place> placeList = placeService.findAll(dto.buildPage());
        if(placeList != null){
            return ResultDtoFactory.toSuccess(new PageRequest<Place>(placeList));
        } else{
            return ResultDtoFactory.toError(ResultCode.PARAMETER_ERROR);
        }
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public ResultDto add(@RequestBody PlaceDto dto){
        Place place = PlaceDto.form(dto);
        if(place != null){
            placeService.insert(place);
            return ResultDtoFactory.toSuccess("success");
        } else{
            return ResultDtoFactory.toError(ResultCode.PARAMETER_ERROR);
        }
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    public ResultDto update(@RequestBody PlaceDto dto){
        Place place = PlaceDto.form(dto);
        if(place != null){
            placeService.update(place);
            return ResultDtoFactory.toSuccess("success");
        } else{
            return ResultDtoFactory.toError(ResultCode.PARAMETER_ERROR);
        }
    }

    @RequestMapping(value = "deleteById", method = RequestMethod.POST)
    public ResultDto deleteById(@RequestBody PlaceDto dto){
        Place place = PlaceDto.form(dto);
        if(place != null){
            placeService.deleteById(place.getId());
            return ResultDtoFactory.toSuccess("success");
        } else {
            return ResultDtoFactory.toError(ResultCode.PARAMETER_ERROR);
        }
    }

    @RequestMapping(value = "findByPlace", method = RequestMethod.POST)
    public ResultDto findByPlace(@RequestBody PlaceDto dto){
        Place place = PlaceDto.form(dto);
        if(place != null){
            PageInfo<Place> placePageInfo = placeService.findByPlace(place.getPlace(), dto.buildPage());
            return ResultDtoFactory.toSuccess(new PageRequest<Place>(placePageInfo));
        } else {
            return ResultDtoFactory.toError(ResultCode.PARAMETER_ERROR);
        }
    }

}
