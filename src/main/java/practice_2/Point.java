package practice_2;

public class Point {
    int x;
    int y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    int getX() {
        return this.x;
    }
    void setX(int newX) {
        this.x = newX;
    }
    void print() {
        System.out.println("Х равен: " + this.x + " Y равен: " + this.y);
    }

}
