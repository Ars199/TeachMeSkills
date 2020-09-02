class OOP_6_Lightswitcher {
    private String name;
    private int count;
    boolean condition;

    public void toSwitch() {
        if (condition) {
            condition = false;
        } else {
            condition = true;
        }

    }
}


