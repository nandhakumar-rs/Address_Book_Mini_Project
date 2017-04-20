package model;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Nandhu on 17-04-2017.
 */
public class Database {

    private  List<Person> people;
    public  Database(){
        people = new LinkedList<>();
    }
    public void addPerson( Person person){
        people.add(person);
    }
    public List<Person> getPeople(){
        return Collections.unmodifiableList(people);

    }
    public void openfile(File f)throws IOException{
FileInputStream fis = new FileInputStream(f);
ObjectInputStream ois = new ObjectInputStream(fis);
        try {
            Person[] person = (Person[]) ois.readObject();
            people.clear();
            people.addAll(Arrays.asList(person));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        ois.close();
    }
        public void savefile(File f)throws IOException{
            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
         Person person[] = people.toArray(new Person[people.size()]);
         oos.writeObject(person);
         oos.close();
    }
    public void removeData(int row){
        people.remove(row);
    }
}
