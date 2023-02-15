package network;

import java.io.Serializable;

enum Info {
	JOIN ,EXIT,SEND
}
            //하나의 객체(닉넴,메세지,커멘드) 보내줄려면 Serializable 이거써줘야함        
public class InfoDTO implements Serializable {
	//마치 워드12버전은 10버전에서 못열듯이 버전을 강제로 1L로 맞춰준거
	private static final long serialVersionUID =1L;//모두의 버전을 다 1L로 맞춰줄려고 강제로 정해준거다.
	
	private String nickName;
	private String message;
	private Info command;
	
//----------------------------------------------getter
	
	public String getNickName() {
		return nickName;
	};
	
	public String getMessage() {
		return message;
	};
	
	public Info getCommand() {
		return command;
	};
	
//----------------------------------------------setter
	
	public void setNickName(String nickName) {
		this.nickName = nickName;
	};
	
	public void setMessage(String message) {
		this.message = message;
	};
	
	public void setCommand(Info command) {
		this.command = command;
	};
};