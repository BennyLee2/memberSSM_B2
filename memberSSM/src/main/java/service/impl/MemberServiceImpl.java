package service.impl;

import java.util.List;

import dao.impl.MemberDaoImpl;
import service.ServiceDao;
import vo.Member;

public class MemberServiceImpl implements ServiceDao{

	public static void main(String[] args) {
		
	}

	private static MemberDaoImpl md=new MemberDaoImpl();
	
	@Override
	public void memberAdd(Member m) {
		md.add(m);
		
	}

	@Override
	public String showAll() {
		String show="";
		List<Member> l=md.selectAll();
		for(Member m:l)
		{
			show=show+"<tr><td>"+m.getId()+
					"<td>"+m.getName()+
					"<td>"+m.getUsername()+
					"<td>"+m.getPassword();
		}
		
		return show;
	}

}
