package com.ssjewellery.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssjewellery.dao.GoldSilverPriceDao;
import com.ssjewellery.model.GoldAndSilverPrice;
import com.ssjewellery.service.GoldAndSilverPriceService;

@Service
public class GoldSilverPriceServiceImpl implements GoldAndSilverPriceService {

	@Autowired
	private GoldSilverPriceDao goldSilverPriceDao;

	@Override
	public Optional<GoldAndSilverPrice>  getGSPrice(Long Id) {
		Optional<GoldAndSilverPrice> GoldAndSilverPrice=goldSilverPriceDao.getGSPrice(Id);
		
		return GoldAndSilverPrice;
	}
	
	
}
