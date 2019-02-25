package kr.or.ddit.lprod.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import kr.or.ddit.db.mybatis.MybatisSqlSessionFactory;
<<<<<<< HEAD
import kr.or.ddit.lprod.model.LprodVo;
import kr.or.ddit.util.model.PageVo;

public class LprodDaoImpl implements ILprodDao {

	/**
	 * Method : getAllLprod
	 * 작성자 : SEM
	 * 변경이력 :
	 * @return
	 * Method 설명 : 제품 카테고리 전체 조회
	 */
	@Override
	public List<LprodVo> getAllLprod() {
		SqlSessionFactory sqlSessionFactory = MybatisSqlSessionFactory.getSqlSessionFactory();
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<LprodVo> lprodList = sqlSession.selectList("lprod.getAllLprod");
		sqlSession.close();
		return lprodList;
	}

	/**
	 * Method : selectLprodPagingList
	 * 작성자 : SEM
	 * 변경이력 :
	 * @param pageVo
	 * @return
	 * Method 설명 : 제품 카테고리 페이징 조회
	 */
	@Override
	public List<LprodVo> selectLprodPagingList(PageVo pageVo) {
		SqlSessionFactory sqlSessionFactory = MybatisSqlSessionFactory.getSqlSessionFactory();
		SqlSession sqlSession = sqlSessionFactory.openSession();
		List<LprodVo> lprodList = sqlSession.selectList("lprod.selectLprodPagingList", pageVo);
		sqlSession.close();
		return lprodList;
	}

	/**
	 * Method : getLprodCnt
	 * 작성자 : SEM
	 * 변경이력 :
	 * @return
	 * Method 설명 : 제품 카테고리 전체 건수 조회
	 */
	@Override
	public int getLprodCnt() {
		SqlSessionFactory sqlSessionFactory = MybatisSqlSessionFactory.getSqlSessionFactory();
		SqlSession sqlSession = sqlSessionFactory.openSession();
		int totalCnt = sqlSession.selectOne("lprod.getLprodCnt");
		sqlSession.close();
		return totalCnt;
	}

}
=======
import kr.or.ddit.lprod.model.LprodVO;
import kr.or.ddit.lprod.model.ProdVO;
import kr.or.ddit.util.model.PageVO;

public class LprodDaoImpl implements ILprodDao{
	private SqlSessionFactory sqlSessionFactory;
	private SqlSession sqlSession;
	public LprodDaoImpl(){
		sqlSessionFactory = MybatisSqlSessionFactory.getSqlSessionFactory();
	}
	
	/**
	 * Method : getAllLprod
	 * 작성자 : pc11
	 * 변경이력 :
	 * @return
	 * Method 설명 : 전체 lprod 리스트 조회
	 */
	@Override
	public List<LprodVO> getAllLprod() {
		sqlSession = sqlSessionFactory.openSession();
		List<LprodVO> list = sqlSession.selectList("lprod.getAllLprod");
		sqlSession.close();
		
		return list;
	}

	/**
	 * Method : selectProd
	 * 작성자 : pc11
	 * 변경이력 :
	 * @param lprod_gu
	 * @return
	 * Method 설명 : lprod에 해당하는 prod 리스트 조회
	 */
	@Override
	public List<ProdVO> selectProd(String lprod_gu) {
		sqlSession = sqlSessionFactory.openSession();
		List<ProdVO> list = sqlSession.selectList("lprod.selectProd", lprod_gu);
		sqlSession.close();
		
		return list;
	}

	/**
	 * Method : selectLprodPagingList
	 * 작성자 : pc11
	 * 변경이력 :
	 * @param pageVO
	 * @return
	 * Method 설명 : lprod 페이지 리스트 조회
	 */
	@Override
	public List<LprodVO> selectLprodPagingList(PageVO pageVO) {
		sqlSession = sqlSessionFactory.openSession();
		List<LprodVO> lprodList = sqlSession.selectList("lprod.selectLprodPagingList", pageVO);
		sqlSession.close();
		
		return lprodList;
	}

	/**
	 * Method : getLprodCnt
	 * 작성자 : pc11
	 * 변경이력 :
	 * @return
	 * Method 설명 : 전체 lprod수 조회
	 */
	@Override
	public int getLprodCnt() {
		sqlSession = sqlSessionFactory.openSession();
		int lprodCnt = sqlSession.selectOne("lprod.getLprodCnt");
		sqlSession.close();
		
		return lprodCnt;
	}
	
}
>>>>>>> refs/remotes/origin/master
