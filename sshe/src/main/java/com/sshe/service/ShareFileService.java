package com.sshe.service;

import com.sshe.beans.ShareFile;
import com.sshe.common.PageEntity;

public interface ShareFileService {
	public void save(ShareFile shareFile);
	
	public void delete(Integer id);
	
	public PageEntity<ShareFile> queryByPage(Integer pageNo,Integer pageSize);
}
