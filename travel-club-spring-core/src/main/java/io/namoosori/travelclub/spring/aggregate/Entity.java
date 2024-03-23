package io.namoosori.travelclub.spring.aggregate;

import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Getter//lombok annotation
@Setter
public abstract class Entity {//부모클래스, 즉 자식 클래스만 상속시킬수 있음.
	//
	protected String id;

	protected Entity() {
		//
		this.id = UUID.randomUUID().toString();//유틸 패키지의 uuid 클래스에서 랜덤하게 생성
	}

	protected Entity(String id) {
		//
		this.id = id;
	}
}
