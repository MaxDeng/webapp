package org.webapp.data;

import java.util.List;

import org.webapp.model.Ser;

public interface SerDao {
	
	public Ser getSerById(long serId);
	
	public List<Ser> getSers();
	
	public void createSer(Ser ser);
	
	public void updateSer(Ser ser);
	
	public void removeSerById(long serId);
}
