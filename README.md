# Chat API

이 프로젝트는 **Spring AI 활용 실습을 위한 웹 백엔드**입니다.

## 📌 설치 및 실행

### 1️⃣ 리포지토리 클론 및 이동
```bash
git clone https://github.com/revfactory/chat-api.git
cd chat-api
```

### 2️⃣ 환경 변수 설정 (아래 방법들중 하나 선택)
- IDE를 사용하는 경우 IDE 설정을 통해 환경 변수를 설정할 수 있습니다.

  <img width="290" alt="Image" src="https://github.com/user-attachments/assets/7d1dfc24-8f77-476f-a86e-e3de474ffa93" />
  Edit Configurations... 선택
  <img width="788" alt="Image" src="https://github.com/user-attachments/assets/63ccf615-cd3f-4a1e-9d9e-a35b47134aa9" />
  Modify Options 선택
  <img width="1066" alt="Image" src="https://github.com/user-attachments/assets/c8bb1a72-ea7a-43db-a186-a55099f9e1a9" />
  Environment Variables 선택
  <img width="791" alt="Image" src="https://github.com/user-attachments/assets/74d5897f-530b-4f2b-a4fc-2fcc3973e0e2" />
  Environment Variables 에 입력 (예: OPENAI_API_KEY=your_openai_api_key;PLACE_API_KEY=your_place_api_key)

- 리눅스/macOS 환경에서는 다음과 같이 설정할 수도 있습니다.
```bash
export OPENAI_API_KEY=your_openai_api_key
export PLACE_API_KEY=your_place_api_key
```

- Windows 환경에서는 `set` 명령어를 사용하세요.
```cmd
set OPENAI_API_KEY=your_openai_api_key
set PLACE_API_KEY=your_place_api_key
```

### 3️⃣ 빌드 및 실행
위 2번 환경 변수 설정을 IDE에서 한 경우 IDE에서 실행하면 됩니다.(⌃⇧R)

환경 변수 설정을 터미널에서 한 경우는 다음 명령어를 실행하세요.
```bash
./gradlew bootRun
```

애플리케이션이 기본적으로 `http://localhost:8080`에서 실행됩니다.
