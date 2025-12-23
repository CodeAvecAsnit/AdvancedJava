package lab1.Question6;

public class Main {
    public static void main(String[] args) {
        Result student1 = new Result();
        student1.setRollNo(10);
        student1.setMathMarks(93);
        student1.setScienceMarks(88);
        student1.setTotal();
        System.out.println("The Roll no of the student is  :"+student1.getRollNo());
        System.out.println("The marks in Science is "+student1.getScienceMarks());
        System.out.println("The marks in Maths is "+student1.getMathMarks());
        System.out.println("The total marks of student is "+ student1.getTotal());
    }
}
