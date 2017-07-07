package com.wwg.dto;

import java.io.Serializable;

public class ResultDto implements Serializable{

    /**
     * 
     */
    private static final long serialVersionUID = -5969215944442374992L;

    /**
     * 结果编码
     */
    private String resultCode;

    /**
     * 返回说明
     */
    private String reason;

    /**
     * 返回数据集
     */
    private Object result;

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "ResultDto [resultCode=" + resultCode + ", reason=" + reason + ", result=" + result + "]";
    }
    
    

}
