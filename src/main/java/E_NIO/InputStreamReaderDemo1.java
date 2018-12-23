package E_NIO;

import java.nio.file.FileSystemNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class InputStreamReaderDemo1 {

    public static void main(String[] args) {
        try {
            Path textfile = Paths.get("./Myfile.txt");
        } catch ( IllegalStateException  e ){
            System.out.println(" :"+ e.getMessage());
        } catch ( FileSystemNotFoundException  e ){
            System.out.println(" :"+ e.getMessage());
        } catch ( SecurityException e){
            System.out.println(" :"+ e.getMessage());
        }
        //
        //
        // System.out.println("The contents of file:" + );
        //System.out.println
        /*Charset chineseSimplifiedCharset =
                Charset.forName("GB2312");
        char[] chars = new char[2];
        chars[0] = '\u4F60'; // representing 你
        chars[1] = '\u597D'; // representing 好;
        */





    }

}
