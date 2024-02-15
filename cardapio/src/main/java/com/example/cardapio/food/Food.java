package com.example.cardapio.food;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;





@Data
@Table(name = "foods")
@Entity(name = "foods")

@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
//REPRESENTA UMA TABELA NO BANCO DE DADOS

public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // LONG
    private String title;
    private String Image;
    private Integer price;
    private String nome;

    public Food(FoodRequestDTO data){
        
        this.Image = data.Image();
        this.price = data.price();
        this.title = data.title();
        this.nome = data.nome();
    }
}
