package com.sshe.dto;


/**   
 * @Title: Entity
 * @Description: �༶��
 * @author onlineGenerator
 * @date 2018-09-08 16:51:31
 * @version V1.0   
 *
 */
@SuppressWarnings("serial")
public class GradeDto implements java.io.Serializable {
	/**����*/
	private java.lang.Integer id;
	/**��������*/
	private java.util.Date createDate;
	/**��������*/
	private java.util.Date updateDate;
	/**�꼶����*/
	private java.lang.String gradeName;
	/**״̬ 0���� 1����*/
	private java.lang.Integer state;
	/**����Աid*/
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