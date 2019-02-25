package kr.or.ddit.user.dao;

import java.util.List;

<<<<<<< HEAD
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import kr.or.ddit.db.mybatis.MybatisSqlSessionFactory;
import kr.or.ddit.user.model.UserVo;
import kr.or.ddit.util.model.PageVo;

public class UserDaoImpl implements IUserDao{
	
	/**
	 * Method : getAllUser
	 * 작성자 : SEM
	 * 변경이력 :
	 * @return
	 * Method 설명 : 전체 사용자 조회
	 */
	public List<UserVo> getAllUser(SqlSession sqlSession){
		return sqlSession.selectList("user.getAllUser");
	}

	/**
	 * Method : selectUser
	 * 작성자 : SEM
	 * 변경이력 :
	 * @param userId
	 * @return
	 * Method 설명 : 사용자 조회
	 */
	@Override
	public UserVo selectUser(SqlSession sqlSession, String userId) {
		UserVo userVo = sqlSession.selectOne("user.selectUser", userId);		
		return userVo;
	}

	/**
	 * Method : selectUserPagingList
	 * 작성자 : SEM
	 * 변경이력 :
	 * @param pageVo
	 * @return
	 * Method 설명 : 사용자 페이징 리스트 조회
	 */
	@Override
	public List<UserVo> selectUserPagingList(SqlSession sqlSession, PageVo pageVo) {
		return sqlSession.selectList("user.selectUserPagingList", pageVo);
	}

	/**
	 * Method : getUserCnt
	 * 작성자 : SEM
	 * 변경이력 :
	 * @return
	 * Method 설명 : 전체 사용자 수를 조회
	 */
	@Override
	public int getUserCnt(SqlSession sqlSession) {
		return sqlSession.selectOne("user.getUserCnt");
	}

	/**
	 * Method : insertUser
	 * 작성자 : SEM
	 * 변경이력 :
	 * @param userVo
	 * @return
	 * Method 설명 : 사용자 등록
	 */
	@Override
	public int insertUser(SqlSession sqlSession, UserVo userVo) {
		return sqlSession.insert("user.insertUser", userVo);
	}

	/**
	 * Method : deleteUser
	 * 작성자 : SEM
	 * 변경이력 :
	 * @param userId
	 * @return
	 * Method 설명 : 사용자 삭제
	 */
	@Override
	public int deleteUser(SqlSession sqlSession, String userId) {
		return sqlSession.delete("user.deleteUser", userId);
	}

	/**
	 * Method : updateUser
	 * 작성자 : SEM
	 * 변경이력 :
	 * @param sqlSession
	 * @param userVo
	 * @return
	 * Method 설명 : 사용자 정보 수정
	 */
	@Override
	public int updateUser(SqlSession sqlSession, UserVo userVo) {
		return sqlSession.update("user.updateUser", userVo);
	}

	/**
	 * Method : updatePass
	 * 작성자 : SEM
	 * 변경이력 :
	 * @param userVo
	 * @return
	 * Method 설명 : 사용자 비밀번호 수정
	 */
	@Override
	public int updatePass(SqlSession sqlSession, UserVo userVo) {
		return sqlSession.update("user.updatePass", userVo);
	}
}









=======
import kr.or.ddit.db.mybatis.MybatisSqlSessionFactory;
import kr.or.ddit.user.model.UserVO;
import kr.or.ddit.util.model.PageVO;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class UserDaoImpl implements IUserDao{
	private SqlSessionFactory sqlSessionFactory;
	private SqlSession sqlSession;
	public UserDaoImpl(){
		sqlSessionFactory = MybatisSqlSessionFactory.getSqlSessionFactory();
	}
	
	/**
	 * Method : getAllUser
	 * 작성자 : pc11
	 * 변경이력 :
	 * @return
	 * Method 설명 : 전체 사용자 조회
	 */
	@Override
	public List<UserVO> getAllUser(SqlSession sqlSession){

		List<UserVO> userList = sqlSession.selectList("user.getAllUser");

		
		return userList;
	}
	
	/**
	 * Method : selectUser
	 * 작성자 : pc11
	 * 변경이력 :
	 * @param userId
	 * @return
	 * Method 설명 : 사용자 조회
	 */
	@Override
	public UserVO selectUser(SqlSession sqlSession,String userId){
		
		UserVO userVO = sqlSession.selectOne("user.selectUser", userId);

		
		return userVO;
	}

	/**
	 * Method : selectUserPagingList
	 * 작성자 : pc11
	 * 변경이력 :
	 * @param pageVO
	 * @return
	 * Method 설명 : 사용자 페이징 리스트 조회
	 */
	@Override
	public List<UserVO> selectUserPagingList(SqlSession sqlSession, PageVO pageVO) {

		List<UserVO> userList = sqlSession.selectList("user.selectUserPagingList", pageVO);

		
		return userList;
	}

	/**
	 * Method : getUserCnt
	 * 작성자 : pc11
	 * 변경이력 :
	 * @return
	 * Method 설명 : 전체 사용자 수를 조회
	 */
	@Override
	public int getUserCnt(SqlSession sqlSession) {
		int userCnt = sqlSession.selectOne("user.getUserCnt");
		return userCnt;
	}

	/**
	 * 
	* Method : insert
	* 작성자 : PC18
	* 변경이력 :
	* @return
	* Method 설명 : 사용자 등록
	 */
	@Override
	public int insert(SqlSession sqlSession,UserVO userVO) {
		int insertCnt = sqlSession.insert("user.insertUser", userVO);
		return insertCnt;
	}

	/**
	 * 
	* Method : update
	* 작성자 : PC18
	* 변경이력 :
	* @param userId
	* @return
	* Method 설명 : 사용자 업데이트
	 */
	@Override
	public int update(SqlSession sqlSession,UserVO userVO) {
		int updateCnt = sqlSession.update("user.updateUser", userVO);
		return updateCnt;
	}

	/**
	 * 
	* Method : delete
	* 작성자 : PC18
	* 변경이력 :
	* @return
	* Method 설명 : 사용자 아이디 삭제
	 */
	@Override
	public int deleteUser(SqlSession sqlSession,String userId) {
		int deletetCnt = sqlSession.delete("user.deleteUser", userId);
		return deletetCnt;
	}
}
>>>>>>> refs/remotes/origin/master
