package kr.or.ddit.user.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

<<<<<<< HEAD
import kr.or.ddit.user.model.UserVo;
import kr.or.ddit.util.model.PageVo;

public interface IUserDao {
	
	/**
	 * Method : getAllUser
	 * 작성자 : SEM
	 * 변경이력 :
	 * @return
	 * Method 설명 : 전체 사용자 조회
	 */
	List<UserVo> getAllUser(SqlSession sqlSession);

	/**
	 * Method : selectUser
	 * 작성자 : SEM
	 * 변경이력 :
	 * @param string
	 * @return
	 * Method 설명 : 사용자 조회
	 */
	UserVo selectUser(SqlSession sqlSession, String string);
	
	
	/**
	 * Method : selectUserPagingList
	 * 작성자 : SEM
	 * 변경이력 :
	 * @param pageVo
	 * @return
	 * Method 설명 : 사용자 페이징 리스트 조회
	 */
	List<UserVo> selectUserPagingList(SqlSession sqlSession, PageVo pageVo);
	
	/**
	 * Method : getUserCnt
	 * 작성자 : SEM
	 * 변경이력 :
	 * @return
	 * Method 설명 : 전체 사용자 수를 조회
	 */
	int getUserCnt(SqlSession sqlSession);

	/**
	 * Method : insertUser
	 * 작성자 : SEM
	 * 변경이력 :
	 * @param userVo
	 * @return
	 * Method 설명 : 사용자 등록
	 */
	int insertUser(SqlSession sqlSession, UserVo userVo);
	
	/**
	 * Method : deleteUser
	 * 작성자 : SEM
	 * 변경이력 :
	 * @param userId
	 * @return
	 * Method 설명 : 사용자 삭제
	 */
	int deleteUser(SqlSession sqlSession, String userId);

	/**
	 * Method : updateUser
	 * 작성자 : SEM
	 * 변경이력 :
	 * @param sqlSession
	 * @param userVo
	 * @return
	 * Method 설명 : 사용자 수정
	 */
	int updateUser(SqlSession sqlSession, UserVo userVo);

	/**
	 * Method : updatePass
	 * 작성자 : SEM
	 * 변경이력 :
	 * @param userVo
	 * @return
	 * Method 설명 : 사용자 비밀번호 수정
	 */
	int updatePass(SqlSession sqlSession, UserVo userVo);
}









=======
import kr.or.ddit.user.model.UserVO;
import kr.or.ddit.util.model.PageVO;

public interface IUserDao {
	/**
	 * Method : getAllUser
	 * 작성자 : pc11
	 * 변경이력 :
	 * @return
	 * Method 설명 : 전체 사용자 조회
	 */
	List<UserVO> getAllUser(SqlSession sqlSession);
	
	/**
	 * Method : selectUser
	 * 작성자 : pc11
	 * 변경이력 :
	 * @param userId
	 * @return
	 * Method 설명 : 사용자 조회
	 */
	UserVO selectUser(SqlSession sqlSession,String userId);
	
	/**
	 * Method : selectUserPagingList
	 * 작성자 : pc11
	 * 변경이력 :
	 * @param pageVO
	 * @return
	 * Method 설명 : 사용자 페이지 리스트 조회
	 */
	List<UserVO> selectUserPagingList(SqlSession sqlSession,PageVO pageVO);
	
	/**
	 * Method : getUserCnt
	 * 작성자 : pc11
	 * 변경이력 :
	 * @return
	 * Method 설명 : 전체 사용자 수를 조회
	 */
	int getUserCnt(SqlSession sqlSession);
	
	/**
	 * 
	* Method : insert
	* 작성자 : PC18
	* 변경이력 :
	* @return
	* Method 설명 : 사용자 등록
	 */
	int insert(SqlSession sqlSession,UserVO userVO);
	
	/**
	 * 
	* Method : update
	* 작성자 : PC18
	* 변경이력 :
	* @param userId
	* @return
	* Method 설명 : 사용자 업데이트
	 */
	int update(SqlSession sqlSession, UserVO userVO);
	
	/**
	 * 
	* Method : delete
	* 작성자 : PC18
	* 변경이력 :
	* @return
	* Method 설명 : 사용자 아이디 삭제
	 */
	int deleteUser(SqlSession sqlSession,String userId);
}
>>>>>>> refs/remotes/origin/master
