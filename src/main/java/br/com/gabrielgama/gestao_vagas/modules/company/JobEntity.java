package br.com.gabrielgama.gestao_vagas.modules.company;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import br.com.gabrielgama.gestao_vagas.modules.company.entities.CompanyEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity(name = "job")
public class JobEntity {
  
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  private UUID id;

  private String description;
  private String benefits;
  private String level;

  @ManyToOne()
  @JoinColumn(name="company_id", insertable = false, updatable = false)
  private CompanyEntity companyEntity;

  @CreationTimestamp
  private LocalDateTime createdAt;
}
