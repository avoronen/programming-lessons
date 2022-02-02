public enum Season {

    SPRING ("Spring"),
    SUMMER ("Summer"),
    AUTUMN ("Autumn"),
    WINTER ("Winter");


    String season;

    Season (String season) {

        this.season = season;
    }

    public void showSeason() {

        if (this == SPRING) {
            System.out.println("March, April, May");
        } else if (this == SUMMER) {

            System.out.println("June, July, August");
        } else if (this == AUTUMN){

        }

    }
}
