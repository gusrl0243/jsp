package kr.or.ddit.util;

public class CookieUtil {
<<<<<<< HEAD

	private String[] cookieArray;

	public CookieUtil(String cookieString) {
		//  "userId=brown; rememberme=y; test=value"
		//	cookieArray[0] = "userId=brown"
		//	cookieArray[1] = "rememberme=y"
		//	cookieArray[2] = "test=value"
		cookieArray = cookieString.split("; ");
	}

	/**
	 * Method : getCookieValue
	 * 작성자 : SEM
	 * 변경이력 :
	 * @param string
	 * @return
	 * Method 설명 : 쿠키이름에 해당하는 쿠키 값을 조회
	 */
	public String getCookieValue(String cookieName) {
		String cookieValue = "";
		
		for(String cookie : cookieArray){
			if(cookieName.equals(cookie.split("=")[0])){
				cookieValue = cookie.split("=")[1];
				break;
			}
		}
		return cookieValue;
	}
}





=======
	private String[] cookieArray;
	
	public CookieUtil(String cookieString) {
		cookieArray = cookieString.split("; ");
	}

	/**
	 * Method : getCookieValue
	 * 작성자 : pc11
	 * 변경이력 :
	 * @param cookieName
	 * @return
	 * Method 설명 : 쿠키이름에 해당하는 쿠키 값을 조회
	 */
	public String getCookieValue(String cookieName) {
		String cookieValue = "";
		
		for(int i=0; i<cookieArray.length; i++){
			if(cookieName.equals(cookieArray[i].split("=")[0])){
				cookieValue = cookieArray[i].split("=")[1];
				break;
			}
		}
		
		return cookieValue;
	}
	
}
>>>>>>> refs/remotes/origin/master
