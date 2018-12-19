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

	/**�쳣����
	 * @param e
	 */
	public void putErrorReturnDto(Exception e) {
		this.returnDto.setCode(ReturnCode.FAIL);
		if (e instanceof BizException) {
			this.returnDto.setMsg(e.getMessage());
		}else {
			this.returnDto.setMsg("ϵͳ����,���Ժ�����!");
		}
	}
	
	/**��ȡsession
	 * @return
	 */
	public Map<String, Object> getSession() {
		ActionContext actionContext = ActionContext.getContext();
        Map<String, Object> session = actionContext.getSession();
        return session;
	}
	
	/**��������ʧ��
	 * @param message
	 */
	public void putFailReturnDto(String message) {
		this.returnDto.setCode(ReturnCode.FAIL);
		this.returnDto.setMsg(message);
	}
	
	/**
	 * ��������ɹ�������
	 */
	public void putSuccessReturnDto() {
		this.returnDto.setCode(ReturnCode.SUCCESS);
	}
	
	/**
	 * ��������ɹ�����������
	 */
	public void putSuccessReturnDto(Object data) {
		this.returnDto.setCode(ReturnCode.SUCCESS);
		this.returnDto.setData(data);
	}
	
}
