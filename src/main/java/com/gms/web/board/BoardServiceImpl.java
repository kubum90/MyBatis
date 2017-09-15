package com.gms.web.board;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.gms.web.command.CommandDTO;

import com.gms.web.grade.SubjectDTO;
import com.gms.web.member.MemberDTO;
import com.gms.web.member.StudentDTO;
@Service
public class BoardServiceImpl implements BoardService{
	public static BoardServiceImpl getInstance() {
		return new BoardServiceImpl();
	}
	private BoardServiceImpl(){}
	@Override
	public String add(Map<String,Object> map) {
		System.out.println("member service 진입");
		MemberDTO m=(MemberDTO)map.get("member");
		System.out.println("넘어온 회원 정보:"+m.toString());
		@SuppressWarnings("unchecked")
		List<SubjectDTO>list=(List<SubjectDTO>)map.get("major");
		System.out.println("넘어온 수강과목:"+list);
	

		return null;
	}
	@Override
	public List<?> list(CommandDTO cmd) {
		return null;
	}
	@Override
	public List<?> findByName(CommandDTO cmd) {
		System.out.println("findByName("+cmd.getSearch()+")");
		return null;
	}

	@Override
	public StudentDTO findById(CommandDTO cmd) {
		return null;
	}

	@Override
	public String count(CommandDTO cmd) {
		System.out.println("카운트 (serviceImpl통과)");
		return null;
	}

	@Override
	public String modify(MemberDTO bean) {		
		String msg="";
		return msg;
	}

	@Override
	public String remove(CommandDTO cmd) {
		String msg="";
		
		return msg;
	}
	@Override
	public Map<String,Object> login(MemberDTO bean) {
		Map<String,Object> map=new HashMap<>();
		CommandDTO cmd=new CommandDTO();
		cmd.setSearch(bean.getId());
	
	
		 
		return null;
		
	}
}
