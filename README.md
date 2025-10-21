# KİŞİLER UYGULAMASI (REST API)

Bu proje, modern Android geliştirme prensipleri kullanılarak geliştirilmiş bir **rehber (kişiler) uygulamasıdır**.
Kullanıcılar kişileri kaydedebilir, görüntüleyebilir, güncelleyebilir, silebilir ve arama yapabilir.

Uygulama, **MVVM (Model-View-ViewModel)** mimarisi ile yazılmış olup **Kotlin** dilinde geliştirilmiştir.
Veri işlemleri, **Retrofit** kütüphanesi kullanılarak uzak bir sunucuda çalışan **RESTful API** üzerinden gerçekleştirilmektedir. Bağımlılık yönetimi için **Hilt** kullanılmıştır.

## Özellikler

- Kişi ekleme
- Kişi listeleme
- Kişi güncelleme
- Kişi silme
- İsimle arama yapma

## Kullanılan Teknolojiler

- **Kotlin:** Uygulamanın ana dili
- **MVVM Mimarisi:** Veri ve kullanıcı arayüzü ayrımı
- **Retrofit:** REST API istemcisi
- **Gson:** JSON verilerini parse etmek için
- **Hilt (Dagger):** Bağımlılık enjeksiyonu
- **Android Jetpack Bileşenleri:**
  - `ViewModel`
  - `LiveData`
  - `Navigation Component`
- **Coroutines:** Asenkron işlemler
- **ViewBinding:** XML view’larına güvenli erişim

## Mimari Yapı

Proje, Google’ın önerdiği katmanlı mimariye uygundur:

- **UI Katmanı (Fragments):**
  `AnasayfaFragment`, `KisiKayitFragment`, `KisiDetayFragment`
  → Kullanıcı etkileşimlerini alır ve ViewModel’e iletir.

- **ViewModel Katmanı:**
  `AnasayfaViewModel`, `KisiKayitViewModel`, `KisiDetayViewModel`
  → UI için verileri hazırlar ve durumu yönetir.

- **Repository Katmanı:**
  `KisilerRepository`
  → Verilerin hangi kaynaktan alınacağını belirler.

- **Data Katmanı (DataSource & Retrofit):**
  `KisilerDataSource` ve Retrofit servisleri
  → CRUD işlemleri, uzak sunucudaki API'ye yapılan HTTP istekleri ile gerçekleştirilir.

## Kurulum ve Çalıştırma

```bash
git clone https://github.com/abdurrahmansagir21/KisilerUygulamasiRestAPI.git
```

1.  Uygulamanın çalışabilmesi için REST API'nin (backend) aktif olması gerekmektedir.
2.  Projeyi Android Studio’da açın.
3.  Gradle bağımlılıklarının yüklenmesini bekleyin.
4.  Emülatörde veya cihazda çalıştırın.

## Ekran Görüntüleri

<p align="center">
  <img width="250" src="https://github.com/user-attachments/assets/f6514e7d-e0f4-4108-9c34-fa2e64d9e8b5" />
  <img width="250" src="https://github.com/user-attachments/assets/0a2a2db0-6069-4c39-a449-2cc7f80e5e64" />
  <img width="250" src="https://github.com/user-attachments/assets/56337bd8-5695-401e-af32-0d56e2c8b19c" />
</p>

---

# CONTACTS APP (REST API)

This project is a **Contacts (Phonebook) App** developed using modern Android development principles.
Users can add, view, update, delete, and search for contacts.

The app follows the **MVVM (Model-View-ViewModel)** architecture and is written in **Kotlin**.
It uses the **Retrofit** library to communicate with a remote **RESTful API** for data operations and **Hilt** for dependency injection.

## Features

- Add new contacts
- List all contacts
- Update existing contacts
- Delete contacts
- Search by name

## Technologies Used

- **Kotlin:** Main programming language
- **MVVM Architecture:** Separation of UI and business logic
- **Retrofit:** HTTP client for the REST API
- **Gson:** For parsing JSON data
- **Hilt (Dagger):** Dependency injection
- **Android Jetpack Components:**
  - `ViewModel`
  - `LiveData`
  - `Navigation Component`
- **Coroutines:** For asynchronous operations
- **ViewBinding:** Safe access to XML views

## Architecture Overview

The project follows a clean, layered architecture:

- **UI Layer (Fragments):**
  `AnasayfaFragment`, `KisiKayitFragment`, `KisiDetayFragment`
  → Handles user interactions and communicates with the ViewModel.

- **ViewModel Layer:**
  `AnasayfaViewModel`, `KisiKayitViewModel`, `KisiDetayViewModel`
  → Prepares and manages data for the UI.

- **Repository Layer:**
  `KisilerRepository`
  → Central data management and data source selection.

- **Data Layer (DataSource & Retrofit):**
  `KisilerDataSource` and Retrofit services
  → Handles CRUD operations by making HTTP requests to the remote API.

## Installation and Run

```bash
git clone https://github.com/abdurrahmansagir21/KisilerUygulamasiRestAPI.git
```

1.  For the application to work, the REST API (backend) must be running.
2.  Open the project in Android Studio.
3.  Wait for Gradle dependencies to sync.
4.  Run the app on an emulator or a physical device.

## Screenshots

<p align="center">
  <img width="250" src="https://github.com/user-attachments/assets/f6514e7d-e0f4-4108-9c34-fa2e64d9e8b5" />
  <img width="250" src="https://github.com/user-attachments/assets/0a2a2db0-6069-4c39-a449-2cc7f80e5e64" />
  <img width="250" src="https://github.com/user-attachments/assets/56337bd8-5695-401e-af32-0d56e2c8b19c" />
</p>
