package kr.or.ddit.util.controller;

import java.io.IOException;
<<<<<<< HEAD

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookieList")
public class CookieServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//로직처리
		/////////
		
		//화면구성은 jsp로 위임
		req.getRequestDispatcher("/jsp/cookieList.jsp").forward(req, resp);
	}	
}





=======
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookieList")
public class CookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//로직처리
		
		//화면구성은 jsp로 위임
		request.getRequestDispatcher("/jsp/cookieList.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
>>>>>>> refs/remotes/origin/master
