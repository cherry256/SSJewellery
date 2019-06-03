package com.ssjewellery.service;

import java.util.Optional;

import com.ssjewellery.model.GoldAndSilverPrice;


public interface GoldAndSilverPriceService {

	public Optional<GoldAndSilverPrice> getGSPrice(Long Id);
}
