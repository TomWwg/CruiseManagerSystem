package com.wwg.controller;

import com.github.pagehelper.PageInfo;
import com.wwg.constant.ResultCode;
import com.wwg.dto.EvaluateDto;
import com.wwg.dto.PageRequest;
import com.wwg.dto.ResultDto;
import com.wwg.dto.ResultDtoFactory;
import com.wwg.entity.Evaluate;
import com.wwg.service.EvaluateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wwg on 2017/4/22.
 */
@RestController
@RequestMapping("evaluate")
public class EvaluateController {

    @Autowired
    private EvaluateService evaluateService;

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public ResultDto add(@RequestBody EvaluateDto dto){
        Evaluate evaluate = EvaluateDto.form(dto);
        if(evaluate != null){
            evaluateService.insert(evaluate);
            return ResultDtoFactory.toSuccess("success");
        } else {
            return ResultDtoFactory.toError(ResultCode.PARAMETER_ERROR);
        }
    }

    @RequestMapping(value = "deleteById", method = RequestMethod.POST)
    public ResultDto deleteById(@RequestBody EvaluateDto dto){
        Evaluate evaluate = EvaluateDto.form(dto);
        if(evaluate != null){
            evaluateService.deleteById(evaluate.getId());
            return ResultDtoFactory.toSuccess("success");
        } else {
            return ResultDtoFactory.toError(ResultCode.PARAMETER_ERROR);
        }
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    public ResultDto update(@RequestBody EvaluateDto dto){
        Evaluate evaluate = EvaluateDto.form(dto);
        if(evaluate != null){
            evaluateService.update(evaluate);
            return ResultDtoFactory.toSuccess("success");
        } else {
            return ResultDtoFactory.toError(ResultCode.PARAMETER_ERROR);
        }
    }

    @RequestMapping(value = "findByUserId", method = RequestMethod.POST)
    public ResultDto findByUserId(@RequestBody EvaluateDto dto){
        Evaluate evaluate = EvaluateDto.form(dto);
        if(evaluate != null){
            PageInfo<Evaluate> evaluatePageInfo = evaluateService.findByUserId(evaluate.getUserId(), dto.buildPage());
            return ResultDtoFactory.toSuccess(new PageRequest<Evaluate>(evaluatePageInfo));
        } else {
            return ResultDtoFactory.toError(ResultCode.PARAMETER_ERROR);
        }
    }

    @RequestMapping(value = "findByRouteId", method = RequestMethod.POST)
    public ResultDto findByRouteId(@RequestBody EvaluateDto dto){
        Evaluate evaluate = EvaluateDto.form(dto);
        if(evaluate != null){
            PageInfo<Evaluate> evaluatePageInfo = evaluateService.findByRouteId(evaluate.getRouteId(), dto.buildPage());
            return ResultDtoFactory.toSuccess(new PageRequest<Evaluate>(evaluatePageInfo));
        } else {
            return ResultDtoFactory.toError(ResultCode.PARAMETER_ERROR);
        }
    }

    @RequestMapping(value = "findAll", method = RequestMethod.POST)
    public ResultDto findAll(@RequestBody EvaluateDto dto){
        PageInfo<Evaluate> evaluatePageInfo = evaluateService.findAll(dto.buildPage());
        if(evaluatePageInfo != null){
            return ResultDtoFactory.toSuccess(new PageRequest<Evaluate>(evaluatePageInfo));
        } else {
            return ResultDtoFactory.toError(ResultCode.PARAMETER_ERROR);
        }
    }

}
