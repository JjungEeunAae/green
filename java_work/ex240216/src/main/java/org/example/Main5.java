package org.example;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class Main5 {
    // 윤성우, 남궁성, 김승현
    public static void main(String[] args) {
        LocalDateTime today = LocalDateTime.of(2020, 4, 25, 11, 20);
        LocalDateTime flight1 = LocalDateTime.of(2020, 5, 25, 11, 20);
        LocalDateTime flight2 = LocalDateTime.of(2020, 5, 30, 15, 50);

        LocalDateTime myFlight;

        // 빠른 날짜이나 시간을 찾는 방법
        if(flight1.isBefore(flight2)) {
            myFlight = flight1;
        } else {
            myFlight = flight2;
        }
        System.out.println(myFlight);

        // 날짜차이 계산
        Period p = Period.between(today.toLocalDate(), myFlight.toLocalDate());
        System.out.println(p);  // P1M(하루 차이 난다는 뜻)

        // 시간차이 계산
        Duration d = Duration.between(today.toLocalTime(), myFlight.toLocalTime());
        System.out.println(d);
    }



}
