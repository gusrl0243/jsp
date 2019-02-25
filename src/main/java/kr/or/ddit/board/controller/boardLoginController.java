package kr.or.ddit.board.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.or.ddit.encrypt.kisa.sha256.KISA_SHA256;
import kr.or.ddit.user.model.UserVo;
import kr.or.ddit.user.service.IUserService;
import kr.or.ddit.user.service.UserServiceImpl;

@WebServlet("/board_login")
public class boardLoginController extends HttpServlet{
	private static final long serialVersionUID = 1L;
	private IUserService userService;
	
	
	@Override
	public void init() throws ServletException {
		userService = new UserServiceImpl();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		RequestDispatcher rd = req.getRequestDispatcher("/board/board_login.jsp");
		rd.forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String userId = req.getParameter("userId");
		String password = req.getParameter("password");
		
		UserVo userVo = userService.selectUser(userId);
		
		if(userVo.getUserId().equals(userId)&&
		   userVo.getPass().equals(password)){
			
			HttpSession session = req.getSession();
			session.setAttribute("userVo", userVo);
			
			RequestDispatcher rd = req.getRequestDispatcher("/board_main.jsp");
			rd.forward(req, resp);
		}else{
			RequestDispatcher rd = req.getRequestDispatcher("/board/board_login.jsp");
			rd.forward(req, resp);
		}
	}

}














