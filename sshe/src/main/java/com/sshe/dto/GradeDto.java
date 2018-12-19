package com.sshe.dto;


/**   
 * @Title: Entity
 * @Description: 班级表
 * @author onlineGenerator
 * @date 2018-09-08 16:51:31
 * @version V1.0   
 *
 */
@SuppressWarnings("serial")
public class GradeDto implements java.io.Serializable {
	/**主键*/
	private java.lang.Integer id;
	/**创建日期*/
	private java.util.Date createDate;
	/**更新日期*/
	private java.util.Date updateDate;
	/**年级名称*/
	private java.lang.String gradeName;
	/**状态 0可用 1禁用*/
	private java.lang.Integer state;
	/**管理员id*/
	private java.lang.Integer kepperId;

	
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
	public java.lang.String getGradeName(){
		return this.gradeName;
	}
	public void setGradeName(java.lang.String gradeName){
		this.gradeName = gradeName;
	}
	public java.lang.Integer getState(){
		return this.state;
	}
	public void setState(java.lang.Integer state){
		this.state = state;
	}
	public java.lang.Integer getKepperId() {
		return kepperId;
	}
	public void setKepperId(java.lang.Integer kepperId) {
		this.kepperId = kepperId;
	}
	
}