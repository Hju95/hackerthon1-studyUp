package com.kernel360.hackerthon.studyup;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// CommandLineRunner 인터페이스를 구현하도록 변경하면
// @Override 애노테이션을 사용하여 run(String... args) 메서드를 오버라이드 할 수 있음
public class StudyUpApplication implements CommandLineRunner {
	private final DataLoader dataLoader;

	public StudyUpApplication(DataLoader dataLoader) {
		this.dataLoader = dataLoader;
	}

	public static void main(String[] args) {
		SpringApplication.run(StudyUpApplication.class, args);
	}

	@Override
	public void run(String... args) throws InterruptedException {
		// 애플리케이션 시작 시 DataLoader를 호출하여 초기 데이터를 로드합니다.
		dataLoader.loadInitialData();
	}



}
