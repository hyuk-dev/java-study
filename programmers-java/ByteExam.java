import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class ByteExam
{
    public static void main(String[] args)
    {
        try(
                DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.txt"));//선언
        ){
            dos.writeInt(100); //실행
            dos.writeBoolean(true);
            dos.writeDouble(1.5);

        }
        catch(Exception e)
        {
            e.printStackTrace();//예외
        }
    }
}
