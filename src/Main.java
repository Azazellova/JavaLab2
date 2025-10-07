import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Задание 1
        System.out.println("===== Задание 1 =====");
        double x1 = Validation.inputDouble(input,"Введите координату точки x_1: \n> ");
        double y1 = Validation.inputDouble(input,"Введите координату точки y_1: \n> ");
        double x2 = Validation.inputDouble(input,"Введите координату точки x_2: \n> ");
        double y2 = Validation.inputDouble(input,"Введите координату точки y_2: \n> ");
        double x3 = Validation.inputDouble(input,"Введите координату точки x_3: \n> ");
        double y3 = Validation.inputDouble(input,"Введите координату точки y_3: \n> ");

        Point point1 = new Point(x1, y1);
        Point point2 = new Point(x2, y2);
        Point point3 = new Point(x3, y3);

        System.out.println("Точка c координатами {x_1;y_1}: " + point1);
        System.out.println("Точка c координатами {x_2;y_2}: " + point2);
        System.out.println("Точка c координатами {x_3;y_3}: " + point3);

        // Задание 2
        System.out.println("\n===== Задание 2 =====");

        double startX1 = Validation.inputDouble(input,"Введите координату точки начала первой линии x_1: \n> ");
        double startY1 = Validation.inputDouble(input,"Введите координату точки начала первой линии y_1: \n> ");
        Point startPoint1 = new Point(startX1, startY1);

        double endX1 = Validation.inputDouble(input,"Введите координату точки конца первой линии x_1: \n> ");
        double endY1 = Validation.inputDouble(input,"Введите координату точки конца первой линии y_1: \n> ");
        Point endPoint1 = new Point(endX1,endY1);
        Line line1 = new Line(startPoint1,endPoint1);

        double startX2 = Validation.inputDouble(input,"Введите координату точки начала второй линии x_2: \n> ");
        double startY2 = Validation.inputDouble(input,"Введите координату точки начала второй линии y_2: \n> ");
        Point startPoint2 = new Point(startX2,startY2);

        double endX2 = Validation.inputDouble(input,"Введите координату точки конца второй линии x_2: \n> ");
        double endY2 = Validation.inputDouble(input,"Введите координату точки конца второй линии y_2: \n> ");
        Point endPoint2 = new Point(endX2,endY2);
        Line line2 = new Line(startPoint2,endPoint2);

        Line line3 = new Line(line1.getStartPoint(),line2.getEndPoint());

        System.out.println("Координаты линий: ");
        System.out.println(line1 + "\n" + line2 + "\n" + line3);

        System.out.println("\n--------------------------------");
        System.out.println("Введите новые координаты линий:");

        System.out.println("\nВведите новые точки для первой линии: ");
        System.out.println("Координаты начальной точки: ");
        startX1 = Validation.inputDouble(input,"x = ");
        startY1 = Validation.inputDouble(input,"y = ");

        System.out.println("Координаты конечной точки: ");
        endX1 = Validation.inputDouble(input,"x = ");
        endY1 = Validation.inputDouble(input,"y = ");

        System.out.println("\nВведите новые точки для второй линии: ");
        System.out.println("Координаты начальной точки: ");
        startX2 = Validation.inputDouble(input,"x = ");
        startY2 = Validation.inputDouble(input,"y = ");

        System.out.println("Координаты конечной точки: ");
        endX2 = Validation.inputDouble(input,"x = ");
        endY2 = Validation.inputDouble(input,"y = ");

        startPoint1.setCoordinates(startX1,startY1);
        endPoint1.setCoordinates(endX1,endY1);
        startPoint2.setCoordinates(startX2,startY2);
        endPoint2.setCoordinates(endX2,endY2);

        System.out.println("\nНовые координаты линий:");
        System.out.println(line1 + "\n" + line2 + "\n" + line3);

        System.out.println("\n--------------------------------");
        System.out.println("\nВведите новые точки для первой линии (третья линия не изменится): ");
        System.out.println("Координаты начальной точки: ");
        startX1 = Validation.inputDouble(input,"x = ");
        startY1 = Validation.inputDouble(input,"y = ");

        System.out.println("Координаты конечной точки: ");
        endX1 = Validation.inputDouble(input,"x = ");
        endY1 = Validation.inputDouble(input,"y = ");
        startPoint1 = new Point(startX1,startY1);
        endPoint1 = new Point(endX1,endY1);
        line1 = new Line(startPoint1,endPoint1);

        System.out.println("\nНовые координаты линий:");
        System.out.println(line1 + "\n" + line2 + "\n" + line3);

        // Задание 3
        System.out.println("\n===== Задание 3 =====");
        System.out.println("Создаем студентов...");
        Student student1 = new Student("Вася", new int[]{3,4,5});
        Student student2 = new Student("Петя", student1.getMarks());

        System.out.println("\nПервоначальные оценки: ");
        System.out.println(student1);
        System.out.println(student2);

        System.out.println("Измените отметку Пети:");
        int n;
        n = Validation.inputInteger(input,"Напишите номер оценки для изменения:\n> ");

        while (n <= 0 || n > student1.getMarks().length) {
            System.out.println("Ошибка ввода. Повторите попытку...");
            n = Validation.inputInteger(input,"Напишите номер оценки для изменения:\n> ");
        };
        int mark = Validation.inputMark(input, "Напишите отметку для изменения: \n> ");
        student1.changeMark(n, mark);
        System.out.println("Изменение оценки у Пети...");

        System.out.println("\nОценки после изменения:");
        System.out.println(student1);
        System.out.println(student2);

        System.out.println("Создаем Андрея на основе оценок Васи...");
        Student student3 = new Student("Андрей", student1.getMarks().clone());
        System.out.println("Поэтапно введите новые оценки Васи: ");

        int[] newMarks = new int[student1.getMarks().length];
        for (int i = 0; i < newMarks.length; i++) {
            newMarks[i] = Validation.inputMark(input, "> ");
        }
        student1.setMarks(newMarks);

        System.out.println("\nНовые оценки: ");
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        // Задание 4.1
        System.out.println("\n===== Задание 4.1 =====");

        x1 = Validation.inputDouble(input,"Введите координату точки x_1: \n> ");
        y1 = Validation.inputDouble(input,"Введите координату точки y_1: \n> ");
        x2 = Validation.inputDouble(input,"Введите координату точки x_2: \n> ");
        y2 = Validation.inputDouble(input,"Введите координату точки y_2: \n> ");
        x3 = Validation.inputDouble(input,"Введите координату точки x_3: \n> ");
        y3 = Validation.inputDouble(input,"Введите координату точки y_3: \n> ");
        point1 = new Point(x1, y1);
        point2 = new Point(x2, y2);
        point3 = new Point(x3, y3);

        System.out.println("Новые точки: ");
        System.out.println("Точка 1:" + point1);
        System.out.println("Точка 2:" +point2);
        System.out.println("Точка 3:" +point3);

        // Задание 4.2
        System.out.println("\n===== Задание 4.2 =====");


        line1 = new Line(startPoint1.getX(), startPoint2.getY(), endPoint1.getX(), endPoint1.getY());
        System.out.println("1. " + line1);

        line2 = new Line(startPoint2.getX(), startPoint2.getY(), endPoint2.getX(), endPoint2.getY());
        System.out.println("2. " + line2);

        line3 = new Line(line1.getStartPoint(), line2.getEndPoint());
        System.out.println("3. " + line3);

        // Задание 5
        System.out.println("\n===== Задание 5 =====");
        double new_x1 = Validation.inputDouble(input,"Введите координату точки x_1: \n> ");
        double new_y1 = Validation.inputDouble(input,"Введите координату точки y_1: \n> ");
        double new_x2 = Validation.inputDouble(input,"Введите координату точки x_2: \n> ");
        double new_y2 = Validation.inputDouble(input,"Введите координату точки y_2: \n> ");
        Line line5 = new Line(new_x1,new_y1,new_x2,new_y2);

        System.out.println(line5);
        System.out.println("Длина линии: " + line5.getDistance());


    }
}