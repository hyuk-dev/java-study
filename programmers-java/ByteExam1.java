import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteExam1 {
    public static void main(String[] args) throws IOException {
        long t = System.currentTimeMillis();
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try{
            fis = new FileInputStream ("programmers-java/ByteExam1.java");
            fos = new FileOutputStream ("byte.txt");

            int readData = -1;
            while((readData = fis.read())!= -1){
                fos.write(readData);
            }
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            if (fis != null) {
                fis.close();
            }
            assert fos != null;
            fos.close();
        }
        long l = System.currentTimeMillis();
        System.out.println(l - t);
    }
}
