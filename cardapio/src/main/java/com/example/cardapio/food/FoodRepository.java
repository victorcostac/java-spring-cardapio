package com.example.cardapio.food;

import org.springframework.data.jpa.repository.JpaRepository;

//DEFINE A INTERFACE PARA ACESSAR O BANCO DE DADOS
public interface FoodRepository extends JpaRepository<Food, Long>{ //Long

}