<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ page import="user.UserDTO"%>

<%@ page import="user.UserDAO"%>

<%@ page import="java.io.PrintWriter"%>

<%

	request.setCharacterEncoding("UTF-8");

	String userID = null;

	String userPassword = null;

	if(request.getParameter("userID") != null) {

		userID = (String) request.getParameter("userID");

	}

	if(request.getParameter("userPassword") != null) {

		userPassword = (String) request.getParameter("userPassword");

	}

	UserDAO userDAO = new UserDAO();

	int result = userDAO.login(userID, userPassword);
	if (result == 1) {		//login success

		session.setAttribute("userID", userID);
		PrintWriter script = response.getWriter();
		script.println("<script>");
		script.println("location.href='index.jsp'");
		script.println("</script>");
		script.close();

	} else if (result == 0) {		//wrong password

		PrintWriter script = response.getWriter();

		script.println("<script>");

		script.println("alert('비밀번호가 틀립니다.');");

		script.println("history.back();");

		script.println("</script>");

		script.close();

	} else if (result == -1) {		//wrong id

		PrintWriter script = response.getWriter();

		script.println("<script>");

		script.println("alert('존재하지 않는 아이디입니다.');");

		script.println("history.back();");

		script.println("</script>");

		script.close();

	} else if (result == -2) {		//database

		PrintWriter script = response.getWriter();

		script.println("<script>");

		script.println("alert('데이터베이스 오류가 발생했습니다.');");

		script.println("history.back();");

		script.println("</script>");

		script.close();

	}

%>



출처: https://ndb796.tistory.com/41?category=986634 [안경잡이개발자]