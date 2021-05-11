public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private String title;
    private int priceCode;
    public Movie(String newTitle, int newPriceCode) {
        this.setTitle(newTitle);
        this.setNewPriceCode(newPriceCode);
    }
    private void setTitle(String newTitle) {title = newTitle;}
    private void setNewPriceCode(int newPriceCode) {priceCode = newPriceCode;}
    public int getPriceCode() {
        return priceCode;
    }
    public void setPriceCode(int arg) {
        priceCode = arg;
    }
    public String getTitle (){
        return title;
    };
}