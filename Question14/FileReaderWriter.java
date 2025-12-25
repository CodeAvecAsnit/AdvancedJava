package Question14;


import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileReaderWriter {

    public void writeInFile(File file,String content) throws IOException{
        FileOutputStream os = new FileOutputStream(file);
        os.write(content.getBytes(StandardCharsets.UTF_8));
        os.close();
        System.out.println(content+" written in file using fileOutput Stream");
    }

    public String readContent(File file) throws IOException {
        FileInputStream fis = new FileInputStream(file);
        StringBuilder sb = new StringBuilder();
        int ch;
        while ((ch = fis.read()) != -1) {
            sb.append((char)ch);
        }
        fis.close();
        return sb.toString();
    }

    public void copyFile(File source,File destination) throws IOException {
        FileInputStream is = new FileInputStream(source);
        FileOutputStream os = new FileOutputStream(destination);
        int ch;
        while((ch=is.read())!=-1){
            os.write(ch);
        }
        is.close();
        os.close();
        System.out.println("File copied Successfully");
    }

    public void randomFile(File file) throws IOException {
        RandomAccessFile raf = new RandomAccessFile(file, "rw");
        raf.writeUTF("Hello");
        raf.writeUTF("Java");
        raf.seek(0);
        System.out.println(raf.readUTF());
        raf.close();
    }

    public String readFile(File file)throws IOException{
        StringBuilder sb = new StringBuilder();
        FileReader fr = new FileReader(file);
        int ch;
        while((ch=fr.read())!=-1){
            sb.append((char)ch);
        }
        fr.close();
        return sb.toString();
    }

    public void writeFile(File file, String content)throws IOException{
        FileWriter fw = new FileWriter(file);
        fw.write(content);
        fw.close();
        System.out.println(content+" written in file using FileWriter");
    }


    public void serializeData(Student student,File file)throws IOException{
        ObjectOutputStream oos =
                new ObjectOutputStream(new FileOutputStream(file));
        oos.writeObject(student);
        oos.close();
        System.out.println(student.name()+" has been serialized.");
    }

    public Student deserializeData(File file) throws IOException, ClassNotFoundException {
        ObjectInputStream ois =
                new ObjectInputStream(new FileInputStream("student.ser"));
        Student std = (Student) ois.readObject();
        ois.close();
        return std;
    }


}
