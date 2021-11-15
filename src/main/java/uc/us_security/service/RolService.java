package uc.us_security.service;

import java.util.List;

import uc.us_security.entity.Rol;

public interface RolService {

	List<Rol> readAll();

	Rol create(Rol al);

	Rol read(int id);

	void delete(int id);

	Rol update(Rol al);
	
}
