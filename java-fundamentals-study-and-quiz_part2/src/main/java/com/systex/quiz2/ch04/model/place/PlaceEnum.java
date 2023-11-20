package com.systex.quiz2.ch04.model.place;

public enum PlaceEnum {
    LAND("Land"), SEA("Sea"), AIR("Air"), ;

    private String place;

    PlaceEnum(String place) {
        this.place = place;
    }

    public static String getPlaceNo(int option) {
        if(option == 1) {
            return LAND.place;
        } else if(option == 2) {
            return SEA.place;
        } else if(option == 3) {
            return AIR.place;
        } else {
            return null;
        }
    }

    public static String getPlaceName(String place) {
        if(place.equals(LAND.place)) {
            return "Land";
        } else if(place.equals(AIR.place)) {
            return "Air";
        } else if(place.equals(SEA.place)) {
            return "Sea";
        } else {
            return null;
        }
    }

    public static String[] getAllPlace() {
        return new String[]{LAND.place, SEA.place, AIR.place};
    }

    public static String getQuestion1Options() {
        int optionNo = 1;
        StringBuilder sb = new StringBuilder();
        for (PlaceEnum place : PlaceEnum.values()) {
            sb.append(optionNo + ". " + place.place + " ");
            optionNo++;
        }
        return sb.toString();
    }

    // get size of enum
    public static int getSize() {
        return PlaceEnum.values().length;
    }

}
