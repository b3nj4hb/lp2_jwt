package uc.us_security.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uc.us_security.entity.Usuario;
import uc.us_security.repository.UserRepository;
import uc.us_security.service.UserService;

    @Service
public class UsuarioServiceimpl implements UserService{

	@Autowired
	private UserRepository repo;
	
	@Override
	public List<Usuario> readAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	
	@Override
	public Usuario create(Usuario al) {
		// TODO Auto-generated method stub
		return repo.save(al);
	}

	@Override
	public Usuario read(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

	@Override
	public Usuario update(Usuario al) {
		// TODO Auto-generated method stub
		return repo.save(al);
	}
}

