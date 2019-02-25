package kr.or.ddit.front;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface CommonController{
	
	/**
	 * 컨트롤러 실행
	 * @param req
	 * @param resp
	 * @return 뷰 정보
	 */
	public String process(HttpServletRequest req, HttpServletResponse resp);
	
}
