package com.cognizant.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.model.User;
import com.cognizant.repository.Userrepo;

@Service
public class Userservice {
@Autowired
Userrepo userrepo;
public void saveUser(User user) {
	userrepo.save(user);
}

public Iterable<User> showAllUsers(){
	return userrepo.findAll();
}

public Iterable<User> deleteById(int cognizantemployeeid){
	userrepo.deleteById(cognizantemployeeid);
	return userrepo.findAll();
	
}
public User findById(int cognizantemployeeid) {
	return userrepo.findById(cognizantemployeeid);
}

public User update(User user) {
	int id = user.getCognizantemployeeid();
	//String email = user.getEmail();
	//User usr =userrepo.findById(email).get();
	User usr = userrepo.findById(id);
	usr.setCognizantemployeeid(user.getCognizantemployeeid());
	usr.setEmployeename(user.getEmployeename());
	usr.setDukeenergylanid(user.getDukeenergylanid());
	usr.setDukeenergyemployeeid(user.getDukeenergyemployeeid());
	usr.setProjectid(user.getProjectid());
	usr.setProjectname(user.getProjectname());
	usr.setOffshoremanagername(user.getOffshoremanagername());
	usr.setOnsitemanagername(user.getOnsitemanagername());
	usr.setStatus(user.getStatus());
	usr.setDateonboarded(user.getDateonboarded());
	usr.setDateoffboarded(user.getDateoffboarded());
	usr.setPhonenumber(user.getPhonenumber());
	usr.setOnsiteoffshore(user.getOnsiteoffshore());
	usr.setLocation(user.getLocation());
	return userrepo.save(usr);
}
public Userservice() {
	
}
public Userservice(Userrepo userrepo) {
	super();
	this.userrepo = userrepo;
}


}
