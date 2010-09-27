package com.acme.logic.framework;

import java.lang.reflect.ParameterizedType;
import javax.persistence.EntityManager;

import org.jboss.seam.annotations.In;
import org.jboss.seam.annotations.Logger;
import org.jboss.seam.core.Events;
import org.jboss.seam.log.Log;

import com.acme.model.AbstractEntity;

/**
 * Abstract super class for entity related services.
 *
 * @param <T>
 *            abstract entity type
 */
public abstract class AbstractEntityServiceBean<T extends AbstractEntity>
		implements AbstractEntityService<T> {

	@In
	private EntityManager entityManager;

	@In
	private Events events;

	@Logger
	private Log log;

	protected final Class<T> clazz;

	@SuppressWarnings("unchecked")
	protected AbstractEntityServiceBean() {
		this.clazz = (Class<T>) ((ParameterizedType) getClass()
                .getGenericSuperclass()).getActualTypeArguments()[0];
	}

	/**
	 * {@inheritDoc}
	 */
	public final T find(final long id) {

		assert clazz != null : "clazz != null";
		return entityManager.find(clazz, id);
	}

	/**
	 * {@inheritDoc}
	 */
	private final String save(final T entity) {
		assert entity != null : "entity != null";

		if (entity.getId() == null) {
			entityManager.persist(entity);
		}

		assert entityManager.contains(entity);

		events.raiseEvent(
				"com.acme.persited." + entity.getClass().getSimpleName());

		return "success";

	}

	/**
	 * {@inheritDoc}
	 */
	public String saveOrUpdate(final T entity) {
		assert entity != null : "entity != null";

		if (!isManaged(entity)) {
			save(entity);
		}

		return "success";
	}

	public String delete(final T entity) {
		log.debug("remove entity #0", entity);

		entityManager.remove(entity);

		events.raiseEvent(
				"com.acme.deleted." + entity.getClass().getSimpleName());

		return "success";
	}

	public void refresh(T entity) {
		log.debug("refresh entity #0", entity);
		if (isManaged(entity)) {
			entityManager.refresh(entity);
		} else {
			entity = null;
		}
	}

	private boolean isManaged(final T entity) {
		return entity.getId() == null ? false : true;
	}

}
