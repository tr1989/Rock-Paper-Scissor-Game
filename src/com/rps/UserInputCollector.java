package com.rps;

public class UserInputCollector {
    public String getInputUser1() {
        return inputUser1;
    }

    public String getInputUser2() {
        return inputUser2;
    }

    public UserInputCollector(String inputUser1, String inputUser2) {
        this.inputUser1 = inputUser1;
        this.inputUser2 = inputUser2;
    }

    private String inputUser1;
    private String inputUser2;

    public boolean isInputValid(String userIinput){
        if(userIinput.equalsIgnoreCase("R")
                || userIinput.equalsIgnoreCase("P") || userIinput.equalsIgnoreCase("S")){
            return true;
        }else{
            return false;
        }
    }

}