package App;

import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class StockService {
    List<StockQuote> stockQuoteList= Arrays.asList(
            new StockQuote("1","APPL","2019-01-01 10:00:00", 100.00),
            new StockQuote("2","APPL","2019-01-01 10:00:00", 100.00),
            new StockQuote("3","APPL","2019-01-01 10:00:00", 100.00),
            new StockQuote("4","GOOG","2019-01-01 10:00:00", 100.00),
            new StockQuote("5","GOOG","2019-01-01 10:00:00", 100.00))
    ;
    public List<StockQuote> getStocks(){
        return stockQuoteList;
    }
    public StockQuote getStock(String id){
        return stockQuoteList.stream().filter(sq->sq.getId()
                .equals(id)).findFirst().get();
    }
    public List<StockQuote> getStocks(String symbol){
        return stockQuoteList.stream().filter(sq->sq.getSymbol()
                .equals(symbol)).collect(Collectors.toList());
    }
    public void addStock(StockQuote stockQuote){
    }
    public void updateStock(StockQuote stockQuote, String id){
        for(int i=0;i<stockQuoteList.size();i++){
            StockQuote sq=stockQuoteList.get(i);
            if(sq.getId().equals(id)) {
                stockQuoteList.set(i, stockQuote);
                break;
            }
        }
    }
    public void deleteStock(String id){
        stockQuoteList.removeIf(sq->sq.getId().equals(id));
    }
}
