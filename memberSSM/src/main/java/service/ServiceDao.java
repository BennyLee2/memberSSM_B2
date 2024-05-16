package service;

import vo.Member;

public interface ServiceDao {
	//create
	void memberAdd(Member m);
	//read
	String showAll();
}
