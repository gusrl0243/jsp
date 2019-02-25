package kr.or.ddit.front;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ViewResolver {
	
	/**
	 * viewInfo를 바탕으로 view처리 대상으로 위임 
	 * @param viewInfo
	 */
	public void viewResolve(HttpServletRequest req,
							HttpServletResponse resp,
							String viewInfo){
		if(viewInfo.startsWith("forward:")){
			//unhappysubstring(2)==happy
			//forward:/front/userList.jsp
			String uri = viewInfo.substring("forward:".length());
			
			try {
				req.getRequestDispatcher(uri).forward(req, resp);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}else if(viewInfo.startsWith("redirect:")){
			String uri = viewInfo.substring("redirect:".length());
		}else{
			//error
		}
	}

}
