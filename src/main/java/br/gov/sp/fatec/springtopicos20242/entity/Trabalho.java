package br.gov.sp.fatec.springtopicos20242.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tra_trabalho")
public class Trabalho {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long traId;

    @Column(nullable = false, unique = true, length = 100)
    private String traTitulo;

    @Column(nullable = false)
    private LocalDateTime traDataHoraEntrega;

    @Column(length = 200)
    private String traDescricao;

    @Column(nullable = false, length = 20)
    private String traGrupo;

    private Integer traNota;

    @Column(length = 100)
    private String traJustificativa;

    // Getters e Setters

    public Long getTraId() {
        return traId;
    }

    public void setTraId(Long traId) {
        this.traId = traId;
    }

    public String getTraTitulo() {
        return traTitulo;
    }

    public void setTraTitulo(String traTitulo) {
        this.traTitulo = traTitulo;
    }

    public LocalDateTime getTraDataHoraEntrega() {
        return traDataHoraEntrega;
    }

    public void setTraDataHoraEntrega(LocalDateTime traDataHoraEntrega) {
        this.traDataHoraEntrega = traDataHoraEntrega;
    }

    public String getTraDescricao() {
        return traDescricao;
    }

    public void setTraDescricao(String traDescricao) {
        this.traDescricao = traDescricao;
    }

    public String getTraGrupo() {
        return traGrupo;
    }

    public void setTraGrupo(String traGrupo) {
        this.traGrupo = traGrupo;
    }

    public Integer getTraNota() {
        return traNota;
    }

    public void setTraNota(Integer traNota) {
        this.traNota = traNota;
    }

    public String getTraJustificativa() {
        return traJustificativa;
    }

    public void setTraJustificativa(String traJustificativa) {
        this.traJustificativa = traJustificativa;
    }
}
