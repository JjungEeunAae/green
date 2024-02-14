package org.example.OptionalTest;

class Friend {
    String name;
    Company con;

    public Friend(String name, Company con) {
        this.name = name;
        this.con = con;
    }

    public String getName() {
        return name;
    }

    public Company getCon() {
        return con;
    }
}
class Company {
    String cName;
    ContInfo contInfo;

    public Company(String cName, ContInfo contInfo) {
        this.cName = cName;
        this.contInfo = contInfo;
    }

    public String getcName() {
        return cName;
    }

    public ContInfo getContInfo() {
        return contInfo;
    }
}

class ContInfo {
    String addr;
    String phone;

    public ContInfo(String addr, String phone) {
        this.addr = addr;
        this.phone = phone;
    }

    public String getAddr() {
        return addr;
    }

    public String getPhone() {
        return phone;
    }
}

public class OptionalTest {
    public static void main(String[] args) {
        Friend f = new Friend("홍길동", new Company("회사명", null));

        Company com = f.getCon();
        ContInfo con = com.getContInfo();
        if(con != null) {
            String addr = con.getAddr();
            System.out.println("addr = " + addr);
        }
    }
}
