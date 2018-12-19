package com.sshe.dto;


@SuppressWarnings("serial")
public class TeacherDto implements java.io.Serializable {
	/**主键*/
	private java.lang.Integer id;
	/**教师名称*/
	private java.lang.String name;
	/**性别 0 女 1男*/
	private java.lang.Integer gender;
	/**职称id*/
	private java.lang.Integer titleId;
	/**联系电话*/
	private java.lang.String phone;
	/**家庭住址*/
	private java.lang.String homeAddress;
	/**薪资水平 月薪制*/
	private java.lang.Double emolument;
	/**0 可用 1禁用*/
	private java.lang.Integer state;
	/**创建日期*/
	private java.util.Date createDate;
	/**更新日期*/
	private java.util.Date updateDate;
	
	public java.lang.Integer getId(){
		return this.id;
	}
	public void setId(java.lang.Integer id){
		this.id = id;
	}
	public java.lang.String getName(){
		return this.name;
	}
	public void setName(java.lang.String name){
		this.name = name;
	}
	public java.lang.Integer getGender(){
		return this.gender;
	}
	public void setGender(java.lang.Integer gender){
		this.gender = gender;
	}
	public java.lang.Integer getTitleId(){
		return this.titleId;
	}
	public void setTitleId(java.lang.Integer titleId){
		this.titleId = titleId;
	}
	public java.lang.String getPhone(){
		return this.phone;
	}
	public void setPhone(java.lang.String phone){
		this.phone = phone;
	}
	public java.lang.String getHomeAddress(){
		return this.homeAddress;
	}
	public void setHomeAddress(java.lang.String homeAddress){
		this.homeAddress = homeAddress;
	}
	public java.lang.Double getEmolument(){
		return this.emolument;
	}
	public void setEmolument(java.lang.Double emolument){
		this.emolument = emolument;
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