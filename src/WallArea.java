public class WallArea {
    // write code here
    private double width;
    private double height;

    public WallArea () {
    }

    public WallArea (double width, double height){
        this.width = (width < 0)? 0: width;
        this.height = (height < 0)? 0: height;
    }

    public double getWidth (){
        return this.width;
    }

    public double getHeight (){
        return this.height;
    }

    public void setWidth (double width){
        if (width < 0) this.width = 0;
        else this.width = width;
    }

    public void setHeight (double height){
        if (height < 0) this.height = 0;
        else this.height = height;
    }

    public double getArea (){
        return this.height * this.width;
    }

}
