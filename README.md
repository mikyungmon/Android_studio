# Android_studio

✅ **Anroid studio**란 ?

![image](https://user-images.githubusercontent.com/66320010/128838634-539cc676-cc91-45e9-8d07-48c136b7c1ef.png)

- Android 앱 개발을 위한 공식 통합 개발 환경(IDE)

- IntelliJ IDEA 기반(pycharm과 동일)

- 장점 : 유연한 gradle 기반 빌드 시스템 / 에뮬레이터 / 모든 안드로이드 기기 지원 / C++ 및 NDK 지원 / 빠른 빌드

✅ Android build 과정

![image](https://user-images.githubusercontent.com/66320010/128839263-d55f8e8c-6124-4ec1-b164-561106d38bdf.png)

✅ Android studio 다운로드

https://developer.android.com/studio?gclid=CjwKCAiA9bmABhBbEiwASb35V3tPg0Tce1ZH7Q0QovJosMuivfdHRxBrphqqnZFFfcPd-T48OSyeaBoCRBAQAvD_BwE&gclsrc=aw.ds

✅ Android device를 연결 

![image](https://user-images.githubusercontent.com/66320010/128839842-c0361eda-ffe4-4491-b84f-0ad197fe4961.png)

 연결해도 No Devices라면 USB drive 설치

 설치해도 기기 명이 안뜬다면 Device 개발자 모드 설정(Device의 설정 -> 휴대폰 정보 -> 빌드모드(개발자 모드 관련 안내가 나올 때까지 연달아 터치) -> 설정에 개발자 옵션 항목이 있으면 성공)

![image](https://user-images.githubusercontent.com/66320010/128840414-95086605-40e4-4286-aa99-c3fe00643b28.png)

# Android Project

Android studio 프로젝트의 가장 큰 2개의 덩어리는 app 폴더와 Gradle Script 폴더이다.

우선 app 폴더에 대해 집중적으로 알아본다.

app 폴더를 보면 manifests, java, res 폴더로 이루어져 있다.

![image](https://user-images.githubusercontent.com/66320010/128841881-b3428885-fb91-45f0-bc16-900d66d88d35.png)

  - manifest : AndroidManifest.xml 파일을 포함한다. 안드로이드의 컨트롤 타워라고 보면된다. 안드로이드 어플리케이션을 구동하는데 필요한 설정값을 관리해주는 곳이다.
  
  - java : 클래스를 관리하는 폴더이다.
  
  - res : resource 폴더로 UI와 관련된 파일과 디자인 리소스, 문자열 리소스를 담고 있는 폴더이다. 모든 리소스(UI 문자열, 비트맵 이미지, XML 레이아웃 등)를 포함한다. 
  
  ➡ **안드로이드 어플리케이션 프로젝트 구조는 크게 manifest, java, resource, gradle 로 이루어져 있다.**
