package app.component.controller.product.currency;

import app.commons.entities.products.CurrencyMaster;
import app.component.service.products.currencyMaster.CurrencyMasterManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/management/products/currency")
public class CurrencyMasterManagementController {

    @Autowired
    @Qualifier("currencyMasterManagementService")
    private CurrencyMasterManagementService currencyMasterManagementService;

    @GetMapping
    public String index(Model model){
        List<CurrencyMaster> currencyList = this.currencyMasterManagementService.findAll();
        model.addAttribute("currencyList", currencyList);
        return "management/products/currency/index";
    }
}
