package com.vgdemo.demo.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "BAGLANTI")
public class Baglantı {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int baglanti_id;

    @ManyToMany
    @JoinTable(
            name="baglanti_id",
            joinColumns=@JoinColumn(name="kullanici_id1"),
            inverseJoinColumns = @JoinColumn(name = "baglanti_id")
    )
    private Kullanici kullanici_1;

    @ManyToMany
    @JoinTable(
            name="baglanti_id",
            joinColumns=@JoinColumn(name="kullanici_id2"),
            inverseJoinColumns = @JoinColumn(name = "baglanti_id")
    )
    private Kullanici kullanici_2;

    private String baglantı_tarihi;

}
