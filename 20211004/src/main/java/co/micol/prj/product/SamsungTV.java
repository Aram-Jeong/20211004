package co.micol.prj.product;

import co.micol.prj.service.RemoteController;

public class SamsungTV implements RemoteController {

	@Override
	public void powerOn() {
		System.out.println("삼성 TV 전원을 켭니다.");

	}

	@Override
	public void powerOff() {
		System.out.println("삼성 TV 전원을 끕니다.");

	}

}