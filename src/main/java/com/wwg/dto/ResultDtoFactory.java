package com.wwg.dto;

import com.wwg.constant.ResultCode;

public class ResultDtoFactory {
    public ResultDtoFactory() {
    }

    public static ResultDto toSuccess(String reason) {
        return toSuccess(reason, null);
    }

    public static ResultDto toSuccess(Object data) {
        return toSuccess(null, data);
    }

    public static ResultDto toSuccess(String reason, Object result) {
        ResultDto dto = new ResultDto();
        dto.setResultCode("0");
        dto.setReason(reason);
        dto.setResult(result);
        return dto;
    }
    
    public static ResultDto toValueEmpty(String value){
        ResultDto dto = new ResultDto();
        dto.setResultCode("-3");
        dto.setReason(value+" IS_EMPTY");
        return dto;
    }
    
    public static ResultDto toUnknowError(){
        ResultDto dto = new ResultDto();
        dto.setResultCode("-1");
        dto.setReason("UnknowError");
        dto.setResult(null);
        return dto;
    }
    
    public static ResultDto toError(ResultCode rc) {
        ResultDto dto = new ResultDto();
        dto.setResultCode(rc.getCode());
        dto.setReason(rc.getMessage());
        dto.setResult(null);
        return dto;
    }

    public static ResultDto toError(String code, String reason) {
        ResultDto dto = new ResultDto();
        dto.setResultCode(code);
        dto.setReason(reason);
        dto.setResult(null);
        return dto;
    }
    
    public ResultDto toInvalideTokenError() {
        ResultDto dto = new ResultDto();
        dto.setResultCode("10004");
        dto.setReason("InvalideTokenErrer");
        dto.setResult(null);
        return dto;
    }
    
    public ResultDto toNopermissionsError() {
        ResultDto dto = new ResultDto();
        dto.setResultCode("30000");
        dto.setReason("NopermissionsError");
        dto.setResult(null);
        return dto;
    }

    public ResultDto toTimeOutError() {
        ResultDto dto = new ResultDto();
        dto.setResultCode("10001");
        dto.setReason("TimeOutError");
        dto.setResult(null);
        return dto;
    }

    public ResultDto toIOError() {
        ResultDto dto = new ResultDto();
        dto.setResultCode("50000");
        dto.setReason("IOError");
        dto.setResult(null);
        return dto;
    }

    public ResultDto toInvalidKeyError() {
        ResultDto dto = new ResultDto();
        dto.setResultCode("50001");
        dto.setReason("InvalidKeyError");
        dto.setResult(null);
        return dto;
    }

    public ResultDto toNoSuchAlgorithmError() {
        ResultDto dto = new ResultDto();
        dto.setResultCode("50002");
        dto.setReason("NoSuchAlgorithmError");
        dto.setResult(null);
        return dto;
    }

    public ResultDto toIllegalStateError() {
        ResultDto dto = new ResultDto();
        dto.setResultCode("50003");
        dto.setReason("IllegalStateError");
        dto.setResult(null);
        return dto;
    }

    public ResultDto toSignatureError() {
        ResultDto dto = new ResultDto();
        dto.setResultCode("50004");
        dto.setReason("SignatureError");
        dto.setResult(null);
        return dto;
    }

}
