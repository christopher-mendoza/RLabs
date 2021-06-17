package dev.mendoza.repositories;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import dev.mendoza.models.Cat;
import dev.mendoza.utils.HibernateUtil;

public class CatHibernate implements GenericRepository<Cat> {


	@Override
	public Cat add(Cat t) {
		Session s = HibernateUtil.getSession();
		Transaction tx = null;
		try {
			tx = s.beginTransaction();
			s.save(t);
			s.getTransaction().commit();
		}
		catch (HibernateException e) {
			e.printStackTrace();
			s.getTransaction().rollback();
		}
		finally {
			s.close();
		}
		return t;
	}

	@Override
	public Cat getById(Integer id) {
		// Get a session from the session factory
		Session s = HibernateUtil.getSession();
		Cat c = s.get(Cat.class, id);
		
		// always close your session
		s.close();
		return c;
	}
	
	public Cat getByName(String name) {
		Session s = HibernateUtil.getSession();
		Cat c = null;
		try {
			CriteriaBuilder cb = s.getCriteriaBuilder();
			CriteriaQuery<Cat> cr = cb.createQuery(Cat.class);
			Root<Cat> root = cr.from(Cat.class);
			cr.select(root).where(cb.equal(root.get("name"), name));
			c = s.createQuery(cr).getSingleResult();
		}
		catch (HibernateException e) {
			e.printStackTrace();
		}
		finally {
			s.close();
		}
		return c;
	}

	@Override
	public boolean update(Cat change) {
		Session s = HibernateUtil.getSession();
		Transaction tx = null;
		try {
			tx = s.beginTransaction();
			s.update(change);
			tx.commit();
			return true;
		}
		catch (HibernateException e) {
			e.printStackTrace();
			tx.rollback();
		}
		finally {
			s.close();
		}
		return false;
	}

	@Override
	public boolean delete(Cat t) {
		Session s = HibernateUtil.getSession();
		Transaction tx = null;
		try {
			tx = s.beginTransaction();
			s.delete(t);
			tx.commit();
			return true;
		}
		catch (HibernateException e) {
			e.printStackTrace();
			tx.rollback();
		}
		finally {
			s.close();
		}
		return false;
	}

	@Override
	public List<Cat> getAll() {
		Session s = HibernateUtil.getSession();
		List<Cat> cats = null;
		try {
			cats = s.createQuery("FROM cats").list();
		}
		catch (HibernateException e) {
			e.printStackTrace();
		}
		finally {
			s.close();
		}
		return cats;
	}

}
