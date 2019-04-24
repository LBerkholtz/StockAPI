package App;

import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StockService {
    //fill list of Stock Quotes
    List<StockQuote> stockQuoteList= Arrays.asList(
            new StockQuote("1","APPL","2019-01-01 10:00:00", 100.00),
            new StockQuote("2","APPL","2019-01-01 10:00:00", 100.00),
            new StockQuote("3","APPL","2019-01-01 10:00:00", 100.00),
            new StockQuote("4","GOOG","2019-01-01 10:00:00", 100.00),
            new StockQuote("5","GOOG","2019-01-01 10:00:00", 100.00))
    ;

    /**
     * List all Stock Quotes
     * @return a list of all stock quotes
     */
    public List<StockQuote> getStocks(){
        return stockQuoteList;
    }

    /**
     * Get quote by id
     * @param id
     * @return Stock quote for the id
     */
    public StockQuote getStock(String id){
        return stockQuoteList.stream().filter(sq->sq.getId()
                .equals(id)).findFirst().get();
    }

    /**
     * List all stock quotes for a stock symbol
     * @param symbol
     * @return list of stock quotes
     */
    public List<StockQuote> getStocks(String symbol){
        return stockQuoteList.stream().filter(sq->sq.getSymbol()
                .equals(symbol)).collect(Collectors.toList());
    }

    /**
     * Add a stock quotes
     * @param stockQuote
     */
    public void addStock(StockQuote stockQuote){
    }

    /**
     *  update a stock quote by id
     * @param stockQuote
     * @param id
     */
    public void updateStock(StockQuote stockQuote, String id){
        for(int i=0;i<stockQuoteList.size();i++){
            StockQuote sq=stockQuoteList.get(i);
            if(sq.getId().equals(id)) {
                stockQuoteList.set(i, stockQuote);
                break;
            }
        }
    }

    /**
     * Delete a stock by id
     * @param id
     */
    public void deleteStock(String id){
        stockQuoteList.removeIf(sq->sq.getId().equals(id));
    }
}
