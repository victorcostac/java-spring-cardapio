package com.example.cardapio.food;

public record FoodResponseDTO( Long id,String title, String image,Integer price, String nome) { //Long

    public FoodResponseDTO(Food food){
        this(food.getId(),food.getTitle(), food.getImage(), food.getPrice(), food.getNome());
    } 
}
