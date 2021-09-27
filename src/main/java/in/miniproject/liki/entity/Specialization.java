package in.miniproject.liki.entity;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Specialization Tab")

public class Specialization {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
	
@Column(name="spec_id_col") 
private long id;

@Column(name="spec_code_col") 
private String speccode;

@Column(name="spec_name_col") 
private String specName;

@Column(name="spec_note_col") 
private String specnote;


	}

