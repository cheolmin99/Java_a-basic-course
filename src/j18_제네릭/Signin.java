package j18_제네릭;

import j17_최상위클래스.repository.user.User;
import lombok.Getter;

@Getter
public class Signin {
	private User dbUser;
	
	public Signin() {
		dbUser = User.builder()
				.userName("cheolmin")
				.password("1234")
				.name("이철민")
				.email("cjfals8570@naver.com")
				.build();
	}
	
	public Message<Integer, ?> sendsigninMessage(boolean flag) {
		if(flag == true) {
			Message<Integer, User> message = new Message<Integer, User>();
			message.setCode(200);
			message.setData(dbUser);
			return message;
		}else {
			Message<Integer, String> message = new Message<Integer, String>();
			message.setCode(400);
			message.setData("로그인 실패.\n 아이디와 비밀번호를 확인해주세요");
			return message;
		}
		
	}
}
