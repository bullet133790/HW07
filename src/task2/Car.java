package task2;



public class Car {

    private String brand;
    private String model;
    private double currentSpeed;
    private double maxSpeed;
    private FuelType fuelType;
    private String color;
    private int year;

    public Car(String brand, String model, double currentSpeed, double maxSpeed, FuelType fuelType, String color, int year) {
        this.brand = brand;
        this.model = model;
        this.currentSpeed = currentSpeed;
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
        this.color = color;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        if (maxSpeed >= 0) {
            this.maxSpeed = maxSpeed;
        } else {
            throw new IllegalArgumentException("Speed can't be less than 0");
        }
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 1900) {
            this.year = year;
        } else {
            throw new IllegalArgumentException("We don't have cars before 1900");
        }
    }

    public enum FuelType {
        DIESEL,
        GASOLINE,
        ELECTRO,
        HYBRID,
        LPG,
        CNG,
    }

    public void accelerate(double amount) {
        double newSpeed = currentSpeed + amount;
        if (newSpeed <= maxSpeed) {
            currentSpeed = newSpeed;
        } else {
            System.out.println("Max speed limit: " + maxSpeed);
            currentSpeed = maxSpeed;
        }
    }

    public void decelerate(double amount) {
        double newSpeed = currentSpeed - amount;
        if (newSpeed >= 0) {
            currentSpeed = newSpeed;
        } else {
            System.out.println("Speed can't be negative");
        }

    }

    public String carInfo() {
        return "Brand: " + brand + " Model: " + model + " Max speed: " + maxSpeed + " Fuel: " + fuelType + " Color: " + color + " Year: " + year;
    }

    public static class CarBuilder {
        private String brand;
        private String model;
        private double maxSpeed;
        private FuelType fuelType;
        private String color;
        private int year;

        public CarBuilder() {
        }

        public CarBuilder withColor(String color) {
            this.color = color;
            return this;
        }
        public CarBuilder withBrand(String brand){
            this.brand = brand;
            return this;


        }
        public CarBuilder withModel(String Model){
            this.model=model;
            return this;
        }

        public CarBuilder withYear(int year){
            this.year= year;
            return this;
        }
        public CarBuilder withMaxSpeed(int maxSpeed){
            this.maxSpeed=maxSpeed;
            return this;
        }

        public CarBuilder withFuelType(FuelType fuelType){
            this.fuelType=fuelType;
            return this;
        }

        public Car build() {
            return new Car(brand, model, 0, maxSpeed, fuelType, color, year);
        }
    }

    public static void main(String[] args) {
        Car car = new CarBuilder()
                .withYear(2022)
                .withBrand("Nissan")
                .withColor("green")
                .withFuelType(FuelType.DIESEL)
                .withMaxSpeed(220)
                .build();

        System.out.println(car.carInfo());
    }
}