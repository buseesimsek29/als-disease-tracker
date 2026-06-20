 ALS Hastalık Takip Sistemi

ALS hastalarının semptom takibi ve tedavi süreçlerinin dijital ortamda yönetilmesi için geliştirilmiş Spring Boot tabanlı bir web uygulamasıdır.

 Kullanılan Teknolojiler
- Backend: Java 17, Spring Boot
- Veritabanı: H2 Database
- ORM: Spring Data JPA
- Güvenlik: Spring Security (RBAC - Role Based Access Control)
- Mimari: Katmanlı Mimari (Controller, Service, Repository, Entity, DTO)

 Proje Yapısı
- Entity: Veritabanı tablolarını temsil eder.
- Repository: CRUD işlemleri için JPA kullanılır.
- Service: İş mantığı (Business Logic) burada yönetilir.
- Controller: HTTP isteklerini karşılar ve REST API sağlar.
- DTO: Veri transferi için kullanılır.
- Exception: Merkezi hata yönetimi sağlanmıştır.

Kurulum ve Çalıştırma
1. Repoyu bilgisayarınıza klonlayın.
2. IntelliJ IDEA ile projeyi açın.
3. `AlsDiseaseTrackerApplication` sınıfını çalıştırın.
4. Tarayıcınızdan `http://localhost:8080/index.html` adresine gidin.
5. Giriş bilgileri: **doctor / 1234**


<img width="1515" height="748" alt="image" src="https://github.com/user-attachments/assets/7c926c06-ec95-442e-b6f3-325868fb6c95" />

<img width="1531" height="720" alt="image" src="https://github.com/user-attachments/assets/401918e2-e16d-458f-92ee-d0210b0d545a" />

<img width="1533" height="721" alt="image" src="https://github.com/user-attachments/assets/2d0beca8-ab21-49ab-8e33-227a8ed4d496" />

<img width="1515" height="516" alt="image" src="https://github.com/user-attachments/assets/6b73826d-dc33-49c0-a413-9942c259c2be" />

