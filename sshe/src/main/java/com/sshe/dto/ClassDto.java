package com.sshe.dto;


/**   
 * @Title: Entity
 * @Description: �༶��
 * @author onlineGenerator
 * @date 2018-09-08 16:39:59
 * @version V1.0   
 *
 */
@SuppressWarnings("serial")
public class ClassDto implements java.io.Serializable {
	/**����*/
	private java.lang.Integer id;
	/**��������*/
	private java.util.Date createDate;
	/**��������*/
	private java.util.Date updateDate;
	/**״̬  0���� 1����*/
	private java.lang.Integer state;
	/**�༶����*/
	private java.lang.String className;
	/**�꼶id*/
	private java.lang.Integer gradeId;
	/**������id*/
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
	public java.lang.Integer getState(){
		return this.state;
	}
	public void setState(java.lang.Integer state){
		this.state = state;
	}
	public java.lang.String getClassName(){
		return this.className;
	}
	public void setClassName(java.lang.String className){
		this.className = className;
	}
	public java.lang.Integer getGradeId(){
		return this.gradeId;
	}
	public void setGradeId(java.lang.Integer gradeId){
		this.gradeId = gradeId;
	}
	public java.lang.Integer getKepperId() {
		return kepperId;
	}
	public void setKepperId(java.lang.Integer kepperId) {
		this.kepperId = kepperId;
	}
}