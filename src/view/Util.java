package view;

/**
 * Created by Nandhu on 17-04-2017.
 */
public class Util  {
public static String getFile(String name ) {
    int index = name.lastIndexOf(".");
    if(index == -1)
        return null;
    if(index == name.length()-1)
        return null;
    String ext = name.substring(index+1, name.length());
return ext;
}

}
