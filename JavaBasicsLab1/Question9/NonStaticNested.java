package JavaBasicsLab1.Question9;


/**
 * @author : Asnit Bakhati
 */
public class NonStaticNested {
    public int data;

    public class Inner{
        public void display(){
            System.out.println(data++);
        }

        public void whatsNew(String stdName){
            class Student {
                private String name;

                public Student(String name) {
                    this.name = name;
                }

                public void displayStudentInfo() {
                    System.out.println(name + " say hello.");
                }
            }
                Student std = new Student(stdName);
                std.displayStudentInfo();
            }

        }
}
