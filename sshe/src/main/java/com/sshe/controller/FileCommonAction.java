package com.sshe.controller;

import java.io.File;
import java.util.Date;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.sshe.beans.ShareFile;
import com.sshe.common.PageEntity;
import com.sshe.common.Utils;
import com.sshe.constants.Consts;
import com.sshe.service.ShareFileService;

@SuppressWarnings("serial")
@Component
@Scope("prototype")
public class FileCommonAction extends BaseAction {

	private String path = "D:/fastCar";
	private File upload;// �ļ�
	private String uploadFileName;// �ļ���
	private String uploadContentType;// �ļ�����
	private String category;
	private Integer pageNo;
	private Integer pageSize;
	@Autowired
	private ShareFileService shareFileService;

	/**
	 *�ļ��ϴ�
	 * @return
	 */
	public String uploadFile() {
		try {
			if (Utils.isEmpty(category)) {
				putFailReturnDto("��ѡ���ļ�����");
			} else {
				if (!category.equals(Consts.CATEGORY_PHOTO) && !category.equals(Consts.CATEGORY_VIDEO)
						&& !category.equals(Consts.CATEGORY_ZIP)) {
					putFailReturnDto("�ļ����ʹ���");
				}else{
					String finalPath = path + "/" + category;
					// Ϊ�˱����ļ����ظ�������ѡ����uuid���������϶������ظ���
					String newFileName = UUID.randomUUID().toString()
							+ uploadFileName.substring(uploadFileName.lastIndexOf("."));
					// ���ļ�������������·����
					FileUtils.copyFile(upload, new File(finalPath, newFileName));
					ShareFile shareFile = new ShareFile();
					shareFile.setCreateTime(new Date());
					shareFile.setFileName(uploadFileName);
					shareFile.setFileType(category);
					shareFile.setFilePath("/fastCar/" +category+"/"+ newFileName);
					shareFileService.save(shareFile);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			putErrorReturnDto(e);
		}
		return SUCCESS;
	}
	
	/**��ҳ��ѯ
	 * @return
	 */
	public String queryByPage(){
		try {
			PageEntity<ShareFile> queryByPage = shareFileService.queryByPage(pageNo, pageSize);
			putSuccessReturnDto(queryByPage);
		} catch (Exception e) {
			e.printStackTrace();
			putErrorReturnDto(e);
		}
		return SUCCESS;
	}
	
	
	public File getUpload() {
		return upload;
	}
	public void setUpload(File upload) {
		this.upload = upload;
	}
	public String getUploadFileName() {
		return uploadFileName;
	}

	public void setUploadFileName(String uploadFileName) {
		this.uploadFileName = uploadFileName;
	}
	public String getUploadContentType() {
		return uploadContentType;
	}
	public void setUploadContentType(String uploadContentType) {
		this.uploadContentType = uploadContentType;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Integer getPageNo() {
		return pageNo;
	}
	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
}
