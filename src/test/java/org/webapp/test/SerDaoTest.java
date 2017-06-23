package org.webapp.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;
import org.webapp.data.SerDao;
import org.webapp.model.Ser;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:test-context.xml",
                                   "classpath:/META-INF/spring/applicationContext.xml"})
@Transactional
@TransactionConfiguration(defaultRollback = true)
public class SerDaoTest {

	@Autowired
	SerDao serDao;
	
	@Test
	public void getSerById () {
		Ser tSer = serDao.getSerById(1);
		
		assertEquals("ser-001", tSer.getSerNo());
		assertEquals("cas", tSer.getSysCode());
		assertEquals("this is my first SER", tSer.getSerDetail());
		
	}
}
