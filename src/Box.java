public class Box {
    int height; //field
    int width;
    int length;

    public Box(int height, int width, int length){
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public Box(){

    }

    int volume(){
        return height * width * length;
    }

//    int volume(int height, int width, int length){
//        return height * width * length;
//    }

    void setProperty(int height, int width, int length){
        this.height = height;
        this.width = width;
        this.length = length;
    }

    double density(int mass){

        return (double)  mass / volume();
    }



}
