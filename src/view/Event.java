package view;

import java.util.EventObject;

/**
 * Created by Nandhu on 10-04-2017.
 */
public class Event extends EventObject {
    private  String name,address,phone_no,e_mail,city,code,gen;
    private boolean chk;
    private  int id,count =0;
    public Event(Object source) {
        super(source);
    }
    public Event(Object source,String name,String address,String phone_no,String e_mail,String city,String code,String gen ,boolean chk) {
        super(source);
        this.name = name;
        this.address = address;
        this.e_mail = e_mail;
        this.phone_no = phone_no;
        this.city = city;
        this.code = code;
        this.gen = gen;
        this.chk = chk;

    }

    public int getId() {
        return id;
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

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    public boolean isChk() {
        return chk;
    }

    public void setChk(boolean chk) {
        this.chk = chk;
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
}
