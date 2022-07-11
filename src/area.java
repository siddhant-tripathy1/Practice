public class area {
    private double width;
    private double height;

    public area(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(this.width==0){
            this.width=0;
        }
        else{this.width = width;}
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(this.height==0){
            this.height=0;
        }
        else{this.height = height;}
    }
    public double getArea() {
        return(this.height*this.height);
    }


}
