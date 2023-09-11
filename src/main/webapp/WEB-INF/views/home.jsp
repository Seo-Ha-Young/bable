<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<style>
	body {
	width: 100%;
	height: 100%;
	}
	#header {
	width: 100%;
	height: 10%;
	  border : 1px solid black;
  border-collapse : collapse;
  text-align: center;
	}
		.title {
		font-size: 80px;
		text-align: left;
		}
		.old, .new, .qna {
		
		text-align: center;
		font-size: 35px;

		
		}
		.login {
		float: right;

		}
		
	</style>
	<script type="text/javascript">

	</script>
</head>
<body>
<div id='header'>
	<a  class="title">bable</a>
	<a class="old">구약</a>
	<a class="new">신약</a>
	<a class="qna">요청사항</a>
	<a class="login">로그인</a>
</div>
<P>  The time on the server is ${serverTime}. </P>
</body>
</html>
