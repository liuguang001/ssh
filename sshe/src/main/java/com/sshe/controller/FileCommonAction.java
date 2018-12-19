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
	private File upload;// 文件
	private String uploadFileName;// 文件名
	private String uploadContentType;// 文件类型
	private String category;
	private Integer pageNo;
	private Integer pageSize;
	@Autowired
	private ShareFileService shareFileService;

	/**
	 *文件上传
	 * @return
	 */
	public String uploadFile() {
		try {
			if (Utils.isEmpty(category)) {
				putFailReturnDto("请选择文件类型");
			} else {
				if (!category.equals(Consts.CATEGORY_PHOTO) && !category.equals(Consts.CATEGORY_VIDEO)
						&& !category.equals(Consts.CATEGORY_ZIP)) {
					putFailReturnDto("文件类型错误");
				}else{
					String finalPath = path + "/" + category;
					// 为了避免文件名重复，这里选择用uuid重命名（肯定不会重复）
					String newFileName = UUID.randomUUID().toString()
							+ uploadFileName.substring(uploadFileName.lastIndexOf("."));
					// 将文件拷贝到服务器路径下
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
	
	/**分页查询
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
