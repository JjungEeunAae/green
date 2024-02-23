package org.example.member;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class MemberDTO {
    private String email;
    private String name;
    private String password;
    private String confirmpPssword;

    public boolean isEqualPassword() {
        return password.equals(confirmpPssword);
    }
}
