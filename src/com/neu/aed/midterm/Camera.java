package com.neu.aed.midterm;

/*
* Singelton Class
 */
public class Camera {
    private static volatile Camera instance = null;
    private String cameraName = " ";

    private Camera(){};

    public void setCameraName(String  cameraName){
        this.cameraName = cameraName;
    }

    public String getCameraName(){
        return cameraName;
    }

    public static Camera getInstance(){
       if (instance == null){
           synchronized (Camera.class){
               if(instance == null){
                   instance = new Camera();
               }
           };
       }
       return instance;
    }
}
