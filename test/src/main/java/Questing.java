/**
 * 테스트 코드를 보고, 아래 두 method 를 작성해주세요.
 */
class Questing {
	static int quest1(double d)  {
		// FIXME
		int result = 0;
		
		result = (int) (d / 2);
		
		return result;
	}

	static boolean quest2(String s) {
		// FIXME
		boolean result;
		
		if("({}[])".equals(s)) {
			result = true;
		} else {
			result = false;
		}
		
		return result;
	}
}
