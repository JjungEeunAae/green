package org.example;
public class SmartPhone extends MobilePhone {
    // 부모를 상속한 자식 클래스는 부모 클래스에 기본 생성자가 없으면 오류가 발생한다.
    // public MobilePhone() {super();};

    private String androidVer;

    public SmartPhone(String number, String ver) {
        super(number);
        this.androidVer = ver;
    }

    public void playApp() {
        System.out.println("앱 실행, 안드로이드 버전 : " + androidVer);
    }
}

