package org.phone;

public class PhoneInfo {

	private void phoneName() {
		System.out.println("Phone Name is Oneplus");
	}

	private void phoneImeiNum() {
		System.out.println("IMEI Number 1234544444");
	}

	private void camera() {
		System.out.println("Camera id 40px");
	}

	private void storage() {
		System.out.println("Storage 64 GB");
	}

	private void osName() {
		System.out.println("OS is Oxygen OS");
	}

	public static void main(String[] args) {
		PhoneInfo PI = new PhoneInfo();
		PI.phoneName();
		PI.phoneImeiNum();
		PI.camera();
		PI.storage();
		PI.osName();
	}

}
