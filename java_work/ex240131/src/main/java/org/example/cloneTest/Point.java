package org.example.cloneTest;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.apachecommons.CommonsLog;

@AllArgsConstructor
@Getter
@Setter
@ToString
public class Point implements Cloneable {
    private int xpos;
    private int ypos;

    // clone 메서드를 정의하려면 cloneable 인터페이스를 상속 받아야 함.

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
