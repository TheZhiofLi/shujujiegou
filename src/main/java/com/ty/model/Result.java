package com.ty.model;



import com.ty.enums.ResultEnum;

import java.io.Serializable;
import java.util.Date;

/**
 * 返回消息实体类
 * */
public class Result implements Serializable{

	private boolean success;//是否成功
	private String errorCode;//错误代码
	private String msg;//返回信息
	private Object data;//封装返回数据
	private Date createDate;

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Result(){

	}

	public Result(ResultEnum responseCodeEnum, Object object){
		this.errorCode = responseCodeEnum.getCode();
		this.data = object;
		this.msg = responseCodeEnum.getMessage();
		if(this.errorCode.equals(ResultEnum.RESULT_CODE_100200.getCode())){
			this.success = true;
		} else {
			this.success = false;
		}
	}

	public Result(ResultEnum responseCodeEnum){
		this.errorCode = responseCodeEnum.getCode();
		this.msg = responseCodeEnum.getMessage();
		if(this.errorCode.equals(ResultEnum.RESULT_CODE_100200.getCode())){
			this.success = true;
		} else {
			this.success = false;
		}
	}


	public Result(String errorCode, String msg){
		this.errorCode = errorCode;
		this.msg = msg;
		if(this.errorCode.equals(ResultEnum.RESULT_CODE_100200.getCode())){
			this.success = true;
		} else {
			this.success = false;
		}
	}

	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}

}