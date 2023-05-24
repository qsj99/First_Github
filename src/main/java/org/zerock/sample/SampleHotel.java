package org.zerock.sample;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Component
@ToString
@Getter
//@AllArgsConstructor  인스턴스 변수로 선언된 모든 것을 파라미터로 받는 생성자를 작성하게 됨 
@RequiredArgsConstructor //특정 변수에 대해서만 생성자 작성하고 싶다면 이거랑 @NonNull 작성
public class SampleHotel {
	
	@NonNull
	private Chef chef;
	private int age;

//	public SampleHotel(Chef chef) {
//		this.chef = chef;
//	}

}
