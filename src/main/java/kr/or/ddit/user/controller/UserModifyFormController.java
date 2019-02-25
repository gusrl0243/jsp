package kr.or.ddit.user.controller;

import java.io.IOException;
<<<<<<< HEAD
import java.net.URLEncoder;
import java.util.UUID;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import kr.or.ddit.user.model.UserVo;
import kr.or.ddit.user.service.IUserService;
import kr.or.ddit.user.service.UserServiceImpl;
import kr.or.ddit.util.PartUtil;

@WebServlet("/userModifyForm")
@MultipartConfig(maxFileSize=5*1024*1024, maxRequestSize=5*5*1024*1024)
public class UserModifyFormController extends HttpServlet{
	
	private IUserService userService;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		userService = new UserServiceImpl();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//사용자 정보 조회
		String userId = req.getParameter("userId");
		UserVo userVo = userService.selectUser(userId);
		req.setAttribute("userVo", userVo);
		
		req.getRequestDispatcher("/user/userModifyForm.jsp")
			.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		
		//사용자 정보 확인
		String userId = req.getParameter("userId");
		String userNm = req.getParameter("userNm");
		String alias = req.getParameter("alias");
		String addr1 = req.getParameter("addr1");
		String addr2 = req.getParameter("addr2");
		String zipcode = req.getParameter("zipcode");
		String pass = req.getParameter("pass");
				
		UserVo userVo = new UserVo(userId, userNm, alias, addr1, addr2, zipcode, pass);
		
		//사용자 사진
		Part profilePart = req.getPart("profile");
		
		//사용자가 사진을 올린 경우
		String filename = "";
		String realFilename = "";
		
		if(profilePart.getSize() > 0){
			//사용자 테이블 파일명을 저장
			//(실제 업로드한 파일명-filename,
			// 파일 충돌을 방지하기 위해 사용한 uuid = realFilename)
			String contentDisposition 
					= profilePart.getHeader("Content-Disposition");
			
			filename = PartUtil.getFileNameFromPart(contentDisposition);
			realFilename = "d:\\picture\\" + UUID.randomUUID().toString();
			
			//디스크에 기록 ( d:\picture\ + realFileName)
			profilePart.write(realFilename);
		}
		//사용자가 사진을 올리지 않은 경우
		
		userVo.setFilename(filename);
		userVo.setRealFilename(realFilename);
		
		int updateCnt = userService.updateUser(userVo);
		
		//사용자 정보 수정 정상 : 사용자 상세 조회 페이지 이동
		if(updateCnt == 1)
			resp.sendRedirect(req.getContextPath() + "/user?userId=" + userId);
		//사용자 정보 수정 실패 : 사용자 등록 페이지 이동
		else
			doGet(req, resp);
		
	}

	
=======
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import kr.or.ddit.user.dao.IUserDao;
import kr.or.ddit.user.model.UserVO;
import kr.or.ddit.user.service.IUserService;
import kr.or.ddit.user.service.UserServiceImpl;


@WebServlet("/userModifyForm")
public class UserModifyFormController extends HttpServlet{
	private IUserService userService;
	
	
	@Override
	public void init() throws ServletException {
		userService = new UserServiceImpl();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.getRequestDispatcher("/user/userModifyForm.jsp").forward(req,resp);
	}

	/**
	* 
	* Method : doPost
	* 작성자 : PC18
	* 변경이력 :
	* @param req
	* @param resp
	* @throws ServletException
	* @throws IOException
	* Method 설명 : 사용자 정보 등록
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		//1.사용자 아이디 중복체크
		String userId = req.getParameter("userId");
		UserVO duplicateuserVO = userService.selectUser(userId);
		
		//2-1중복체크 통과 : 사용자 정보를 db에 입력
		//2-1-1.사용자 페이징 리스트 1페이지로 이동
		if(duplicateuserVO == null){
			String userNm 	= req.getParameter("userNm");
			String alias	= req.getParameter("alias");
			String addr1	= req.getParameter("addr1");
			String addr2	= req.getParameter("addr2");
			String zipcode	= req.getParameter("zipcode");
			String pass		= req.getParameter("pass");
			UserVO userVO = new UserVO(userId, userNm, alias, addr1,addr2,zipcode,pass);
			int insertCnt = userService.insertUser(userVO);
			
			//정상입력
			if(insertCnt ==1){
				//req.getRequestDispatcher("/userPagingList").forward(req, resp);
				req.getSession().setAttribute("msg", "정상 등록 되었습니다.");
				resp.sendRedirect(req.getContextPath()+"/userPagingList");
			}
			//정상입력(실패)
			else{
				doGet(req,resp);
			}
			
			
		}
		//2-2.중복체크 통과 실패 : 사용자 등록페이지로 이동
		else{
//			req.getRequestDispatcher("/userForm").forward(req, resp);
			req.setAttribute("msg", "중복체크에 실패 했습니다.");
			doGet(req, resp);

		}
	}

>>>>>>> refs/remotes/origin/master
}
