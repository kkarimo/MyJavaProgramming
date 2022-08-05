package week13.phoneTask;

import week13.Phone;

public class CameraPhone extends Phone {

    int imageSize; // megaByte
    int memorySize; // gigaByte


    public CameraPhone(String make, String model, double price, int imageSize, int memorySize) {
        super(make, model, price);
        this.imageSize = imageSize;
        this.memorySize = memorySize;
    }



    public int numPictures(){
        return memorySize*1000/imageSize;
    }

}
