package com.gms.web.board;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.gms.web.command.CommandDTO;
import com.gms.web.member.MemberDTO;
import com.gms.web.member.StudentDTO;
@Component
public interface BoardService {
	public String add(Map<String,Object> map);
	public List<?> list(CommandDTO cmd);
	public List<?> findByName(CommandDTO cmd);
	public StudentDTO findById(CommandDTO cmd);
	public String count(CommandDTO cmd);
	public String modify(MemberDTO bean);
	public String remove(CommandDTO cmd);
	public Map<String,Object> login(MemberDTO bean);
}
