package model;

import java.util.ArrayList;

/**
 * Created by igdev on 27/10/14.
 */
public class App {

    public static App context= new App();
    private ArrayList<String> listCar= new ArrayList<String>();
    public static App getInstance(){
        return context;
    }


    public ArrayList<String> getListCar() {
        return listCar;
    }

    public void setListCar(ArrayList<String> listCar) {
        this.listCar = listCar;
    }


    public void addItem(String item){
        this.listCar.add(item);
    }


}
