package view;

import javax.swing.filechooser.FileFilter;
import java.io.File;

/**
 * Created by Nandhu on 17-04-2017.
 */
public class choseFile extends FileFilter {
    @Override
    public boolean accept(File f) {
        String name = f.getName();
       String ext = Util.getFile(name);
       if(ext == null ){
           return  false;
       }
if(ext.equals("adr"))
    return true;
        return false;
    }

    @Override
    public String getDescription() {
        return "Address Book.(*adr)";
    }
}
