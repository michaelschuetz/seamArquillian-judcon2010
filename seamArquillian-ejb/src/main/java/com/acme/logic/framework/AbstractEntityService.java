package com.acme.logic.framework;

import com.acme.model.AbstractEntity;

/**
 * Abstract super interface for entity related services.
 * 
 * @param <T>
 *            abstract entity type
 */
public interface AbstractEntityService<T extends AbstractEntity> {
	/**
	 * Find entity by technical id.
	 * 
	 * @param id
	 *            id
	 * @return user
	 */
	T find(long id);

	/**
	 * Delete the entity out the database.
	 * 
	 * @param entity
	 *            entity
	 */
	String delete(T entity);

	/**
	 * * Store or update the entity in the database.
	 * 
	 * @param entity
	 *            entity
	 * @return
	 */
	String saveOrUpdate(T entity);

	void refresh(T entity);
}
