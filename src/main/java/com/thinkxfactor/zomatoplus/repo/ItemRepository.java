package com.thinkxfactor.zomatoplus.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thinkxfactor.zomatoplus.models.Items;

public interface ItemRepository extends JpaRepository<Items, Long> {

	List<Items> findAllByRestaurantId(Long restId);

		
}
