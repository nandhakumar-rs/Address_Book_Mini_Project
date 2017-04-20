package controller;

import model.Database;
import model.Gender;
import model.Person;
import view.Event;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created by Nandhu on 17-04-2017.
 */
public class Controller {
    private  Database db = new Database();
public void fillList(Event event) {
    String name = event.getName();
    String age = event.getAddress();
    String phone = event.getPhone_no();
    String email = event.getE_mail();
    String city = event.getCity();
    String code = event.getCode();
    int id = event.getId();
    boolean chk = event.isChk();
    String gen = event.getGen();
    Gender gender;
    if (gen.equals("male")){
        gender = Gender.male;
    }else {
        gender = Gender.female;
    }
    Person person = new Person(name,age,phone,email,city,code,gender,chk);
    db.addPerson(person);

}
public void savefile(File f){
    try {
        db.savefile(f);
    } catch (IOException e) {
        e.printStackTrace();
    }


}
public void removeData(int row){
    db.removeData(row);
}
public void  openfile(File f){
    try {
        db.openfile(f);
    } catch (IOException e) {
        e.printStackTrace();
    }
}
public  List<Person> getPeople(){
    return db.getPeople();
}
}
