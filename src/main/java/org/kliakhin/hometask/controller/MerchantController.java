package org.kliakhin.hometask.controller;

import org.kliakhin.hometask.entity.Merchant;
import org.kliakhin.hometask.service.MerchantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.sql.Date;
import java.time.LocalDate;

/**
 * @author kliakhin.yevgen
 * @version 1.0 Create: 12/19/15 11:47 PM
 */

@Controller
@RequestMapping("/merchant")
public class MerchantController {

    @Autowired
    private MerchantService merchantService;

    @RequestMapping({"", "/"})
    public String all(Model model) {
        model.addAttribute("merchants", merchantService.findAll());

        return "merchant/merchants";
    }

    @RequestMapping("/create")
    public String createMerchant() {
        return "merchant/createMerchant";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String addMerchant(@ModelAttribute Merchant merchant) {
        merchant.setLastSent(Date.valueOf(LocalDate.now().minusYears(1)));
        merchantService.save(merchant);
        return "redirect:/merchant/";
    }
}

