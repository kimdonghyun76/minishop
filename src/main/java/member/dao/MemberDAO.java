package member.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;

import mail.bean.MessageDTO;
import member.bean.MemberDTO;
import member.bean.PostDTO;
import trading.bean.OrderDTO;

public interface MemberDAO {

	MemberDTO login(String id, String pwd);

	MemberDTO checkId(String id);

	int write(MemberDTO memberDTO);

	List<PostDTO> getPostList(Map<String, String> map);

	int modify(MemberDTO memberDTO);
	
	void keepLogin(String id, String sessionId, Date sessionLimit);
	
	MemberDTO checkLoginBefore(String value);

	void deleteMember(String id);

	OrderDTO orderCheck(String id, String pwd);

	MemberDTO getAdmin();

	void memberQASend(MessageDTO messageDTO);

	void setNewPwd(MemberDTO memberDTO);

	MemberDTO findLostId(Map<String, String> map);

	MemberDTO getUser(String id);


} 
