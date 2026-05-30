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
