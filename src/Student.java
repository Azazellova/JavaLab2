public class Student {
    private String name;
    private int[] marks;

    public Student() {
        this.name = "Вася";
        this.marks = new int[0];
    }

    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    public Student(Student student) {
        this.name = student.name;
        this.marks = student.marks;
    }

    public String getName() {
        return name;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public void changeMark(int n, int newMark) {
        if (n<1 || n > marks.length) {
            System.out.println("Ошибка: превышено значение массива");
        } else {
            this.marks[n-1] = newMark;
        }
    }

    @Override
    public String toString() {
        String array = "";
        for (int mark : marks) {
          array += mark + " ";
        }
        return name + ": " + array;
    }
}
