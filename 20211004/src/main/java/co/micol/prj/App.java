package co.micol.prj;

import co.micol.prj.product.LgTV;
import co.micol.prj.product.MyPrint;
import co.micol.prj.product.Pencil4B;
import co.micol.prj.product.Pencil6B;
import co.micol.prj.product.SamsungTV;
import co.micol.prj.service.Pencil;
import co.micol.prj.service.RemoteController;
import co.micol.prj.tryexam.TryCatchTest;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		TryCatchTest trycatchTest = new TryCatchTest();
		try{
			trycatchTest.method1();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("항상 실행하는 구문");
		}

	}
}
