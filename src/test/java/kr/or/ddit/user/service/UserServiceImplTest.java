package kr.or.ddit.user.service;

<<<<<<< HEAD
import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

import kr.or.ddit.user.dao.IUserDao;
import kr.or.ddit.user.dao.UserDaoImpl;
import kr.or.ddit.user.model.UserVo;
import kr.or.ddit.util.model.PageVo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UserServiceImplTest {

	private IUserService userService;
	
	@Before
	public void setup(){
		userService = new UserServiceImpl();
		userService.deleteUser("test1");
	}
	
	
	/**
	 * Method : testGetAllUser
	 * 작성자 : SEM
	 * 변경이력 :
	 * Method 설명 : 전체 사용자 조회 테스트
	 */
	@Test
	public void testGetAllUser() {
		/***Given***/
			
		/***When***/
		List<UserVo> userList = userService.getAllUser();
		for(UserVo userVo : userList)
			System.out.println(userVo);

		/***Then***/
		assertNotNull(userList);
		assertEquals(105, userList.size());
	}
	
	/**
	 * Method : testSelectUser
	 * 작성자 : SEM
	 * 변경이력 :
	 * Method 설명 : 사용자 조회 테스트
	 */
	@Test
	public void testSelectUser(){
		/***Given***/
			
		/***When***/
		UserVo userVo = userService.selectUser("brown");

		/***Then***/
		assertEquals("brown", userVo.getUserId());
		assertEquals("brown1234", userVo.getPass());
	}
	
	/**
	 * Method : testSelectUserNotExists
	 * 작성자 : SEM
	 * 변경이력 :
	 * Method 설명 : 존재하지 않는 사용자 조회 테스트
	 */
	@Test
	public void testSelectUserNotExists(){
		/***Given***/
			
		/***When***/
		UserVo userVo = userService.selectUser("brownNotExists");

		/***Then***/
		assertNull(userVo);
	}
	
	
	/**
	 * Method : testSelectUserPagingList
	 * 작성자 : SEM
	 * 변경이력 :
	 * Method 설명 : 사용자 페이징 리스트 조회 테스트
	 */
	@Test
	public void testSelectUserPagingList(){
		/***Given***/
		PageVo pageVo = new PageVo(1, 10);
		
		/***When***/
		Map<String, Object> resultMap =
				userService.selectUserPagingList(pageVo);
		
		List<UserVo> userList = (List<UserVo>)resultMap.get("userList");
		int userCnt = (Integer)resultMap.get("userCnt");
		
		for(UserVo user : userList)
			System.out.println(user);
		
		System.out.println("userCnt : " + userCnt);
		
		/***Then***/
		//userList
		assertNotNull(userList);
		assertEquals(10, userList.size());
		
		//userCnt
		assertEquals(105, userCnt);
	}
	
	/**
	 * Method : testInsertUser
	 * 작성자 : SEM
	 * 변경이력 :
	 * Method 설명 : 사용자 등록 테스트
	 */
	@Test
	public void testInsertUser(){
		/***Given***/
		UserVo userVo = new UserVo();
		userVo.setUserId("test1");
		userVo.setUserNm("테스트");
		userVo.setAlias("별명");
		userVo.setAddr1("대전 중구 대흥로 76");
		userVo.setAddr2("2층 ddit");
		userVo.setZipcode("34942");
		userVo.setPass("testpass");
		
		/***When***/
		int insertCnt = userService.insertUser(userVo);

		/***Then***/
		assertEquals(1, insertCnt);
	}
	
	/**
	 * Method : testUpdateUser
	 * 작성자 : SEM
	 * 변경이력 :
	 * Method 설명 : 사용자 정보 수정 테스트
	 */
	@Test
	public void testUpdateUser(){
		/***Given***/
		UserVo userVo = new UserVo();
		userVo.setUserId("test1");
		userVo.setUserNm("테스트");
		userVo.setAlias("별명");
		userVo.setAddr1("대전 중구 대흥로 76");
		userVo.setAddr2("2층 ddit");
		userVo.setZipcode("34942");
		userVo.setPass("testpass");
		int insertCnt = userService.insertUser(userVo);
		
		/***When***/
		userVo.setUserNm("테스트_변경");
		int updateCnt = userService.updateUser(userVo);
		UserVo selectUser = userService.selectUser(userVo.getUserId());
		
		/***Then***/
		assertEquals(1, insertCnt);
		assertEquals(1, updateCnt);
		assertEquals("테스트_변경", selectUser.getUserNm());
	}
	
	/**
	 * Method : testEncryptPass
	 * 작성자 : SEM
	 * 변경이력 :
	 * Method 설명 : 사용자 비밀번호 일괄 변경
	 */
	@Test
	public void testEncryptPass(){
		/***Given***/
		
		/***When***/
		int updateCnt = userService.encryptPass();

		/***Then***/
		assertEquals(110, updateCnt);

	}
}





=======
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;
import java.util.Map;

import kr.or.ddit.user.model.UserVO;
import kr.or.ddit.util.model.PageVO;

import org.junit.Before;
import org.junit.Test;

public class UserServiceImplTest {
	private IUserService userService;
	
	@Before
	public void setup(){
		userService = new UserServiceImpl();
	}

	@Test
	public void testGetAllUser() {
		/***Given***/
		
		/***When***/
		List<UserVO> list = userService.getAllUser();
		
		/***Then***/
		assertNotNull(list);
		assertEquals(106, list.size());
	}
	
	@Test
	public void testSelectUser(){
		/***Given***/
		
		/***When***/
		UserVO userVO = userService.selectUser("brown");

		/***Then***/
		assertNotNull(userVO);
	}
	
	@Test
	public void testSelectUserPagingList(){
		/***Given***/
		PageVO pageVO = new PageVO(1, 10);
		
		/***When***/
		Map<String, Object> resultMap = userService.selectUserPagingList(pageVO);
		List<UserVO> userList = (List<UserVO>)resultMap.get("userList");
		int userCnt = (Integer)resultMap.get("userCnt");
		
		for(UserVO vo : userList){
			System.out.println(vo.toString());
		}
		
		System.out.println("userCnt : " + userCnt);

		/***Then***/
		//userList
		assertNotNull(userList);
		assertEquals(10, userList.size());
		
		//userCnt
		assertEquals(106, userCnt);
	}
	
	@Test
	public void testInsertUser(){
		/***Given***/
		UserVO userVO = new UserVO();
		userVO.setUserId("test01");
		userVO.setUserNm("asdf");
		userVO.setAlias("asdf");
		userVO.setAddr1("asdf");
		userVO.setAddr2("asdf");
		userVO.setZipcode("asdf");
		userVO.setPass("testpass");
		
		/***When***/
		int result = userService.insertUser(userVO);
		/***Then***/
		assertEquals(1, result);

	}
	
}
>>>>>>> refs/remotes/origin/master
