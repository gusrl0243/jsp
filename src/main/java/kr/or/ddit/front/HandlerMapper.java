package kr.or.ddit.front;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author PC18
 * uri 정보를 바탕으로 해당 요청을 처리해줄 컨트롤러를 생성, 반환 해주는 객체
 */
public class HandlerMapper {
	//Map<erl 문자열, url 요청을 처리할 컨트롤러 클래스명
	private Map<String, String> urlControllerMap;

	public HandlerMapper(){
		//db, properties 에서 데이터를 조회해야되나
		//테스트 목적으로 직접 넣어준다.
		urlControllerMap = new HashMap<String, String>();
		
		urlControllerMap.put("/userList.do", "kr.or.ddit.front.UserListController");
		urlControllerMap.put("/rangersList.do", "kr.or.ddit.front.RangersListController");
	}
	/**
	 * uri요청을 처리해줄 pojo controller 리턴
	 * @param uri
	 * @return
	 */
	public CommonController getController(String uri){
		String classInfo = urlControllerMap.get(uri);
		
		//인스턴스를 생성하는 방법
		//1.Integer i = new Integer(); //객체를 생성하기 위해서 [new]연산자를 사용
		//  String msg = "msg"; //예외적인 케이스
		//2.class 정보를 이용하여 객체를 생성 : 문자열 -> 클래스를 생성
		//UserVo userVo = new UserVo();
		//that = this
		CommonController controller = null;
		try {
			Class clazz = Class.forName(classInfo);
			//여기서부터 작업진행----------
//			if(uri.equals("/userList.do")){
//				UserListController controller = (UserListController)clazz.newInstance();
//			}
//			else if(uri.equals("/rangersList.do")){
//				RangersListController controller = (RangerListController) clazz.newInstance();
//			}...
//			
//			
//			
//			
			//각각의 컨트롤러에 interface CommonController를 구현시킴
			controller = (CommonController)clazz.newInstance();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return controller;
	}
} 
