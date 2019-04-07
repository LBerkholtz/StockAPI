package App;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class StockController {
    @Autowired
    private StockService stockService;
    @RequestMapping("/stocks")
    public List<StockQuote> getStocks(){
        return stockService.getStocks();
    }
    @RequestMapping("/stocks/{id}")
    public StockQuote getStock(@PathVariable("id")
                                              String id){
        return stockService.getStock(id);
    }
    @RequestMapping("/stocks/{symbol}")
    public List<StockQuote> getStocks(@PathVariable("symbol")
                                        String symbol){
        return stockService.getStocks(symbol);
    }
    @RequestMapping(method= RequestMethod.POST,
            value="/stocks")
    public void addStock(@RequestBody StockQuote stockQuote){
        stockService.addStock(stockQuote);
    }
    @RequestMapping(method = RequestMethod.PUT,
            value="/stocks/{id}")
    public void updateStock(@RequestBody StockQuote stockQuote,
                               @PathVariable String id){
        stockService.updateStock(stockQuote, id);
    }
    @RequestMapping(method = RequestMethod.DELETE,
            value="/stocks/{id}")
    public void deleteStock(@PathVariable String id){
        stockService.deleteStock(id);
    }
}