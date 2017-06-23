package org.webapp.data;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.webapp.model.Ser;

@Repository
@Transactional
public class SerDaoImpl implements SerDao {

	@Autowired
	private EntityManager em;
	
	@Override
	public Ser getSerById(long serId) {
		Ser ser = em.find(Ser.class, serId);
		return ser;
	}

	@Override
	public List<Ser> getSers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void createSer(Ser ser) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateSer(Ser ser) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removeSerById(long serId) {
		// TODO Auto-generated method stub

	}

}
