public class Wall {

    double width;
    double height;

    public Wall(double width, double height){
        this.height = height;
        this.width = width;
    }

    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

    public double setWidth(double numberW){
        if(numberW<0){
           return width=0;
        } else {
            return width = numberW;
        }
    }

    public double setHeight (double numberH){
        if(numberH<0){
            return height=0;
        } else {
            return height = numberH;
        }
    }

    public double getArea(){
        return width*height;
    }
}
