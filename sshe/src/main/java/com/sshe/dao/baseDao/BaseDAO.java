package com.sshe.dao.baseDao;

import java.io.Serializable;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.sshe.dao.baseDao.generic.GenericHibernateDAO;

/**
 * 
 * @author xiejindun
 * @date 2012-05-08
 * @param <T>
 * @param <ID>
 */
public class BaseDAO<T, ID extends Serializable> extends GenericHibernateDAO<T, ID> {

	public final Log log = LogFactory.getLog(this.getClass());
	
    @Autowired
    @Override
    public void setMySessionFactory(SessionFactory sessionFactory) {
        super.setMySessionFactory(sessionFactory);
    }
    
}
