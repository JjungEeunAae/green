package org.example;

public class MyException extends Exception{
    public MyException() {
        super("개발자가 만든 예외");
    }
}

class MyException2 extends Exception{
    public MyException2(String con) {
        super(con);
    }
}


