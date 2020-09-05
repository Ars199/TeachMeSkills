class LightSwitch {  //Lightswitch
     String name;
     int count;
    boolean condition;

    public void toSwitch() {
        if (condition) {
            condition = false;
            count++;
        } else {
            condition = true;
            count++;
        }

    }
}


