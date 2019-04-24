package App;

public class StockQuote {
    private String id;
    private String symbol;
    private String date;
    private double price;
    public StockQuote() {
    }

    /**
     * Full parameter constructor for StockQuote
     * @param id The unique id of the stock quote
     * @param symbol The stock symbol e.g. "GOOG"
     * @param date The date of the stock quote in yyyy-mm-dd 00:00:00 format
     * @param price The price of the stock at the time of the quote
     */
    public StockQuote(String id, String symbol, String date, double price) {
        this.id = id;
        this.symbol = symbol;
        this.date = date;
        this.price = price;
    }

    /**
     * Getter method for ID
     * @return String ID
     */
    public String getId() {
        return id;
    }

    /**
     * Setter method for ID
     * @param id unique id for stock quote
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Setter method for stock symbol
     * @param symbol Stock symbol
     */

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    /**
     * Getter method for stock symbol
     * @return Stock Symbol
     */

    public String getSymbol() {
        return symbol;
    }

    /**
     * Getter method for Date
     * @return Stock quote date
     */
    public String getDate() {
        return date;
    }

    /**
     * Setter method for Date
     * @param date Stock quote date
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * Getter method for price
     * @return Stock quote price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Setter method for price
     * @param price Stock quote price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Override toString method
     * @return a string with a readable stock quote
     */
    @Override
    public String toString() {
        return "StockQuote{" +
                "symbol='" + symbol + '\'' +
                ", date='" + date + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}