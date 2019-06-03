package com.ssjewellery.dao;

import java.util.Optional;

import com.ssjewellery.model.GoldAndSilverPrice;

public interface GoldSilverPriceDao {

	public abstract Optional<GoldAndSilverPrice>  getGSPrice(Long Id);
}
