public class Box {
    double l;
    double   w;
    double h;
    Box(){
      this.h=-1;
        this.w=-1;
        this.l=-1;

    }
    //cube
    Box(double side){
        this.w=side;
        this.w=side;
        this.h=side;
    }
     Box(double l,double w,double h){
        this.l=l;
        this.h=h;
        this.w=w;
    }
    Box(Box old){
        this.h=old.h;
        this.l=old.l;
        this.w=old.w;
    }
    public void info(){
        System.out.println("running the box");
    }


}
