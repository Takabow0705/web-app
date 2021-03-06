package app.component.repository.product;


import app.commons.entities.products.StockMaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StockMasterRepository extends JpaRepository<StockMaster,Long> {

    @Query("select s from StockMaster s where :from <= s.stockCode and :to >= s.stockCode ")
    public List<StockMaster> findAllBy(@Param("from") Long from, @Param("to") Long to);
}

