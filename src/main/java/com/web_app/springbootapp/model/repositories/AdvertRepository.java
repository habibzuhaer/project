package com.web_app.springbootapp.model.repositories;

import com.web_app.springbootapp.model.entities.Advert;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AdvertRepository extends JpaRepository<Advert, Long> {


}

