package lancer.e_mypage.model;

import java.io.Serializable;

public class Enterprise implements Serializable{
	private int e_num;		// 기업번호
	private String e_id;		// 기업회원 아이디(접속할때)
	private String e_pwd;	// 기업회원 비밀번호	(접속할때)
	private String e_mail;	// 기업 이메일
	private double e_score;		// 기업평점
	private String e_name;				// 가입자 명
	private String e_ename;			// 기업 이름
	private String e_owner;		// 기업 대표자 명
	private String e_ownerFile;	// 기업 대표자 사진파일 경로
	private String e_regNo;			// 사업자등록번호 ( 123-42322)
	private String e_phone;		// 기업 전화번호
	private String e_bf;					// 업무분야 텍스트
	private String manager_name;		// 담당자 이름
	private String manager_hphone;	// 담당자 핸드폰
	private String manager_mail;		// 담당자 이메일
	private String e_address;			// 기업 주소
	private String e_homepage;			// 기업 홈페이지
	private int start_year;				// 기업 설립년도
	private int e_eNum;				// 기업 사원 수
	private String e_listing;			// 상장여부   (상장, 비상장)
	private int e_capital;		// 자본금
	private int e_sales;		// 연매출
	private String e_scale;			// 기업규모 (대기업, 중소기업, 개인)
	private String e_licenseFile;		// 사업자등록증 사진파일 경로
	private String e_check;		// 이메일인증을 통한 가입승인여부   가입승인됬을시 1,  인증 아직 안했으면 0
	
	public Enterprise(){}

	public Enterprise(int e_num, String e_id, String e_pwd, String e_mail, double e_score, String e_name,
			String e_ename, String e_owner, String e_ownerFile, String e_regNo, String e_phone, String e_bf,
			String manager_name, String manager_hphone, String manager_mail, String e_address, String e_homepage,
			int start_year, int e_eNum, String e_listing, int e_capital, int e_sales, String e_scale,
			String e_licenseFile, String e_check) {
		super();
		this.e_num = e_num;
		this.e_id = e_id;
		this.e_pwd = e_pwd;
		this.e_mail = e_mail;
		this.e_score = e_score;
		this.e_name = e_name;
		this.e_ename = e_ename;
		this.e_owner = e_owner;
		this.e_ownerFile = e_ownerFile;
		this.e_regNo = e_regNo;
		this.e_phone = e_phone;
		this.e_bf = e_bf;
		this.manager_name = manager_name;
		this.manager_hphone = manager_hphone;
		this.manager_mail = manager_mail;
		this.e_address = e_address;
		this.e_homepage = e_homepage;
		this.start_year = start_year;
		this.e_eNum = e_eNum;
		this.e_listing = e_listing;
		this.e_capital = e_capital;
		this.e_sales = e_sales;
		this.e_scale = e_scale;
		this.e_licenseFile = e_licenseFile;
		this.e_check = e_check;
	}

	public int getE_num() {
		return e_num;
	}

	public void setE_num(int e_num) {
		this.e_num = e_num;
	}

	public String getE_id() {
		return e_id;
	}

	public void setE_id(String e_id) {
		this.e_id = e_id;
	}

	public String getE_pwd() {
		return e_pwd;
	}

	public void setE_pwd(String e_pwd) {
		this.e_pwd = e_pwd;
	}

	public String getE_mail() {
		return e_mail;
	}

	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}

	public double getE_score() {
		return e_score;
	}

	public void setE_score(double e_score) {
		this.e_score = e_score;
	}

	public String getE_name() {
		return e_name;
	}

	public void setE_name(String e_name) {
		this.e_name = e_name;
	}

	public String getE_ename() {
		return e_ename;
	}

	public void setE_ename(String e_ename) {
		this.e_ename = e_ename;
	}

	public String getE_owner() {
		return e_owner;
	}

	public void setE_owner(String e_owner) {
		this.e_owner = e_owner;
	}

	public String getE_ownerFile() {
		return e_ownerFile;
	}

	public void setE_ownerFile(String e_ownerFile) {
		this.e_ownerFile = e_ownerFile;
	}

	public String getE_regNo() {
		return e_regNo;
	}

	public void setE_regNo(String e_regNo) {
		this.e_regNo = e_regNo;
	}

	public String getE_phone() {
		return e_phone;
	}

	public void setE_phone(String e_phone) {
		this.e_phone = e_phone;
	}

	public String getE_bf() {
		return e_bf;
	}

	public void setE_bf(String e_bf) {
		this.e_bf = e_bf;
	}

	public String getManager_name() {
		return manager_name;
	}

	public void setManager_name(String manager_name) {
		this.manager_name = manager_name;
	}

	public String getManager_hphone() {
		return manager_hphone;
	}

	public void setManager_hphone(String manager_hphone) {
		this.manager_hphone = manager_hphone;
	}

	public String getManager_mail() {
		return manager_mail;
	}

	public void setManager_mail(String manager_mail) {
		this.manager_mail = manager_mail;
	}

	public String getE_address() {
		return e_address;
	}

	public void setE_address(String e_address) {
		this.e_address = e_address;
	}

	public String getE_homepage() {
		return e_homepage;
	}

	public void setE_homepage(String e_homepage) {
		this.e_homepage = e_homepage;
	}

	public int getStart_year() {
		return start_year;
	}

	public void setStart_year(int start_year) {
		this.start_year = start_year;
	}

	public int getE_eNum() {
		return e_eNum;
	}

	public void setE_eNum(int e_eNum) {
		this.e_eNum = e_eNum;
	}

	public String getE_listing() {
		return e_listing;
	}

	public void setE_listing(String e_listing) {
		this.e_listing = e_listing;
	}

	public int getE_capital() {
		return e_capital;
	}

	public void setE_capital(int e_capital) {
		this.e_capital = e_capital;
	}

	public int getE_sales() {
		return e_sales;
	}

	public void setE_sales(int e_sales) {
		this.e_sales = e_sales;
	}

	public String getE_scale() {
		return e_scale;
	}

	public void setE_scale(String e_scale) {
		this.e_scale = e_scale;
	}

	public String getE_licenseFile() {
		return e_licenseFile;
	}

	public void setE_licenseFile(String e_licenseFile) {
		this.e_licenseFile = e_licenseFile;
	}

	public String getE_check() {
		return e_check;
	}

	public void setE_check(String e_check) {
		this.e_check = e_check;
	}
	
		
}
