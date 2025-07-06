import java.io.*;
public class helper4b
{
    public static void main(String[] args)
    {
        try
        {
            File file = new File("\"C:\\Users\\91636\\Downloads\\OS-Graded(2).docx\"");
            if (file.length() == 0)
            {
                throw new IOException("File is empty.");
            }
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null)
            {
                System.out.println(line);
            }
            reader.close();
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
