<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="/Matching_Project/c_common/c_common_css/header.css" type="text/css" media="screen" />
<script type="text/javascript" src="http://code.jquery.com/jquery-1.6.4.min.js"></script>
<script type="text/javascript" src="/Matching_Project/c_common/c_common_js/header.js"></script>
</head>
<body>
	<div class="header">
		<div class="header_top_menu">
				<div class="header_welcome_content">
					<span>아무게</span>			
				</div>
				<ul	class="header_top_menus">
					<li>
						<img alt="center_img" src="/Matching_Project/c_common/c_common_img/header_center_icon.jpg">
						<a href="/Matching_Project/member_center/member_centerMain.jsp">고객 센터</a>
					</li>
					<li>
						<img alt="join_img" src="/Matching_Project/c_common/c_common_img/header_join_icon.jpg">
						<a href="/Matching_Project/join/join_step1.jsp">회원가입</a>
					</li>
					<li>
						<img alt="log_img" src="/Matching_Project/c_common/c_common_img/header_log_icon01.jpg">
						<a href="/Matching_Project/login/login.jsp">로그인</a>
					</li>
					<li>
						<img alt="home_img" src="/Matching_Project/c_common/c_common_img/header_home_icon01.jpg">
						<a href="/Matching_Project/f_main/f_main.jsp">홈</a>
					</li>
				</ul>
					
			</div>	<!--헤더 상단 메뉴 -->
			<div class="header_sns">
				<a href="https://www.facebook.com/produce101" target="_blank" class="header_btn_f">fa</a>
				<a href="https://www.twitter.com/mnetkr" target="_blank" class="header_btn_t">tw</a>
				<a href="https://www.instagram.com/produce101_official" target="_blank" class="header_btn_i">in</a>
			</div>	
			<div class="clock">
				<div id="Date"></div>
					<ul>
						 <li id="hours"> </li>
   						 <li id="point">:</li>
   						 <li id="min"> </li>
   						 <li id="point">:</li>
   						 <li id="sec"> </li>
					</ul>
			</div>
			
			<div class="header_menu">
				<ul class="header_menus">
					<li>
						<a href="/Matching_Project/list/project_list.jsp">프로젝트 목록</a>
					</li>
					<li>
						<a href="/Matching_Project/list/f_list.jsp">프리랜서 목록</a>
					</li>
					<li>
						<a href="/Matching_Project/mypage_free_jsp/myInfo.jsp">마이페이지</a>
					</li>
					<li>
						<a href="/Matching_Project/using_method/f_service.jsp">이용 방법</a>
					</li>
					
				</ul>
			</div>	<!--헤드 메뉴 -->
	</div>
	
</body>
</html>