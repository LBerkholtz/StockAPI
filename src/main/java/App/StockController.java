package App;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 *Controller for CRUD functions
 */

@RestController
public class StockController {
    @Autowired
    private StockService stockService;

    /**
     * Gets all the stock quotes
     * calls the stock service method to retrieve all quotes
     * @return a list of all the stock quotes
     */
    @RequestMapping("/stocks")
    public List<StockQuote> getStocks(){
        return stockService.getStocks();
    }

    /**
     * Gets a stock quote by id number, there should be just one
    * calls the stock service method to retrieve id
     * @param id
     * @return the stock quote by id
     */
    @RequestMapping("/stocks/{id}")
    public StockQuote getStock(@PathVariable("id")
                                              String id){
        return stockService.getStock(id);
    }

    /**
     * Returns stock quotes by symbol
     * calls the stock service method to retrieve by symbol
     * @param symbol
     * @return list of all stock quotes by symbol
     */
    @RequestMapping("/stocks/{symbol}")
    public List<StockQuote> getStocks(@PathVariable("symbol")
                                        String symbol){
        return stockService.getStocks(symbol);
    }

    /**
     * Adds a stock quote
     * calls the stock service method to add
     * @param stockQuote
     */
    @RequestMapping(method= RequestMethod.POST,
            value="/stocks")
    public void addStock(@RequestBody StockQuote stockQuote){
        stockService.addStock(stockQuote);
    }

    /**
     * updates a stock quote for an id number
     * calls the stock service method to update
     * @param stockQuote
     * @param id
     */
    @RequestMapping(method = RequestMethod.PUT,
            value="/stocks/{id}")
    public void updateStock(@RequestBody StockQuote stockQuote,
                               @PathVariable String id){
        stockService.updateStock(stockQuote, id);
    }

    /**
     * Deletes a stock quote by id number
     * calls the stock service method to delete
     * @param id
     */
    @RequestMapping(method = RequestMethod.DELETE,
            value="/stocks/{id}")
    public void deleteStock(@PathVariable String id){
        stockService.deleteStock(id);
    }
}