import java.io.File;

public class CheckDirectory {
    public CheckDirectory(String path){
        File f = new File(path);
        if (f.exists())
        {
            System.out.println("Подкотолог или файл - существует");
        }
        else
        {
            System.out.println("Подкатолога или файла нет");
        }
    }
}
