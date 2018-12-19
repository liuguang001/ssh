package com.sshe.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.googlecode.genericdao.search.Search;
import com.googlecode.genericdao.search.SearchResult;
import com.sshe.beans.ShareFile;
import com.sshe.common.PageEntity;
import com.sshe.dao.ShareFileDao;
import com.sshe.service.ShareFileService;

@Service
public class ShareFileServiceImpl implements ShareFileService {
	@Autowired
	private ShareFileDao shareFileDao;
	
	public void save(ShareFile shareFile){
		shareFileDao.save(shareFile);
	}
	
	public void delete(Integer id){
		shareFileDao.deleteByKey(id);
	}
	
	public PageEntity<ShareFile> queryByPage(Integer pageNo,Integer pageSize){
		Search search=new Search();
		SearchResult<ShareFile> searchAndCount = shareFileDao.searchAndCount(search);
		return new PageEntity<ShareFile>(pageSize, pageNo, searchAndCount.getTotalCount(), searchAndCount.getResult());
	}
}
