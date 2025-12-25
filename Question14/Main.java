package Question14;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File file = new File("hello.txt");
        File imageFile = new File("img.png");
        File destImg = new File("copy.png");
        File randomFile = new File("random.txt");
        File rwFile = new File("ola.txt");
        FileReaderWriter frw= new FileReaderWriter();
        File serFile = new File("student.ser");
        try{
            String content = "Hello world in file";
            frw.writeInFile(file,content);
            String fileContent = frw.readContent(file);
            System.out.println(fileContent+" read through fileInput Stream");
            frw.copyFile(imageFile,destImg);
            System.out.print("Enter the content to write in file: ");
            String tWrite = sc.nextLine();
            sc.close();
            frw.writeFile(rwFile,tWrite);
            String cnt = frw.readFile(rwFile);
            System.out.println(cnt+" : read through FileReader");
            Student student = new Student("Ram Hari Krishna",67);
            frw.serializeData(student,serFile);
            Student std = frw.deserializeData(serFile);
            System.out.println(std.toString());
            frw.randomFile(randomFile);
        }catch (Exception ex){
            System.out.println("Some error occurred.");
        }

    }
}
