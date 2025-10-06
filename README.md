<h1>Лабораторная работа №2</h1>
<h2>
  <p>Мазур София</p>
  <p>7 группа</p>
</h2>

<h2>Задание 1.1: Точка координат</h2>
<h3>Условие</h3> 
<p>Создать сущность <strong>Точка</strong>, расположенную на двумерной плоскости, с координатами X и Y. 
Точка должна возвращать текстовое представление вида <code>{X;Y}</code>. Необходимо создать три точки с разными координатами и вывести их текстовое представление.</p>
<h3>Решение</h3> <p>Класс <code>Point</code> содержит:</p> 
<ul> 
  <li>Приватные поля координат <code>x</code> и <code>y</code> типа <code>double</code></li>
  <li>Конструктор по умолчанию</li> 
  <li>Конструктор копирования</li> 
  <li>Конструктор с параметрами <code>x</code> и <code>y</code></li> 
  <li>Методы доступа (<code>getX</code>, <code>getY</code>)</li> 
  <li>Методы установки значений (<code>setX</code>, <code>setY</code>)</li> 
  <li>Переопределенный метод <code>toString()</code>, возвращающий строку формата <code>{X;Y}</code></li> 
</ul>
<h3>Пример использования</h3> 
<pre>
<code>Point point1 = new Point(3, 5); 
Point point2 = new Point(25, 6); 
Point point3 = new Point(7, 8); 
System.out.println(point1); // {3.0;5.0} 
System.out.println(point2); // {25.0;6.0} 
System.out.println(point3); // {7.0;8.0}</code></pre>

<h2>Задание 2.1: Прямая</h2>
<h3>Условие</h3> 
<p>Создать сущность <strong>Линия</strong>, описываемую начальной и конечной точками. Линия должна возвращать текстовое представление вида <code>Линия от {X1;Y1} до {X2;Y2}</code>.
Для указания координат нужно использовать сущность Точка, разработанную в задании 1.1. Создайте
линии со следующими характеристиками:
<ol>
    <li>Линия 1 с началом в т. {1;3} и концом в т.{23;8}.</li>
    <li>Линия 2, горизонтальная, на высоте 10, от точки 5 до точки 25.</li>
    <li>Линия 3, которая начинается всегда там же, где начинается линия 1, и заканчивается всегда там же, где заканчивается линия 2. Таким образом, если положение первой или второй линии меняется, то меняется и третья линия.</li>
    <li>После создания всех трех объектов измените координаты первой и второй линий, причем сделайте это таким образом, чтобы положение третьей линии соответствовало требованиям пункта 3.</li>
    <li>Измените координаты первой линии так, чтобы при этом не изменились координаты третьей линии.</li>
</ol>
</p>
<h3>Решение</h3> 
<p>Класс <code>Line</code> содержит:</p> 
<ul> 
  <li>Приватные поля <code>startPoint</code> и <code>endPoint</code> типа <code>Point</code></li>
  <li>Конструктор по умолчанию</li> 
  <li>Конструктор копирования</li> 
  <li>Конструктор с параметром</li> 
  <li>Методы доступа к точкам (<code>getStartPoint</code>, <code>getEndPoint</code>)</li> 
  <li>Методы установки значений (<code>setStartPoint</code>, <code>setEndPoint</code>)</li> 
  <li>Переопределенный метод <code>toString()</code>, возвращающий строку формата <code>Линия от {X1;Y1} до {X2;Y2}</code></li> 
</ul>
<h3>Пример использования</h3> 
<pre><code>Point startPoint1 = new Point(1, 3); 
Point endPoint1 = new Point(23, 8);  
Point startPoint2 = new Point(5, 10);  
Point endPoint2 = new Point(25, 10); 
Line line1 = new Line(startPoint1, endPoint1); 
Line line2 = new Line(startPoint2, endPoint2); 
Line line3 = new Line(line1.getStartPoint(), line2.getEndPoint());
System.out.println(line1 + "\n" + line2 + "\n" + line3);
//Линия от {1.0;3.0} до {23.0;8.0}
//Линия от {5.0;10.0} до {25.0;10.0}
//Линия от {1.0;3.0} до {25.0;10.0}
</code></pre>

<h2>Задание 3.1: Студент</h2>
<h3>Условие</h3> 
<p>Создать сущность <strong>Студент</strong> с именем и массивом оценок. Студент должен возвращать текстовое представление вида 
  <code>Имя: [оценки]</code>. Необходимо выполнить следующие задачи:
<ol>
  <li>Создать студента Васю с оценками: 3,4,5.</li>
  <li>Создать студента Петю и скопировать оценки Васи, присвоив содержимое поля с оценками Васи полю с оценками Пети.</li>
  <li>Заменить первую оценку Пети на число 5. Вывести на экран строковое представление Васи и Пети. Объяснить результат.</li>
  <li>Создать студента Андрея и скопировать ему оценки Васи так, чтобы изменение оценок Васи не влияло на Андрея.</li>
</ol>
</p>

<h3>Решение</h3> <p>Класс <code>Student</code> содержит:</p> 
<ul> 
  <li>Приватные поля <code>name</code> и <code>marks</code> (массив оценок)</li> 
  <li>Конструктор по умолчанию</li> 
  <li>Конструктор копирования</li>
  <li>Конструктор с параметром</li> 
  <li>Методы доступа (<code>getName</code>, <code>getMarks</code>) и изменения оценок(<code>setName</code>, <code>setMarks</code>)</li> 
  <li>Метод <code>changeMark</code> для изменения оценки по индексу</li> 
</ul>

<h3>Пример использования</h3> 
<pre><code>Student student1 = new Student("Вася", new int[]{3, 4, 5}); 
Student student2 = new Student("Петя", student1.getMarks()); 
student1.changeMark(1, 5);
Student student3 = new Student("Андрей", student1.getMarks().clone());</code></pre>

<h2>Задание 4.1: Создание точки</h2><h3>Условие</h3> <p>Изменить сущность <strong>Точка</strong> так, чтобы создать объект можно было только путем указания обеих координат.</p><h3>Решение</h3> 
<p>В классе <code>Point</code> удалены конструкторы по умолчанию и копирования. Оставлен только конструктор с параметрами <code>x</code> и <code>y</code>.</p>
<h3>Пример использования</h3> 
<pre><code>Point point1 = new Point(3, 5); 
Point point2 = new Point(25, 6); Point point3 = new Point(7, 8);</code></pre>

<h2>Задание 4.2: Создание линии</h2>
<h3>Условие</h3> 
<p>Изменить сущность <strong>Линия</strong> так, чтобы создать объект можно было:</p> <ul> <li>С указанием начальной и конечной точек</li> <li>С указанием координат начала и конца как четырех чисел</li> </ul>
<h3>Решение</h3> 
<p>В класс <code>Line</code> добавлен конструктор, принимающий четыре параметра: <code>x1</code>, <code>y1</code>, <code>x2</code>, <code>y2</code>.</p>
<h3>Код</h3> 
<pre><code>public Line(double x1, double y1, double x2, double y2) {
    setStartPoint(new Point(x1,y1));
    setEndPoint(new Point(x2,y2));
}</code></pre>
</p>
<h3>Пример использования</h3> 
<pre><code>Line line1 = new Line(1, 3, 23, 8); 
Line line2 = new Line(5, 10, 25, 10); 
Line line3 = new Line(line1.getStartPoint(), line2.getEndPoint());</code></pre>

<h2>Задание 5.3: Длина линии</h2>
<h3>Условие</h3> <p>Добавить возможность вычисления длины линии.</p>
<h3>Решение</h3> 
<p>В класс <code>Line</code> добавлен метод <code>getDistance()</code>, вычисляющий расстояние между начальной и конечной точками по формуле:<br> <code>√((x₂ - x₁)² + (y₂ - y₁)²)</code></p>
<h3>Код</h3> 
<pre><code>public double getDistance() { 
  double deltaX = endPoint.getX() - startPoint.getX();
  double deltaY = endPoint.getY() - startPoint.getY(); 
  return Math.sqrt(deltaX * deltaX + deltaY * deltaY); 
}</code></pre>
<h3>Пример использования</h3> 
<pre><code>Line line = new Line(1, 1, 10, 15); 
System.out.println("Длина линии: " + line.getDistance());</code></pre>

