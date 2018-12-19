package com.sshe.dto;


@SuppressWarnings("serial")
public class SubjectsDto implements java.io.Serializable {
	/**主键*/
	private java.lang.Integer id;
	/**创建日期*/
	private java.util.Date createDate;
	/**更新日期*/
	private java.util.Date updateDate;
	/**科目名称*/
	private java.lang.String name;
	/**年级id*/
	private java.lang.Integer gradeId;
	/**0 可用 1禁用*/
	private java.lang.Integer state;
	
	public java.lang.Integer getId(){
		return this.id;
	}
	public void setId(java.lang.Integer id){
		this.id = id;
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
	public java.lang.String getName(){
		return this.name;
	}
	public void setName(java.lang.String name){
		this.name = name;
	}
	public java.lang.Integer getGradeId(){
		return this.gradeId;
	}
	public void setGradeId(java.lang.Integer gradeId){
		this.gradeId = gradeId;
	}
	public java.lang.Integer getState(){
		return this.state;
	}
	public void setState(java.lang.Integer state){
		this.state = state;
	}
}