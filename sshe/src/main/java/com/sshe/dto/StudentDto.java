package com.sshe.dto;



@SuppressWarnings("serial")
public class StudentDto implements java.io.Serializable {
	/**����*/
	private java.lang.Integer id;
	/**����*/
	private java.lang.String name;
	/**�Ա�*/
	private java.lang.String gender;
	/**�༶id*/
	private java.lang.Integer classId;
	/**ѧ���ȼ�*/
	private java.lang.String levelId;
	/**ѧ����*/
	private java.lang.String enrollmentNumber;
	/**��ͥ��ַ*/
	private java.lang.String homeAddress;
	/**0���� 1������*/
	private java.lang.Integer state;
	/**��������*/
	private java.util.Date createDate;
	/**��������*/
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
	public java.lang.String getGender(){
		return this.gender;
	}
	public void setGender(java.lang.String gender){
		this.gender = gender;
	}
	public java.lang.Integer getClassId(){
		return this.classId;
	}
	public void setClassId(java.lang.Integer classId){
		this.classId = classId;
	}
	public java.lang.String getLevelId(){
		return this.levelId;
	}
	public void setLevelId(java.lang.String levelId){
		this.levelId = levelId;
	}
	public java.lang.String getEnrollmentNumber(){
		return this.enrollmentNumber;
	}
	public void setEnrollmentNumber(java.lang.String enrollmentNumber){
		this.enrollmentNumber = enrollmentNumber;
	}
	public java.lang.String getHomeAddress(){
		return this.homeAddress;
	}
	public void setHomeAddress(java.lang.String homeAddress){
		this.homeAddress = homeAddress;
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