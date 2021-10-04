package co.micol.prj.tryexam;

import java.io.FileNotFoundException;

public class TryCatchTest {

	public void method1() {
		try {
			Class clazz=Class.forName("co.micol.prj.TestInterface");
			System.out.println("원하는 클래스가 존재합니다.");
		}catch(Exception e) {
//			e.printStackTrace();
			System.out.println("예기치 못한 오류가 발생되었습니다.");
			System.out.println("관리자에게 문의하세요.");
		}
	}

}
