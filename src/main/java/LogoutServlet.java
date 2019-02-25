import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/loglj")
public class LogoutServlet  extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//logout 기능
				//session 객체를 무효화
				//1. 정해진 시간이 지날 경우 무효화
				//2. session.invalidate(); 
				
				//session 활설화 시간 설정
				//1. session.setMaxInactiveInterval(interval);
				//2. web.xml 등록
				//	<session-config>
				//	  	<session-timeout>분단위</session-timeout>
				//	</session-config>
				
				HttpSession session = req.getSession();
				session.invalidate();
				
				// 로그인 페이지로 이동
				req.getRequestDispatcher(req.getContextPath() + "/login").forward(req, resp);
	}


}
