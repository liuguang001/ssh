package com.sshe.controller;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.sshe.constants.ReturnCode;
import com.sshe.dto.ReturnDto;
import com.sshe.exception.BizException;

@SuppressWarnings("serial")
public class BaseAction extends ActionSupport{

	public ReturnDto returnDto=new ReturnDto();

	public ReturnDto getReturnDto() {
		return returnDto;
	}

	public void setReturnDto(ReturnDto returnDto) {
		this.returnDto = returnDto;
	}

	/**异常处理
	 * @param e
	 */
	public void putErrorReturnDto(Exception e) {
		this.returnDto.setCode(ReturnCode.FAIL);
		if (e instanceof BizException) {
			this.returnDto.setMsg(e.getMessage());
		}else {
			this.returnDto.setMsg("系统出错,请稍后重试!");
		}
	}
	
	/**获取session
	 * @return
	 */
	public Map<String, Object> getSession() {
		ActionContext actionContext = ActionContext.getContext();
        Map<String, Object> session = actionContext.getSession();
        return session;
	}
	
	/**设置请求失败
	 * @param message
	 */
	public void putFailReturnDto(String message) {
		this.returnDto.setCode(ReturnCode.FAIL);
		this.returnDto.setMsg(message);
	}
	
	/**
	 * 设置请求成功无数据
	 */
	public void putSuccessReturnDto() {
		this.returnDto.setCode(ReturnCode.SUCCESS);
	}
	
	/**
	 * 设置请求成功带返回数据
	 */
	public void putSuccessReturnDto(Object data) {
		this.returnDto.setCode(ReturnCode.SUCCESS);
		this.returnDto.setData(data);
	}
	
}
