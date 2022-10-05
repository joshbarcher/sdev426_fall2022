package edu.greenriver.sdev.clothingstore.database;

//this file defines a data layer with access to Clothing records

import edu.greenriver.sdev.clothingstore.model.Clothing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//JpaRepository adds all CRUD methods for interacting with Clothing records
@Repository
public interface ClothingRepository extends JpaRepository<Clothing, Integer>
{
}
