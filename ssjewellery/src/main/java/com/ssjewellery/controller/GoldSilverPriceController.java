package com.ssjewellery.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ssjewellery.model.GoldAndSilverPrice;
import com.ssjewellery.service.GoldAndSilverPriceService;

@RestController
public class GoldSilverPriceController {

	@Autowired
	public GoldAndSilverPriceService goldAndSilverPriceService;
	
	@RequestMapping(value="/getGSPriceById/{GSPriceId}",method=RequestMethod.GET)
	public ResponseEntity<?> getGSPriceByID(@PathVariable("GSPriceId") Long Id){
		Optional<GoldAndSilverPrice> gsPriceByID=goldAndSilverPriceService.getGSPrice(Id);
		return new ResponseEntity<>(gsPriceByID,HttpStatus.OK);
	}
}
