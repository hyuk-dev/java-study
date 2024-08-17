import java.io.DataInputStream;
import java.io.FileInputStream;

public class ByteExam4 {
    public static void main(String[] args){
        try(

                DataInputStream dis = new DataInputStream(new FileInputStream("data.txt"));

                ){

            int i = dis.readInt();
            boolean k = dis.readBoolean();
            double j = dis.readDouble();

            System.out.println(i + " " + j + " " + k);

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
