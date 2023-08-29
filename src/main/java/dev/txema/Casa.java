package dev.txema;

public class Casa {

int area ;
int chambNumber;
String [] chambTypes;
boolean mainDoorIsOpen = false;
boolean commutato1 = false;
boolean commutato2 = false;
boolean lightIsOn = false;

public Casa(int area, int chambNumber, String[] chambTypes){
    this.area = area;
    this.chambNumber = chambNumber;
    this.chambTypes = chambTypes;
}
public int getArea() {
    return area;
}
public void setArea (int area) {
    this.area = area;
}
public int getChambNumber() {
    return chambNumber;
}
public void setChambNumber(int chambNumber) {
    this.chambNumber = chambNumber;
}
public String[] getChambTypes() {
    return chambTypes;
}
public void setChambTypes(String[] chambTypes) {
    this.chambTypes = chambTypes;
}
public boolean isMainDoorIsOpen() {
    return mainDoorIsOpen;
}
public void setMainDoorIsOpen(boolean mainDoorIsOpen) {
    this.mainDoorIsOpen = mainDoorIsOpen;
}
public boolean isCommutato1() {
    return commutato1;
}
public void setCommutato1(boolean commutato1) {
    this.commutato1 = commutato1;
}
public boolean isCommutato2() {
    return commutato2;
}
public void setCommutato2(boolean commutato2) {
    this.commutato2 = commutato2;
}
public boolean isLightIsOn() {
    return lightIsOn;
}
public void setLightIsOn(boolean lightIsOn) {
    this.lightIsOn = lightIsOn;
}

}