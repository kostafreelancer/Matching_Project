package lancer.c_login.model;

public class c_login {
	private String c_id;
	private String pwd;
	public c_login(){}
	public c_login(String c_id, String pwd) {
		super();
		this.c_id = c_id;
		this.pwd = pwd;
	}
	public String getC_id() {
		return c_id;
	}
	public void setC_id(String c_id) {
		this.c_id = c_id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
}
