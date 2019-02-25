package kr.or.ddit.front;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * controller 실행, 실행 결과로 리턴된 view정보를 리턴
 * @author PC18
 *
 */
public class HandlerInvoker {

	public String invoke(HttpServletRequest req, 
						 HttpServletResponse resp,
						 CommonController controller){
		String viewInfo = controller.process(req, resp);
		return viewInfo;
	}
}
