package com.sshe.dto;



@SuppressWarnings("serial")
public class TitleDto implements java.io.Serializable {
	/**主键*/
	private java.lang.String id;
	/**职称名称*/
	private java.lang.String name;
	/**状态 0可用 1禁用*/
	private java.lang.Integer state;
	/**创建日期*/
	private java.util.Date createDate;
	/**更新日期*/
	private java.util.Date updateDate;
	
	public java.lang.String getId(){
		return this.id;
	}
	public void setId(java.lang.String id){
		this.id = id;
	}
	public java.lang.String getName(){
		return this.name;
	}
	public void setName(java.lang.String name){
		this.name = name;
	}
	public java.lang.Integer getState(){
		return this.state;
	}
	public void setState(java.lang.Integer state){
		this.state = state;
	}
	public java.util.Date getCreateDate(){
		return this.createDate;
	}
	public void setCreateDate(java.util.Date createDate){
		this.createDate = createDate;
	}
	public java.util.Date getUpdateDate(){
		return this.updateDate;
	}
	public void setUpdateDate(java.util.Date updateDate){
		this.updateDate = updateDate;
	}
}