package org.example.equalsTest;

import lombok.Getter;
import lombok.ToString;
// implements Comparable
@ToString
@Getter
public class INum {
    private int num;

    public INum(int num) {
        this.num = num;
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((INum)obj).num;
    }

    @Override
    public int hashCode() {
        return 10;
    }

    // Arrays.sort를 호출하면 기본형(int, double)타입 정렬이 된다.
    // 객체형타입(INum, Person)을 정렬하려면 Comparable 상속받아서 compareTo 재정의해야한다.

    // 오름차순 : this.num - o.num
    // 내림차순 : o.num - this.num

//    @Override
//    public int compareTo(Object o) {
//        return ((INum) o).num - this.num;
//    }
}
