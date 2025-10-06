public class Line {
    private Point startPoint;
    private Point endPoint;

    // по умолчанию ставятся 0, тк после задания 4.1 конструктор по умолчанию в Point убирается
    public Line() {
        this.startPoint = new Point(0,0);
        this.endPoint = new Point(0,0);
    }

    public Line(Line line) {
        this.startPoint = line.startPoint;
        this.endPoint = line.endPoint;
    }

    public Line(Point startPoint, Point endPoint) {
        setStartPoint(startPoint);
        setEndPoint(endPoint);
    }

    public Line(double x1, double y1, double x2, double y2) {
        setStartPoint(new Point(x1,y1));
        setEndPoint(new Point(x2,y2));
    }

    public Point getStartPoint() {
        return startPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    public void setStartPoint(Point startPoint) {
        this.startPoint = startPoint;
    }

    public void setEndPoint(Point endPoint) {
        this.endPoint = endPoint;
    }

    public double getDistance() {
        double deltaX = endPoint.getX() - startPoint.getX();
        double deltaY = endPoint.getY() - startPoint.getY();
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    @Override
    public String toString(){
        return "Линия от " + startPoint + " до " + endPoint;
    }
}
