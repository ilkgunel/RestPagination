package com.ilkaygunel.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CHARACTERS")
public class Characters {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long characterId;
	
	@Column
	private String characterName;
	
	@Column
	private String characterSurname;

	public long getCharacterId() {
		return characterId;
	}

	public void setCharacterId(long characterId) {
		this.characterId = characterId;
	}

	public String getCharacterName() {
		return characterName;
	}

	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}

	public String getCharacterSurname() {
		return characterSurname;
	}

	public void setCharacterSurname(String characterSurname) {
		this.characterSurname = characterSurname;
	}
	
	
}
