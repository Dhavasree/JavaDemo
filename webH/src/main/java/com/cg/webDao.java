package com.cg;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;
@Repository("dao")
@Transactional
public class webDao implements IDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@SuppressWarnings("unused")
	@Override
	public Bean add(Bean bean) {
		System.out.println(bean.getLocation());
		entityManager.persist(bean);
	if(bean==null)
	{
		return null;
	}
		return bean;
	}

}
