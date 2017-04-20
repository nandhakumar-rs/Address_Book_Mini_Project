package model;

import java.io.Serializable;

/**
 * Created by Nandhu on 17-04-2017.
 */
public class Person implements Serializable {
    private static final  long serialVersionUID = -8219218627533074108L;
    private  String name,address,phone_no,e_mail,city,code;
            Gender gen;
    private boolean chk;
    private  int id;
            private static int count =0;

    public Person(String name, String address, String phone_no, String e_mail, String city, String code, Gender gen, boolean chk) {
        this.name = name;
        this.address = address;
        this.phone_no = phone_no;
        this.e_mail = e_mail;
        this.city = city;
        this.code = code;
        this.gen = gen;
        this.chk = chk;
        this.id = count;
count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(String phone_no) {
        this.phone_no = phone_no;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Gender getGen() {
        return gen;
    }

    public void setGen(Gender gen) {
        this.gen = gen;
    }

    public boolean isChk() {
        return chk;
    }

    public void setChk(boolean chk) {
        this.chk = chk;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
