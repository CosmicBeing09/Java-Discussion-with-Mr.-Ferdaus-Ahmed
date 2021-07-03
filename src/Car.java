public class Car {
    private int horsePower;
    private String brand;
    private int numOfSeats;
    private boolean isRunning;


    public Car(boolean isRunning){
        this.isRunning = isRunning;
    }

    public Car(boolean isRunning, int horsePower){
        this.isRunning = isRunning;
        this.horsePower = horsePower;
    }

    public Car(boolean isRunning, int horsePower, String brand, int numOfSeats){
        this.isRunning = isRunning;
        this.horsePower = horsePower;
        this.brand = brand;
        this.numOfSeats = numOfSeats;
    }

    public void start(){
        if(isRunning) System.out.println("Car is already running");
        else {
            isRunning = true;
            System.out.println("Car is started");
        }
    }

    public void stop(){
        if(!isRunning) System.out.println("Car is already stopped");
        else {
            isRunning = false;
            System.out.println("Car is stopped");
        }
    }

    public String category(){
        if(horsePower >= 1500 && horsePower<= 3000) return "Category A";
        else if(horsePower>=600 && horsePower<1500) return "Category B";
        else return "Invalid HP";

//        return "Invalid HP";
    }

    public void setHorsePower(int horsePower){
        this.horsePower = horsePower;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getBrand(){
        return brand;
    }

    public void setNumOfSeats(int numOfSeats){
        this.numOfSeats = numOfSeats;
    }

    public int getNumOfSeats(){
        return numOfSeats;
    }

}
