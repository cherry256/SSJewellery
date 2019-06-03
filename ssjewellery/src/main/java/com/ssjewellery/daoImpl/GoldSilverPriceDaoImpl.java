package com.ssjewellery.daoImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ssjewellery.dao.GoldSilverPriceDao;
import com.ssjewellery.model.GoldAndSilverPrice;
import com.ssjewellery.repositories.GoldAndSilverPriceRepository;

@Component
public class GoldSilverPriceDaoImpl implements GoldSilverPriceDao {

	@Autowired
	GoldAndSilverPriceRepository goldAndSilverPriceRepository;
	
	@Override
	public Optional<GoldAndSilverPrice> getGSPrice(Long Id) {
		Optional<GoldAndSilverPrice> goldAndSilverPrice= goldAndSilverPriceRepository.findById(Id);
		return goldAndSilverPrice;
	}

}
